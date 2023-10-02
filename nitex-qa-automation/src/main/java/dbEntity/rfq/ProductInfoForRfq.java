package dbEntity.rfq;

import dbEntity.collection.Collection;
import dbEntity.config.AppConstants;
import dbEntity.enums.Status;
import dbEntity.order.Order;
import dbEntity.payment.Currency;
import dbEntity.product.Product;
import dbEntity.salescontract.SupplierQuote;
import dbEntity.salescontract.SupplierQuoteSupplierMap;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table( name = "product_info_for_rfq" )
@DynamicUpdate
public class ProductInfoForRfq {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "product_info_for_rfq_sequence" )
    @SequenceGenerator( name="product_info_for_rfq_sequence", sequenceName = "product_info_for_rfq_sequence" )
    private Long id;

    @CreationTimestamp
    @DateTimeFormat( pattern = AppConstants.dateFormat_slash_ddMMyyyy )
    @Column( name ="date_added" )
    private Date dateAdded;

    @UpdateTimestamp
    @DateTimeFormat( pattern = AppConstants.dateFormat_slash_ddMMyyyy )
    @Column( name ="last_response_time" )
    private Date lastResponseTime;

    @Column( name = "price" )
    private BigDecimal price;

    @Column( name = "production_cost" )
    private BigDecimal productionCost;

    @Column( name = "currency" )
    private Currency currency;

    @Column( name = "price_type" )
    private PriceType priceType;

    @Column( name = "price_given_time" )
    private LocalDateTime priceGivenTime;

    @Column( name = "total" )
    private Integer total;

    @Column( name = "quotation_quantity" )
    private Integer quotationQuantity;

    @Column( name = "amount" )
    private BigDecimal amount;

    @Column( name = "po_number" )
    private String poNumber;

    @Column( name = "po_receive_date" )
    private LocalDate poReceiveDate;

    @Column( name = "delivery_date" )
    private LocalDate deliveryDate;

    @Column( name = "actual_delivery_date" )
    private LocalDateTime actualDeliveryDate;

    @Column( name = "etd_revision_count" )
    private Integer etdRevisionCount;

    @Column( name = "old_etd_history_json" )
    private String oldEtdHistoryJson;

    @Column( name = "buyer_quotation_type" )
    private QuotationType buyerQuotationType;

    @Column( name = "factory_quotation_type" )
    private QuotationType factoryQuotationType;

    @Column( name = "color_wise_size_quantity_pair_json", columnDefinition = "TEXT" )
    private String colorWiseSizeQuantityPairJson;

    @Column( name = "size_wise_buyer_price_json", columnDefinition = "TEXT" )
    private String sizeWiseBuyerPriceJson;

    @Column( name = "color_wise_buyer_price_json", columnDefinition = "TEXT" )
    private String colorWiseBuyerPriceJson;

    @Column( name = "status" )
    private Status status;

    @Column( name = "shipment_status" , columnDefinition  = "int  default 11" )
    private Status shipmentStatus = Status.PENDING;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "collection_id", foreignKey = @ForeignKey( name = "product_info_for_rfq_collection_id_fk" ) )
    @ToString.Exclude
    private Collection collection;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "product_info_for_rfq_product_id_fk" ) )
    @ToString.Exclude
    private Product product;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "added_by", foreignKey = @ForeignKey( name = "product_info_for_rfq_user_id_fk" ) )
    @ToString.Exclude
    private User addedBy;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "rfq_executive_id", foreignKey = @ForeignKey( name = "product_info_for_rfq_rfq_executive_id_fk") )
    @ToString.Exclude
    private User rfqExecutive;

    @ManyToMany( fetch = FetchType.LAZY, mappedBy = "productInfoForRfqSet", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @ToString.Exclude
    private Set<Order> orderSet;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "productInfoForRfq", cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @ToString.Exclude
    private Set<Quotations> quotationsSet;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "productInfoForRfq", cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @ToString.Exclude
    private Set<SupplierQuote> supplierQuoteSet;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "productInfoForRfq", cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @ToString.Exclude
    private Set<SupplierQuoteSupplierMap> supplierQuoteSupplierMapSet;

    @Column( name = "is_deleted" )
    private Boolean isDeleted = false;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductInfoForRfq that = (ProductInfoForRfq) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }
}
