package dbEntity.costing;

import dbEntity.enums.Status;
import dbEntity.product.Product;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

@Data
@Entity
@Table( name = "quantity_wise_initial_costing" )
public class QuantityWiseInitialCosting implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "quantity_wise_initial_costing_sequence_generator")
    @SequenceGenerator( name="quantity_wise_initial_costing_sequence_generator", sequenceName = "quantity_wise_initial_costing_pricing_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "min_quantity" )
    private Integer minQuantity;

    @Column( name = "max_quantity" )
    private Integer maxQuantity;

    @Column( name = "price" )
    private Double price;

    @Column( name = "target_price" )
    private Double targetPrice;

    @Column( name = "margin" )
    private Double margin;

    @Column( name = "admin_offer_price" )
    private Double adminOfferPrice;

    @Column( name = "buyer_offer_price" )
    private Double buyerOfferPrice;

    @Column( name = "remarks", columnDefinition = "TEXT" )
    private String remarks;

    @Column( name = "is_base_price_row" )
    private Boolean isBasePriceRow = false;

    @Column( name = "is_admin_offer_price_updated" )
    private Boolean isAdminOfferPriceUpdated = false;

    @Column( name = "status" )
    private Status status = Status.INITIALIZED;

    @Column( name = "target_price_update_history_json", columnDefinition = "TEXT" )
    private String targetPriceUpdateHistoryJson;

    @Column( name = "base_price_update_history_json", columnDefinition = "TEXT" )
    private String basePriceUpdateHistoryJson;

    @Column( name = "margin_update_history_json", columnDefinition = "TEXT" )
    private String marginUpdateHistoryJson;

    @Column( name = "admin_offer_price_update_history_json", columnDefinition = "TEXT" )
    private String adminOfferPriceUpdateHistoryJson;

    @Column( name = "buyer_offer_price_update_history_json", columnDefinition = "TEXT" )
    private String buyerOfferPriceUpdateHistoryJson;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "initial_costing", foreignKey = @ForeignKey( name = "quantity_wise_initial_costing_initial_costing_id_fk") )
    private InitialCosting initialCosting;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "quantity_wise_initial_costing_product_id_fk") )
    private Product product;

    @Override
    public QuantityWiseInitialCosting clone() {

        QuantityWiseInitialCosting quantityWiseInitialCosting = new QuantityWiseInitialCosting();
        BeanUtils.copyProperties( this, quantityWiseInitialCosting );
        quantityWiseInitialCosting.setId( null );
        quantityWiseInitialCosting.setProduct( null );
        quantityWiseInitialCosting.setInitialCosting( null );
        return quantityWiseInitialCosting;
    }
}
