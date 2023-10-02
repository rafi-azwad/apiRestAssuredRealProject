package dbEntity.bltracking;

import dbEntity.commercialinvoice.CommercialInvoice;
import dbEntity.document.Document;
import dbEntity.enums.Status;
import dbEntity.order.Order;
import dbEntity.rfq.ProductInfoForRfq;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "bill_of_landing" )
public class BillOfLanding {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "bill_of_landing_sequence_generator")
    @SequenceGenerator( name="bill_of_landing_sequence_generator", sequenceName = "bill_of_landing_sequence", initialValue = 1 )
    @Column( name = "id" )
    private Long id;

    @Column( name = "bl_no" )
    private String blNo;

    @Column( name = "commercial_invoice_no" )
    private String commercialInvoiceNo;

    @Column( name = "bl_date" )
    private LocalDate blDate;

    @Column( name = "buyer_payment_terms" )
    private Integer buyerPaymentTerms;

    @Column( name = "factory_payment_terms" )
    private Integer factoryPaymentTerms;

    @Column( name = "number_of_design" )
    private Integer numberOfDesign;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @OneToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL , orphanRemoval = true )
    @JoinColumn( name = "buyer_bl_payment_id" )
    private BuyerBLPayment buyerBLPayment;

    @OneToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL , orphanRemoval = true )
    @JoinColumn( name = "factory_bl_payment_id" )
    private FactoryBLPayment factoryBLPayment;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "commercial_invoice_id", foreignKey = @ForeignKey( name = "fk_bill_of_landing_commercial_invoice_id") )
    @ToString.Exclude
    private CommercialInvoice commercialInvoice;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST , CascadeType.MERGE } )
    @JoinColumn( name = "order_id", foreignKey = @ForeignKey( name = "fk_bill_of_landing_order_id" ) )
    @ToString.Exclude
    private Order order;

    @OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST , CascadeType.MERGE } )
    @JoinTable(
            name = "bill_of_landing_document_map",
            joinColumns = @JoinColumn( name = "bill_of_landing_id" ),
            inverseJoinColumns = @JoinColumn( name = "document_id" ),
            foreignKey = @ForeignKey( name = "fk_bill_of_landing_document_map_bill_of_landing_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_bill_of_landing_document_map_document_id") )
    @ToString.Exclude
    private Set<Document> documents;

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(
            name = "bill_of_landing_product_info_for_rfq_map",
            joinColumns = @JoinColumn( name = "bill_of_landing_id" ),
            inverseJoinColumns = @JoinColumn( name = "product_info_for_rfq_id" ),
            foreignKey = @ForeignKey( name = "fk_bill_of_landing_product_info_for_rfq_map_bill_of_landing_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_bill_of_landing_product_info_for_rfq_document_id") )
    @ToString.Exclude
    private Set<ProductInfoForRfq> productInfoForRfqSet;

    public BillOfLanding( String commercialInvoiceNo ) {
        this.commercialInvoiceNo = commercialInvoiceNo;
        this.buyerBLPayment = new BuyerBLPayment();
        this.factoryBLPayment = new FactoryBLPayment();
    }


}
