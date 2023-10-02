package dbEntity.materials;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "fiber" )
public class Fiber {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "fiber_sequence_generator" )
    @SequenceGenerator( name = "fiber_sequence_generator", sequenceName = "fiber_sequence", initialValue = 1000 )
    @Column( name = "id", nullable = false )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "composition_type" )
    private MaterialComposition materialCompositionType;

    @Column( name = "short_code" )
    private String shortCode;


}
