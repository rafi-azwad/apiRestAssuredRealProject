package dbEntity.document;

import dbEntity.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.Objects;

@Data
@Entity
@Table( name = "document" )
public class Document implements Cloneable{

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "document_sequence_generator")
    @SequenceGenerator( name="document_sequence_generator", sequenceName = "document_sequence", initialValue = 1 )
    @Column( name = "id" )
    private Long id;

    @Column( name = "base_directory", length = 500 )
    private String baseDirectory;

    @Column( name = "sub_directory", length = 500 )
    private String subDirectory;

    @NotNull
    @Column( name = "name", length = 200 )
    private String name;

    @Column( name = "note" )
    private String note;

    @Column( name = "path", length = 2000 )
    private String path;

    @Column( name = "document_type" )
    private DocumentType documentType;

    @Column( name = "document_group" )
    private DocumentGroup documentGroup;

    @Column( name = "print")
    private Boolean print;

    @Column( name = "date_added" )
    private Date dateAdded;

    @ToString.Exclude
    @JoinColumn( name = "added_by", foreignKey = @ForeignKey( name = "document_user_id_fk") )
    @OneToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE} , fetch = FetchType.LAZY )
    private User addedBy;

    @Column( name = "file_format", length = 255 )
    private String fileFormat;

    @Column( name = "is_scaled" )
    private Boolean isScaled;

    @Column( name = "is_generated_from_pdf" )
    private Boolean isGeneratedFromPDF = false;

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Document that = ( Document ) o;
        return id != null && id.equals( that.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash(id);
    }
}
