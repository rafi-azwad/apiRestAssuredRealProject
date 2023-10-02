package dbEntity.collection;

import dbEntity.audit.AuditableEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "presentation" )
public class Presentation extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "presentation_sequence_generator" )
    @SequenceGenerator( name = "presentation_sequence_generator", sequenceName = "presentation_sequence" )
    private Long id;

    @Column( name = "collection_id" )
    private Long collectionId;

    @Column( name = "path" )
    private String path;
}
