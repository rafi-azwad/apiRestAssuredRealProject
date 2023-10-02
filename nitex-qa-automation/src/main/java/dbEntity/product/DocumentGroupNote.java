package dbEntity.product;

import dbEntity.document.DocumentGroup;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "document_group_note" )
@IdClass( DocumentGroupNoteId.class )
public class DocumentGroupNote implements Cloneable {

    @Id
    @Column( name = "document_group" )
    private DocumentGroup documentGroup;

    @Id
    @Column( name = "product_id" )
    private Long productId;

    @Column( name = "note", columnDefinition = "TEXT" )
    private String note;

    @Override
    public DocumentGroupNote clone() {
        DocumentGroupNote documentGroupNote = new DocumentGroupNote();
        documentGroupNote.setNote( this.note );
        documentGroupNote.setDocumentGroup( documentGroup );
        return documentGroupNote;
    }
}
