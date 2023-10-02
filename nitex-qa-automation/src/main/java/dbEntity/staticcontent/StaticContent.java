package dbEntity.staticcontent;

import dbEntity.document.Document;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "static_content" )
public class StaticContent {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "static_content_sequence_generator" )
    @SequenceGenerator( name = "static_content_sequence_generator", sequenceName = "static_content_sequence" )
    private Long id;

    @Column( name = "content_type" )
    private ContentType contentType;

    @Column( name = "start_time" )
    private Long startTime;

    @Column( name = "end_time" )
    private Long endTime;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "document_id", foreignKey = @ForeignKey( name = "fk_static_content_document_id" ) )
    private Document document;

}
