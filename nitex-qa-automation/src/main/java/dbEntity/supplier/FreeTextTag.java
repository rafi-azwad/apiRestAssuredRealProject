package dbEntity.supplier;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "free_text_tag" )
public class FreeTextTag {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "free_text_tag_sequence_generator" )
    @SequenceGenerator( name = "free_text_tag_sequence_generator", sequenceName = "free_text_tag_sequence" )
    private Long id;

    @Column( name = "text" )
    private String text;

    @Column( name = "type" )
    private TagType type;

    @Column( name = "key" )
    private String key;
}
