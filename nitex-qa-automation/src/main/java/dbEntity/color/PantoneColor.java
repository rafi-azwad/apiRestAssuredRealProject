package dbEntity.color;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table( name ="pantone_color" )
public class PantoneColor {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "pantone_color_sequence_generator")
    @SequenceGenerator( name="pantone_color_sequence_generator", sequenceName = "pantone_color_sequence", initialValue = 3651 )
    @Column( name = "id" )
    private Long id;

    @NotNull
    @Column( name = "name", length = 100 )
    private String name;

    @NotNull
    @Column( name = "pantone_code", length = 15 )
    private String code;

    @NotNull
    @Column( name = "hex_code", length = 10 )
    private String hexCode;
}
