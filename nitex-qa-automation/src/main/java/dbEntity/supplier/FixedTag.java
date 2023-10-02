package dbEntity.supplier;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "fixed_tag" )
public class FixedTag {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "fixed_tag_sequence_generator" )
    @SequenceGenerator( name = "fixed_tag_sequence_generator", sequenceName = "fixed_tag_sequence" )
    private Long id;

    @Column( name = "text" )
    private String text;

    @Column( name = "type" )
    private TagType type;
}
