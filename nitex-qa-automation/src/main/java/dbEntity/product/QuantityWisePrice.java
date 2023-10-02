package dbEntity.product;

import dbEntity.payment.Currency;
import dbEntity.rfq.PriceType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;

@Data
@Entity
@DynamicUpdate
@Table( name = "quanity_wise_price" )
public class QuantityWisePrice {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "quantity_wise_pricing_sequence_generator")
    @SequenceGenerator( name="quantity_wise_pricing_sequence_generator", sequenceName = "quantity_wise_pricing_sequence", initialValue = 1 )
    @Column( name = "id" )
    private Long id;

    @Column( name = "min_quantity" )
    private Integer minQuantity;

    @Column( name = "max_quantity" )
    private Integer maxQuantity;

    @Column( name = "price" )
    private BigDecimal price;

    @Column( name = "currency" )
    private Currency currency;

    @Column( name = "price_type" )
    private PriceType priceType;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST} )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "quantity_wise_price_product_id_fk") )
    private Product product;
}
