package dbEntity.materials;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "construction" )
public class Construction {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "construction_sequence_generator" )
    @SequenceGenerator( name = "construction_sequence_generator", sequenceName = "construction_sequence" , initialValue = 1000 )
    @Column( name = "id", nullable = false )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "fabric_type" )
    private FabricType fabricType;

    @Column( name = "short_code" )
    private String shortCode;
}
