package dbEntity.materials;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table( name = "fiber_composition_part" )
public class FabricCompositionPart {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "fiber_composition_part_sequence_generator" )
    @SequenceGenerator( name = "fiber_composition_part_sequence_generator", sequenceName = "fiber_composition_part_sequence",initialValue = 15000 )
    @Column( name = "id", nullable = false )
    private Long id;

    @Column( name = "percentage" , nullable = false )
    private Double percentage = 0d;

    @Column( name = "fiber_name" )
    private String fiberName;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PartDTO {
        private Long id;
        private Double percentage;
        private String fiberName;

        public static PartDTO build( Double percentage, String fiberName ) {
            PartDTO partDTO = new PartDTO();
            partDTO.setPercentage( percentage );
            partDTO.setFiberName( fiberName );
            return partDTO;
        }
    }
}
