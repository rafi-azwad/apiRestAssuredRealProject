package dbEntity.measurement;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table( name = "product_measurement_ordering_template" )
public class ProductMeasurementOrderingTemplate {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "product_measurement_ordering_template_sequence_generator")
    @SequenceGenerator( name="product_measurement_ordering_template_sequence_generator", sequenceName = "product_measurement_ordering_template_sequence" , allocationSize = 1 )
    private Long id;

    @Column( name = "grade" )
    private Double grade;

    @Column( name = "serial"  )
    private Long serial = 0L;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY , cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinColumn( name = "point_of_measurement_id", foreignKey = @ForeignKey( name = "fk_product_measurement_ordering_template_point_of_measurement_id" ) )
    private PointOfMeasurement pointOfMeasurement;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinColumn( name = "product_measurement_template_basic_info", foreignKey = @ForeignKey( name = "fk_product_measurement_ordering_template_basic_info_id" ) )
    private ProductMeasurementTemplateBasicInfo templateBasicInfo;
}
