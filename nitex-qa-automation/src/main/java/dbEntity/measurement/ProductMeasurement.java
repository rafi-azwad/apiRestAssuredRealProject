package dbEntity.measurement;

import dbEntity.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "product_measurement" )
public class ProductMeasurement implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "product_measurement_sequence_generator")
    @SequenceGenerator( name="product_measurement_sequence_generator", sequenceName = "product_measurement_sequence" )
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
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "fk_product_measurement_product_id" ) )
    private Product product;

    @Override
    public ProductMeasurement clone() {

        ProductMeasurement productMeasurement = new ProductMeasurement();
        BeanUtils.copyProperties( this, productMeasurement );
        productMeasurement.setId( null );
        productMeasurement.setProduct( null );
        return productMeasurement;
    }
    public ProductMeasurement( Product product,  PointOfMeasurement pointOfMeasurement, boolean isToleranceColumn ) {
        this.product = product;
        this.pointOfMeasurement = pointOfMeasurement;
        this.isToleranceColumn = isToleranceColumn;
    }
}
