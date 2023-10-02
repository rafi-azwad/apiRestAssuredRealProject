package dbEntity.costing;

import dbEntity.audit.AuditableEntity;
import dbEntity.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
@Entity
@Table( name = "quantity_wise_costing_sheet" )
public class QuantityWiseCostingSheetPrice extends AuditableEntity implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "quantity_wise_costing_sheet_sequence_generator" )
    @SequenceGenerator( name = "quantity_wise_costing_sheet_sequence_generator", sequenceName = "quantity_wise_costing_sheet_sequence" )
    private Long id;

    @Column( name = "quantity" )
    private Integer quantity;

    @Column( name = "target_price" )
    private Double targetPrice;

    @Column( name = "base_price" )
    private Double basePrice;

    @Column( name = "margin" )
    private Double margin;

    @Column( name = "offer_price" )
    private Double offerPrice;

    @Column( name = "status" )
    private Status status = Status.INITIALIZED;

    @Column( name = "offer_status" )
    private Status offerStatus = Status.PENDING;

    @Column( name = "target_price_update_history_json", columnDefinition = "TEXT" )
    private String targetPriceUpdateHistoryJson;

    @Column( name = "base_price_update_history_json", columnDefinition = "TEXT" )
    private String basePriceUpdateHistoryJson;

    @Column( name = "margin_update_history_json", columnDefinition = "TEXT" )
    private String marginUpdateHistoryJson;

    @Column( name = "offer_price_update_history_json", columnDefinition = "TEXT" )
    private String offerPriceUpdateHistoryJson;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "costing_sheet_id", foreignKey = @ForeignKey( name = "fk_quantity_wise_costing_sheet_costing_sheet_id" ) )
    private CostingSheet costingSheet;

    public QuantityWiseCostingSheetPrice clone() {

        QuantityWiseCostingSheetPrice quantityWiseCostingSheetPrice = new QuantityWiseCostingSheetPrice();
        BeanUtils.copyProperties( this, quantityWiseCostingSheetPrice );
        quantityWiseCostingSheetPrice.setId( null );
        quantityWiseCostingSheetPrice.setCostingSheet( null );
        return quantityWiseCostingSheetPrice;
    }
}
