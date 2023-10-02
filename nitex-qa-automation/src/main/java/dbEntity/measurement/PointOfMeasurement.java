package dbEntity.measurement;

import dbEntity.document.Document;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(
        name = "point_of_measurement" ,
        indexes = @Index( name="index__point_of_measurement__is_library", columnList = "is_library" )
)
public class PointOfMeasurement implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "point_of_measurement_sequence_generator")
    @SequenceGenerator( name = "point_of_measurement_sequence_generator", sequenceName = "point_of_measurement_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "remarks" )
    private String remarks;

    @Column( name = "is_library", columnDefinition = "boolean default false" )
    private Boolean isLibrary = true;

    @Column( name = "is_deleted", columnDefinition = "boolean default false" )
    private Boolean isDeleted = false;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "library_pom_id", foreignKey = @ForeignKey( name = "fk_product_measurement_library_pom_id" ) )
    private PointOfMeasurement libraryPOM;

    @EqualsAndHashCode.Exclude
    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "pom_doc_id", foreignKey = @ForeignKey( name = "fk_point_of_measurement_doc_id" ) )
    private Document document;

    @EqualsAndHashCode.Exclude
    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "pom_category_id", foreignKey = @ForeignKey( name = "fk_point_of_measurement_pom_category_id" ) )
    private PointOfMeasurementCategory category;
}
