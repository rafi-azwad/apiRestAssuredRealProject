package dbEntity.supplier;

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
@Table( name = "supplier_document_map" )
@IdClass( SupplierDocumentId.class )
public class SupplierDocumentMap {

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "supplier_document_map_supplier_id_fk" ) )
    private Supplier supplier;

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "document_id", foreignKey = @ForeignKey( name = "supplier_document_map_document_id_fk" ) )
    private Document document;

    @Column( name = "is_used", columnDefinition = "boolean default false")
    private Boolean isUsed = false;

    @Column( name = "is_pinned", columnDefinition = "boolean default false" )
    private Boolean isPinned = false;

    public SupplierDocumentMap( Supplier supplier, Document document ){
        this.supplier = supplier;
        this.document = document;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierDocumentMap that = (SupplierDocumentMap) o;
        return Objects.equals( supplier.getId(), that.supplier.getId() ) && Objects.equals( document.getId(), that.document.getId() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( supplier.getId(), document.getId() );
    }
}
