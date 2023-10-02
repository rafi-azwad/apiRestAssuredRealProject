package dbEntity.salescontract;

import dbEntity.audit.AuditableEntity;
import dbEntity.rfq.PriceType;
import dbEntity.rfq.ProductInfoForRfq;
import dbEntity.rfq.QuotationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table( name = "supplier_quote" )
public class SupplierQuote extends AuditableEntity implements Serializable {

    @Id
    private Long id;

    @Column( name = "price_type" )
    private PriceType priceType;

    @Column( name = "factory_handover_date" )
    private LocalDate factoryHandoverDate;

    @Column( name = "delivery_date" )
    private LocalDate deliveryDate;

    @Column( name = "etd_revision_count" )
    private Integer etdRevisionCount;

    @Column( name = "old_etd_history_json" )
    private String oldEtdHistoryJson;

    @Column( name = "factory_quotation_type" )
    private QuotationType factoryQuotationType;

    @Column( name = "design_wise_price" )
    private BigDecimal designWisePrice;

    @Column( name = "size_wise_price_json", columnDefinition = "TEXT" )
    private String sizeWisePriceJson;

    @Column( name = "color_wise_price_json", columnDefinition = "TEXT" )
    private String colorWisePriceJson;

    @Column( name = "production_cost" )
    private BigDecimal productionCost;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_info_for_rfq_id", foreignKey = @ForeignKey( name = "fk_supplier_quote_product_info_for_rfq_id" ) )
    private ProductInfoForRfq productInfoForRfq;

    public SupplierQuote(Long id) {
        this.id = id;
    }

    public SupplierQuote() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SupplierQuote that = (SupplierQuote) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash(id);
    }
}
