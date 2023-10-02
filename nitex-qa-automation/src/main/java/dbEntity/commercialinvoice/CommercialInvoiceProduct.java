package dbEntity.commercialinvoice;

import dbEntity.enums.Status;
import dbEntity.rfq.ProductInfoForRfq;
import dbEntity.salescontract.SupplierQuote;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "commercial_invoice_product" )
public class CommercialInvoiceProduct {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "commercial_invoice_product_sequence_generator" )
    @SequenceGenerator( name = "commercial_invoice_product_sequence_generator",sequenceName = "commercial_invoice_product_sequence", initialValue = 1 )
    @Column( name = "id", nullable = false )
    private Long id;

    @Column( name = "total_shipped_quantity", nullable = false  )
    private Integer totalShippedQuantity = 0;

    @Column( name = "total_shipped_amount", nullable = false )
    private BigDecimal totalShippedAmount = BigDecimal.ZERO;

    @Column( name = "shipment_status" )
    private Status shipmentStatus = Status.PENDING;

    @Column( name = "shipment_status_updated_date" )
    private LocalDate shipmentStatusUpdatedDate;

    @Column( name = "total_factory_cost", nullable = false )
    @ColumnDefault( "0.00" )
    private BigDecimal totalFactoryCost = BigDecimal.ZERO;

    @Column( name = "invoice_no" )
    private String invoiceNo;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST , CascadeType.MERGE } )
    @JoinColumn( name = "shipment_status_updated_by", foreignKey = @ForeignKey(name = "fk_commercial_invoice_product_shipment_status_updated_by") )
    @ToString.Exclude
    private User shipmentStatusUpdatedBy;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "commercial_invoice_id", foreignKey = @ForeignKey( name = "fk_commercial_invoice_product_commercial_invoice_id") )
    @ToString.Exclude
    private CommercialInvoice commercialInvoice;

    @ManyToOne( fetch = FetchType.LAZY , cascade = { CascadeType.PERSIST , CascadeType.MERGE } )
    @JoinColumn( name = "rfq_id", foreignKey = @ForeignKey( name = "fk_commercial_invoice_product_rfq_id") )
    @ToString.Exclude
    private ProductInfoForRfq productInfoForRfq;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST , CascadeType.MERGE } )
    @JoinColumn( name = "supplier_quote_id" ,foreignKey = @ForeignKey( name = "fk_commercial_invoice_product_supplier_quote_id") )
    @ToString.Exclude
    private SupplierQuote supplierQuote;

    @OneToMany( fetch = FetchType.LAZY , mappedBy = "commercialInvoiceProduct"  , cascade = CascadeType.ALL , orphanRemoval = true )
    @ToString.Exclude
    private List<ProductShipmentBreakDown> productShipmentBreakDowns;


}
