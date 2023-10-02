package dbEntity.product;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import dbEntity.brand.Brand;
import dbEntity.category.Category;
import dbEntity.category.ProductSubCategory;
import dbEntity.color.Color;
import dbEntity.config.AppConstants;
import dbEntity.costing.InitialCosting;
import dbEntity.costing.QuantityWiseInitialCosting;
import dbEntity.document.Document;
import dbEntity.enums.AvailabilityStatus;
import dbEntity.enums.Status;
import dbEntity.materials.FabricType;
import dbEntity.materials.Material;
import dbEntity.materials.MaterialComposition;
import dbEntity.materials.Season;
import dbEntity.measurement.Size;
import dbEntity.measurement.SizeCategory;
import dbEntity.order.Order;
import dbEntity.sample.SampleActivityType;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.*;

@Data
@Entity
@DynamicUpdate
@Table(name = "product")
@NoArgsConstructor
public class Product implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "product_sequence_generator")
    @SequenceGenerator( name="product_sequence_generator", sequenceName = "product_sequence", initialValue = 1 )
    @Column( name ="id" )
    private Long id;

    @Column( name ="name" )
    private String name;

    @Column( name ="reference_number" )
    private String referenceNumber;

    @Column( name ="system_reference_number" )
    private String systemReferenceNumber;

    @Column( name = "sequence_number" )
    private Long sequenceNumber;

    @Column( name = "fabric_name" )
    private String fabricName;

    @Column( name = "fabric_description", columnDefinition = "TEXT" )
    private String fabricDescription;

    @Column( name = "fabric_type" )
    private FabricType fabricType;

    @Column( name = "fabric_gsm" )
    private Double fabricGsm;

    @Column( name = "fabric_composition" )
    private MaterialComposition fabricComposition;

    @Column( name = "fabric_composition_details" )
    private String fabricCompositionDetails;

    @Column( name = "fabric_construction" )
    private String fabricConstruction;

    @CreationTimestamp
    @Column( name ="date_added" )
    private Date dateAdded;

    @UpdateTimestamp
    @DateTimeFormat( pattern = AppConstants.dateFormat_slash_ddMMyyyy )
    @Column( name ="last_response_time" )
    private Date lastResponseTime;

    @Column( name ="note" )
    private String note;

    @Column( name ="status" )
    private Status status;

    @Column( name ="availability_status" )
    private AvailabilityStatus availabilityStatus = AvailabilityStatus.TECHPACK;

    @Column( name = "current_development_status" )
    private SampleActivityType currentDevelopmentStatus;

    @Column( name = "season" )
    private Season season;

    @Column( name = "target_segment" )
    private TargetSegment targetSegment;

    @Column( name = "tags", length = 2000 )
    private String tags;

    @Column( name = "added_by_nitex" )
    private Boolean addedByNitex = false;

    @Column( name = "is_nitex_product" )
    private Boolean isNitexProduct = true;

    @Column( name = "base_price" )
    private Double basePrice;

    @Column( name = "minimum_order_quantity" )
    private Integer minimumOrderQuantity;

    @Column( name = "turn_around_time" )
    private Integer turnAroundTime;

    @Column( name = "base_size" )
    private String baseSize;

    @Column( name = "measurement_base_size" )
    private Size measurementBaseSize;

    /**
     * Effective from version 4.1.5
     */
    @Column( name = "reorder_product_id_list_json" )
    private String reorderProductIdListJson;

    /**
     * Effective from version 4.1.5
     */
    @Column( name = "reorder_order_id_list_json" )
    private String reorderOrderIdListJson;

    @Column( name = "is_reorder_clone" )
    private Boolean isReOrderClone = false;

    @Column( name = "is_deleted" )
    private Boolean isDeleted = false;

    @Column( name = "is_cloned" )
    private Boolean isCloned = false;

    @Column( name = "is_option" )
    private Boolean isOption = false;

    @Column( name = "is_basic_info_updated" )
    private Boolean isBasicInfoUpdated = true;

    @Column( name = "is_change_required" )
    private Boolean isChangeRequired = false;

    /**
     * Indicates the base product id
     */
    @Column( name = "original_product_id" )
    private Long originProductId;

    @Column( name = "parent_product_id" )
    private Long parentProductId;

    @Column( name = "parent_option_product_id" )
    private Long parentOptionProductId;

    @Column( name = "no_of_option" )
    private Long noOfOption;

    @Column( name = "publish_date" )
    private LocalDateTime publishDate;

    @Column( name = "no_of_variant", columnDefinition = "bigint default 0" )
    private Long noOfVariant = 0L;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Type( JsonBinaryType.class )
    @Column( name = "extra_flag", columnDefinition = "jsonb" )
    private ExtraFlag extraFlag;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_details_id", foreignKey = @ForeignKey( name = "fk_product_details_id" ) )
    private ProductDetails productDetails;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "size_category_id", foreignKey = @ForeignKey( name = "fk_product_size_category_id" ) )
    private SizeCategory sizeCategory;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "added_by", foreignKey = @ForeignKey( name = "product_user_id_fk") )
    private User user;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_product_brand_id" ) )
    private Brand brand;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "main_fabric_id", foreignKey = @ForeignKey( name = "fk_product_main_fabric_id" ) )
    private Material mainFabric;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "feature_image_id", foreignKey = @ForeignKey( name = "fk_product_feature_image_id" ) )
    private Document featureImage;

    //todo rename to product category
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "category", foreignKey = @ForeignKey( name = "product_category_id_fk" ) )
    private Category category;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "sub_category_id", foreignKey = @ForeignKey( name = "fk_product_sub_category_id" ) )
    private ProductSubCategory subCategory;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "product_group_id", foreignKey = @ForeignKey( name ="fk_product_product_group_id" ) )
    private ProductGroup productGroup;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "initial_costing_id", foreignKey = @ForeignKey( name = "fk_product_initial_costing_id" ) )
    private InitialCosting initialCosting;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "tech_pack_url_id", foreignKey = @ForeignKey( name = "product_document_id_fk" ) )
    private Document techpackDocument;

    /**
     * From version 4.1.5 each product is added in a single collection
     */
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "collection_id", foreignKey = @ForeignKey( name = "fk_product_collection_id" ) )
    private Collection collection;

    /**
     * From version 4.1.5 each product can be in a single order
     */
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "order_id", foreignKey = @ForeignKey( name = "fk_product_order_id" ) )
    private Order order;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true )
    @JoinTable(
            name = "product_document_map",
            joinColumns = @JoinColumn( name = "product_id"),
            inverseJoinColumns = @JoinColumn( name = "document_id" ),
            foreignKey = @ForeignKey( name = "product_document_map_product_id_fk" ),
            inverseForeignKey = @ForeignKey( name = "product_document_map_document_id_fk" ) )
    private Set<Document> documentSet = new HashSet<>();

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable( name = "product_material_map",
            joinColumns = @JoinColumn( name = "product_id" ),
            inverseJoinColumns = @JoinColumn( name = "material_id" ),
            foreignKey = @ForeignKey( name = "fk_product_material_map_product_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_product_material_map_material_id" ) )
    private Set<Material> materialSet = new HashSet<>();

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @Setter( AccessLevel.NONE )
    @OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "product", orphanRemoval = true )
    private Set<Color> colorSet = new HashSet<>();

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL )
    private List<QuantityWiseInitialCosting> quantityWiseInitialCostingList = new ArrayList<>();

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Product product = ( Product ) o;
        return Objects.equals( id, product.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }
}
