package dbEntity.measurement;

import dbEntity.product.Product;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

@Data
@Entity
@Table( name = "product_measurement_ordering" )
public class ProductMeasurementOrdering {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "product_measurement_ordering_sequence_generator")
    @SequenceGenerator( name="product_measurement_ordering_sequence_generator", sequenceName = "product_measurement_ordering_sequence" )
    private Long id;

    @Column( name = "grade" )
    private Double grade;

    @Column( name = "serial"  )
    private Long serial = 0L;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY , cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "fk_product_measurement_ordering_product_id" ) )
    private Product product;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY , cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinColumn( name = "point_of_measurement_id", foreignKey = @ForeignKey( name = "fk_product_measurement_ordering_point_of_measurement_id" ) )
    private PointOfMeasurement pointOfMeasurement;

    @Override
    public ProductMeasurementOrdering clone(){
        ProductMeasurementOrdering measurementOrdering = new ProductMeasurementOrdering();
        BeanUtils.copyProperties( this, measurementOrdering );
        measurementOrdering.setId( null );
        return measurementOrdering;
    }
}
