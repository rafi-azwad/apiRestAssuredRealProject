package dbEntity.commercialinvoice;

import dbEntity.audit.AuditableEntity;
import dbEntity.rfq.ProductInfoForRfq;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table( name="product_shipment_breakdown" )
public class ProductShipmentBreakDown extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "product_shipment_breakdown_sequence_generator" )
    @SequenceGenerator( name = "product_shipment_breakdown_sequence_generator", sequenceName = "product_shipment_breakdown_sequence" )
    private Long id;

    @Column( name = "quantity", nullable = false  )
    private Integer quantity;

    @Column( name = "amount", nullable = false )
    private BigDecimal amount;

    @Column( name = "factory_cost", nullable = false )
    @ColumnDefault( "0.00" )
    private BigDecimal factoryCost = BigDecimal.ZERO;

    @ManyToOne( fetch = FetchType.LAZY , cascade = { CascadeType.PERSIST , CascadeType.MERGE } )
    @JoinColumn( name = "rfq_id", foreignKey = @ForeignKey( name = "fk_product_shipment_breakdown_rfq_id") )
    @ToString.Exclude
    private ProductInfoForRfq productInfoForRfq;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "commercial_invoice_product_id" , foreignKey = @ForeignKey( name = "fk_product_shipment_breakdown_commercial_invoice_product_id") )
    private CommercialInvoiceProduct commercialInvoiceProduct;
}
