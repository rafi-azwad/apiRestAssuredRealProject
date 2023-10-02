package dbEntity.payment;

import dbEntity.brand.Brand;
import dbEntity.document.Document;
import dbEntity.enums.Status;
import dbEntity.order.Order;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Getter
@Setter
@DynamicUpdate
@Entity( name = "invoice" )
@Table( name = "invoice" )
public class Invoice {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "invoice_sequence_generator")
    @SequenceGenerator( name="invoice_sequence_generator", sequenceName = "invoice_sequence" )
    @Column( name ="id" )
    private Long id;

    @Column( name = "invoice_no" )
    private String invoiceNo;

    @Column( name = "code", length = 100 )
    private String code;

    @Column( name = "note" )
    private String note;

    @Column( name = "client_name" )
    private String clientName;

    @Column( name = "payment_status" )
    private Status paymentStatus;

    @Column( name = "approval_status" )
    private Status approvalStatus;

    @Column( name = "date_created" )
    private Date dateCreated;

    @Column( name = "invoice_date" )
    private Date invoiceDate;

    @Column( name = "due_date" )
    private Date dueDate;

    @Column( name = "requested_date" )
    private LocalDateTime requestedDate;

    @Column( name = "approval_date" )
    private LocalDateTime approvalDate;

    @Column( name = "address", length = 2000 )
    private String address;

    @Column( name = "from_address", length = 2000 )
    private String fromAddress;

    @Column( name = "buyer_details", length = 2000 )
    private String buyerDetails;

    @Column( name = "phone", length = 50 )
    private String phone;

    @Column( name = "email", length = 100 )
    private String email;

    @Column( name = "beneficiary_details", length = 2000 )
    private String beneficiaryDetails;

    @Column( name = "shipping_address", length = 2000 )
    private String shippingAddress;

    @Column( name = "beneficiary_bank_details", length = 2000 )
    private String beneficiaryBankDetails;

    @Column( name = "quantity" )
    private Integer quantity;

    @Column( name = "amount" )
    private BigDecimal amount;

    @Column( name = "received_amount" )
    private BigDecimal receivedAmount = BigDecimal.ZERO;

    @Column( name = "due_amount" )
    private BigDecimal dueAmount;

    @Column( name = "is_deleted" )
    private Boolean isDeleted = false;

    @Column( name = "is_generated_with_order" )
    private Boolean isGeneratedWithOrder = false;

    @Column( name = "item_wise_price_json", columnDefinition = "TEXT" )
    private String itemWisePriceJson;

    @Column( name = "merged_to" )
    private Long mergedTo;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "order_id", foreignKey = @ForeignKey( name = "fk_invoice_order" ) )
    @ToString.Exclude
    private Order order;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "created_by", foreignKey = @ForeignKey( name = "fk_invoice_created_by_user" ) )
    @ToString.Exclude
    private User createdBy;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "approved_by", foreignKey = @ForeignKey( name = "fk_invoice_approved_by_user" ) )
    @ToString.Exclude
    private User approvedBy;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "invoice_to", foreignKey = @ForeignKey( name = "fk_invoice_to_user" ) )
    @ToString.Exclude
    private User invoiceTo;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_invoice_brand_id" ) )
    @ToString.Exclude
    private Brand brand;

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinTable( name = "invoice_payment_documents",
            joinColumns = @JoinColumn( name = "invoice_id", foreignKey = @ForeignKey( name = "fk_invoice_payment_documents_invoice_id" ) ),
            inverseJoinColumns = @JoinColumn( name = "document_id", foreignKey = @ForeignKey( name = "fk_invoice_payment_documents_invoice_id" ) ) )
    private Set<Document> paymentDocumentSet = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "invoice" )
    @ToString.Exclude
    private Set<InvoiceItem> invoiceItemSet;

    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "invoice" )
    @ToString.Exclude
    private List<TermsAndConditions> termsAndConditionsList;

    public void adjustPayment( BigDecimal amount ){

        if ( amount == null ) {
            amount = BigDecimal.ZERO;
        }

        if ( this.getReceivedAmount() == null ) {
            this.setReceivedAmount( BigDecimal.ZERO );
        }

        if ( this.getDueAmount() == null ) {
            this.setDueAmount( BigDecimal.ZERO );
        }

        this.setReceivedAmount( this.getReceivedAmount().add( amount ) );

        this.setDueAmount( this.getDueAmount().subtract( amount ) );

        if( this.getDueAmount().compareTo( BigDecimal.ZERO ) <= 0 )
            this.setPaymentStatus( Status.PAID );
        else
            this.setPaymentStatus( Status.PARTIALLY_PAID );
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Invoice invoice = (Invoice) o;
        return id != null && Objects.equals(id, invoice.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
