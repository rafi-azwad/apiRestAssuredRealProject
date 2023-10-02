package dbEntity.measurement;

import dbEntity.enums.ParentCatergory;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table( name = "point_of_measurement_category" )
public class PointOfMeasurementCategory {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "point_of_measurement_category_sequence_generator")
    @SequenceGenerator( name = "point_of_measurement_category_sequence_generator", sequenceName = "point_of_measurement_category_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "point_type" )
    private PointType pointType;

    @Enumerated
    @ElementCollection( targetClass = ParentCatergory.class )
    @JoinTable(
            name = "pom_category_parent_category_map",
            joinColumns = @JoinColumn( name = "pom_category_id" )
    )
    Set<ParentCatergory> parentCategorySet = new HashSet<>();
}
