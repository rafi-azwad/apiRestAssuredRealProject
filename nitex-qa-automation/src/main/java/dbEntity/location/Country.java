package dbEntity.location;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "country" )
public class Country {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "country_sequence_generator" )
    @SequenceGenerator( name = "country_sequence_generator", sequenceName = "country_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "code" )
    private String code;

    @Column( name = "has_nitex_operation" )
    private Boolean hasNitexOperation;
}
