package dbEntity.measurement;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table( name = "product_measurement_template" )
public class ProductMeasurementTemplate {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "product_measurement_template_sequence_generator")
    @SequenceGenerator( name="product_measurement_template_sequence_generator", sequenceName = "product_measurement_template_sequence" )
    private Long id;

    @Column( name = "unit" )
    private MeasurementUnit unit = MeasurementUnit.CM;

    @Column( name = "size" )
    private Size size;

    @Column( name = "tolerance" )
    private Double tolerance;

    @Column( name = "value" )
    private Double value;

    @Column( name = "is_tolerance_column" )
    private Boolean isToleranceColumn = false;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "point_of_measurement_id", foreignKey = @ForeignKey( name = "fk_product_measurement_point_of_measurement_id" ) )
    private PointOfMeasurement pointOfMeasurement;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_measurement_template_basic_info", foreignKey = @ForeignKey( name = "fk_product_measurement_template_basic_info_id" ) )
    private ProductMeasurementTemplateBasicInfo templateBasicInfo;
}
