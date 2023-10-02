package dbEntity.salescontract;

import dbEntity.audit.AuditableEntity;
import dbEntity.brand.Brand;
import dbEntity.document.Document;
import dbEntity.enums.Status;
import dbEntity.order.Order;
import dbEntity.payment.TermsAndConditions;
import dbEntity.supplier.Supplier;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Data
@Entity
@Table( name = "sales_contract" )
public class SalesContract extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "sales_contract_sequence_generator" )
    @SequenceGenerator( name = "sales_contract_sequence_generator", sequenceName = "sales_contract_sequence" )
    private Long id;

    @Column( name = "contract_no" )
    private String contractNo;

    @Column( name = "pi_no" )
    private String piNo;

    @Column( name = "approval_status" )
    private Status approvalStatus;

    @Column( name = "contract_date" )
    private LocalDate contractDate;

    @Column( name = "requested_date" )
    private LocalDateTime requestedDate;

    @Column( name = "approval_date" )
    private LocalDateTime approvalDate;

    @Column( name = "production_cost" )
    private BigDecimal productionCost;

    @Column( name = "total_quantity" )
    private Integer totalQuantity;

    @Column( name = "no_of_design" )
    private Integer noOfDesign;

    @Column( name = "billing_address", length = 2000 )
    private String billingAddress;

    @Column( name = "buyer_bank_details", length = 2000 )
    private String buyerBankDetails;

    @Column( name = "beneficiary_details", length = 2000 )
    private String beneficiaryDetails;

    @Column( name = "beneficiary_bank_details", length = 2000 )
    private String beneficiaryBankDetails;

    @Column( name = "consignee", length = 2000 )
    private String consignee;

    @Column( name = "notify_party", length = 2000 )
    private String notifyParty;

    @Column( name = "merged_to" )
    private Long mergedTo;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "order_id", foreignKey = @ForeignKey( name = "fk_sales_contract_order_id" ) )
    @ToString.Exclude
    private Order order;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_sales_contract_brand_id" ) )
    @ToString.Exclude
    private Brand brand;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "approved_by", foreignKey = @ForeignKey( name = "fk_sales_contract_approved_by_user" ) )
    @ToString.Exclude
    private User approvedBy;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_sales_contract_supplier_id" ) )
    @ToString.Exclude
    private Supplier supplier;

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinTable( name = "sales_contract_payment_documents",
            joinColumns = @JoinColumn( name = "sales_contract_id", foreignKey = @ForeignKey( name = "fk_sales_contract_payment_documents_invoice_id" ) ),
            inverseJoinColumns = @JoinColumn( name = "document_id", foreignKey = @ForeignKey( name = "fk_sales_contract_payment_documents_invoice_id" ) ) )
    private Set<Document> paymentDocumentSet = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "salesContract" )
    @ToString.Exclude
    private Set<SalesContractItem> salesContractItemSet = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "salesContract" )
    @ToString.Exclude
    private List<TermsAndConditions> termsAndConditionsList = new ArrayList<>();


    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        if ( !super.equals( o ) ) return false;
        SalesContract that = ( SalesContract ) o;
        return id.equals( that.id );
    }

    @Override
    public int hashCode() {
        return Objects.hash( id );
    }
}
