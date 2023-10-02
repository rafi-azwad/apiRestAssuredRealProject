package dbEntity.order;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import dbEntity.brand.Brand;
import dbEntity.category.ProductSubCategory;
import dbEntity.commercialinvoice.CommercialInvoiceProduct;
import dbEntity.enums.GsysFlag;
import dbEntity.enums.TNAStatus;
import dbEntity.product.Product;
import dbEntity.product.ProductGroup;
import dbEntity.rfq.ProductInfoForRfq;
import dbEntity.salescontract.SalesContract;
import dbEntity.supplier.Supplier;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table( name = "order_dashboard" )
public class OrderDashboard {

    @Id
    private Long id;

    @Column( name ="brand_name" )
    private String brandName;

    @Column( name ="product_ref_no" )
    private String productRefNo;

    @Column( name ="product_main_fabric_name" )
    private String productMainFabricName;

    @Column( name = "is_nitex_product" )
    private Boolean isNitexProduct = true;

    @Column( name = "no_of_color" )
    private Long noOfColor;

    @Column( name = "no_of_size" )
    private Long noOfSize;

    @Column( name ="supplier_name" )
    private String supplierName;

    @Column( name = "contract_no" )
    private String contractNo;

    @Column( name = "factory_handover_date" )
    private LocalDate factoryHandoverDate;

    @Column( name = "factory_delivery_date" )
    private LocalDate factoryDeliveryDate;

    @Column( name = "factory_etd_revision_count" )
    private Integer factoryEtdRevisionCount;

    @Column( name = "old_factory_etd_history_json", columnDefinition = "TEXT" )
    private String oldFactoryEtdHistoryJson;

    @Column( name = "commercial_invoice_no" )
    private String commercialInvoiceNo;

    @Column( name = "commercial_invoice_date" )
    private LocalDate commercialInvoiceDate;

    @Column( name = "commercial_invoice_quantity" )
    private Long commercialInvoiceQuantity;

    @Column( name = "shipment_amount" )
    private BigDecimal shipmentAmount = BigDecimal.ZERO;

    @Column( name = "tna_status" )
    private TNAStatus tnaStatus;

    @Column( name = "gsys_flag" )
    private GsysFlag gsysFlag = GsysFlag.LEVEL_ONE;

    @Column( name = "tna_response", columnDefinition = "TEXT" )
    private String tnaResponse;

    @Column( name = "tna_score" )
    private Long tnaScore;

    @Column( name ="order_name" )
    private String orderName;

    @Column( name ="order_ref_no" )
    private String orderRefNo;

    @Column( name ="order_amount" )
    private BigDecimal orderAmount; // this is only for order amount of this style

    @Column( name = "po_received_date" )
    private LocalDate poReceivedDate;

    @Column( name ="remarks" )
    private String remarks;

    @Column( name = "is_order_deleted", columnDefinition = "boolean default false" )
    private Boolean isOrderDeleted = false;

    @LastModifiedDate
    @Column( name = "updated_at" )
    private LocalDateTime updatedAt;

    @Type( ListArrayType.class )
    @Column( name = "merchandiser_user_id_list", columnDefinition = "bigint[]" )
    private List<Long> merchandiserUserIdList = new ArrayList<>();

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "order_id", foreignKey = @ForeignKey( name = "fk_order_dashboard_order_id" ) )
    private Order order;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "product_info_for_rfq_id", foreignKey = @ForeignKey( name = "fk_order_dashboard_product_info_for_rfq_id" ) )
    private ProductInfoForRfq productInfoForRfq;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_order_dashboard_brand_id" ) )
    private Brand brand;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "fk_order_dashboard_product_id" ) )
    private Product product;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "product_group_id", foreignKey = @ForeignKey( name ="fk_order_dashboard_product_group_id" ) )
    private ProductGroup productGroup;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "sub_category_id", foreignKey = @ForeignKey( name = "fk_order_dashboard_sub_category_id" ) )
    private ProductSubCategory subCategory;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_order_dashboard_supplier_id" ) )
    private Supplier supplier;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "sales_contract_id", foreignKey = @ForeignKey( name = "fk_order_dashboard_sales_contract_id" ) )
    private SalesContract salesContract;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "commercial_invoice_id", foreignKey = @ForeignKey( name = "fk_order_dashboard_sales_commercial_invoice_id" ) )
    private CommercialInvoiceProduct commercialInvoiceProduct;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "buyer_id", foreignKey = @ForeignKey( name = "fk_order_dashboard_buyer_id") )
    private User buyer;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "project_manager_id", foreignKey = @ForeignKey( name = "fk_order_dashboard_project_manager_id") )
    private User projectManager;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "account_manager_id", foreignKey = @ForeignKey( name = "fk_order_dashboard_account_manager_id") )
    private User accountManager;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OrderDashboard orderDashboard = (OrderDashboard) o;
        return id != null && Objects.equals(id, orderDashboard.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }
}
