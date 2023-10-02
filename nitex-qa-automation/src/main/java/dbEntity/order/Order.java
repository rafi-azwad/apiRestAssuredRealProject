package dbEntity.order;

import dbEntity.brand.Brand;
import dbEntity.document.Document;
import dbEntity.enums.GsysFlag;
import dbEntity.enums.Status;
import dbEntity.product.Product;
import dbEntity.rfq.ProductInfoForRfq;
import dbEntity.salescontract.SalesContract;
import dbEntity.supplier.Supplier;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Data
@Entity
@DynamicUpdate
@Table( name = "orders" )
public class Order {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "order_sequence_generator")
    @SequenceGenerator( name="order_sequence_generator", sequenceName = "order_sequence", initialValue = 1 )
    @Column( name = "id" )
    private Long id;

    @Column( name = "order_ref_number" )
    private String orderRefNumber;

    @Column( name = "po_number" )
    private String poNumber;

    @Column( name = "name" )
    private String name;

    @Column( name = "shipping_address", columnDefinition = "TEXT" )
    private String shippingAddress;

    @Column( name = "notes" )
    private String notes;

    @Column( name = "order_value" )
    private BigDecimal orderValue;

    @Column( name = "production_cost" )
    private BigDecimal productionCost;

    @Column( name = "total_cost" )
    private BigDecimal totalCost;

    @Column( name = "order_quantity" )
    private Long orderQuantity;

    @Column( name = "no_of_product" )
    private Integer noOfProduct;

    @Column( name = "payment_terms" )
    private PaymentTerms paymentTerms;

    @Column( name = "start_date" )
    private Date startDate;

    @Column( name = "date_added" )
    private Date dateAdded;

    @Column( name = "delivery_date" )
    private Date deliveryDate;

    @Column( name = "last_response_time" )
    private Date lastResponseTime;

    @Column( name = "actual_delivery_date" )
    private LocalDate actualDeliveryDate;

    @Column( name = "completion_date" )
    private LocalDate completionDate;

    @Column( name = "status" )
    private Status status;

    @Column( name = "gsys_flag" )
    private GsysFlag gsysFlag = GsysFlag.LEVEL_ZERO;

    @Column( name = "is_approval_needed" )
    private Boolean isApprovalNeeded = false;

    @Column( name = "approval_status" )
    private Status approvalStatus;

    @Column( name = "requested_at" )
    private LocalDateTime requestedAt;

    @Column( name = "approved_at" )
    private LocalDateTime approvedAt;

    @Column( name = "approved_by" )
    private Long approvedBy;

    @Column( name = "is_deleted" )
    private Boolean isDeleted = false;

    @Column( name = "deleted_at" )
    private LocalDateTime deletedAt;

    @Column( name = "deleted_by" )
    private Long deletedBy;

    @Column( name = "canceled_at" )
    private LocalDateTime canceledAt;

    @Column( name = "canceled_by" )
    private Long canceledBy;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_order_brand_id" ) )
    private Brand brand;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "added_by", foreignKey = @ForeignKey( name = "fk_order_user_id_added_by") )
    private User user;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "buyer_id", foreignKey = @ForeignKey( name = "fk_order_user_buyer_id") )
    private User buyer;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "project_manager_id", foreignKey = @ForeignKey( name = "fk_order_project_manager_id") )
    private User projectManager;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "account_manager_id", foreignKey = @ForeignKey( name = "fk_order_account_manager_id") )
    private User accountManager;

    @ManyToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinTable( name = "order_document_map",
            joinColumns = @JoinColumn( name = "order_id" ),
            inverseJoinColumns = @JoinColumn( name = "document_id" ),
            foreignKey = @ForeignKey( name = "fk_order_document_map_order_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_order_document_map_document_id" ) )
    private Set<Document> documentSet;

    @ManyToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinTable( name = "order_supplier_map",
            joinColumns = @JoinColumn( name = "order_id" ),
            inverseJoinColumns = @JoinColumn( name = "supplier_id" ),
            foreignKey = @ForeignKey( name = "fk_order_document_map_order_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_order_supplier_map_supplier_id" ) )
    private Set<Supplier> supplierSet;

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(
            name = "order_members_map",
            joinColumns = @JoinColumn( name = "order_id" ),
            inverseJoinColumns = @JoinColumn( name = "user_id" ),
            foreignKey = @ForeignKey( name = "fk_order_members_map_order_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_order_members_map_user_id" ) )
    private Set<User> orderMembers;

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(
            name = "order_product_map",
            joinColumns = @JoinColumn( name = "order_id" ),
            inverseJoinColumns = @JoinColumn( name = "product_id" ),
            foreignKey = @ForeignKey( name = "fk_order_product_map_order_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_order_product_map_product_id" ) )
    private Set<Product> productSet;

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(
            name = "order_product_info_for_rfq_map",
            joinColumns = @JoinColumn( name = "order_id"),
            inverseJoinColumns = @JoinColumn( name = "product_info_for_rfq_id" ),
            foreignKey = @ForeignKey( name = "fk_order_product_info_for_rfq_map_order_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_order_product_info_for_rfq_map_product_id" ) )
    private Set<ProductInfoForRfq> productInfoForRfqSet;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "collection_id", foreignKey = @ForeignKey( name = "fk_order_collection_id" ) )
    private Collection collection;
    
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "order" )
    private List<OrderMaterials> orderMaterialsList;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "order", cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    private Set<SalesContract> salesContractSet = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "order" )
    private List<OrderPaymentDocumentRequest> paymentDocumentRequestList;

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Order that = ( Order ) o;
        return id != null && id.equals( that.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }
}
