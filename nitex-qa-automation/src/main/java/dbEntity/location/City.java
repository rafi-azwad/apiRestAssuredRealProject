package dbEntity.location;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "city" )
public class City {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "city_sequence_generator" )
    @SequenceGenerator( name = "city_sequence_generator", sequenceName = "city_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "country_id", foreignKey = @ForeignKey( name = "fk_city_country_id" ) )
    private Country country;
}
