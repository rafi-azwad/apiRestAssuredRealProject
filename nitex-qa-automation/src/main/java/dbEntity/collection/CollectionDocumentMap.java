package dbEntity.collection;

import dbEntity.document.Document;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table( name = "collection_document_map" )
@IdClass( CollectionDocumentId.class )
public class CollectionDocumentMap {
    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "collection_id", foreignKey = @ForeignKey( name = "collection_document_map_collection_id_fk" ) )
    private Collection collection;

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "document_id", foreignKey = @ForeignKey( name = "collection_document_map_document_id_fk" ) )
    private Document document;

    @Column( name = "is_used", columnDefinition = "boolean default false")
    private Boolean isUsed = false;

    @Column( name = "is_pinned", columnDefinition = "boolean default false" )
    private Boolean isPinned = false;

    public CollectionDocumentMap( Collection collection, Document document ){
        this.collection = collection;
        this.document = document;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionDocumentMap that = (CollectionDocumentMap) o;
        return Objects.equals( collection.getId(), that.collection.getId() ) && Objects.equals( document.getId(), that.document.getId() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( collection.getId(), document.getId() );
    }
}
