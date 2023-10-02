package dbEntity.brand;

import dbEntity.document.Document;
import dbEntity.enums.Status;
import dbEntity.location.Country;
import dbEntity.payment.BankDetails;
import dbEntity.rfq.PriceType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Data
@Entity
@DynamicUpdate
@Table( name = "brand" )
public class Brand {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "brand_sequence_generator" )
    @SequenceGenerator( name = "brand_sequence_generator", sequenceName = "brand_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "legal_name" )
    private String legalName;

    @Column( name = "email" )
    private String email;

    @Column( name = "phone" )
    private String phone;

    @Column( name = "website" )
    private String website;

    @Column( name = "code" )
    private String code;

    @Column( name = "description" )
    private String description;

    @CreationTimestamp
    @Column( name = "date_added" )
    private LocalDateTime dateAdded;

    @Column( name = "is_deleted" )
    private Boolean isDeleted = false;

    @Column( name = "type" )
    private BrandType type;

    @Column( name = "brand_group" )
    private BrandGroup group;

    @Column( name = "market_value" )
    private BigDecimal marketValue;

    @Column( name = "no_of_outlet" )
    private Long noOfOutlet;

    @Column( name = "annual_production" )
    private BigDecimal annualProduction;

    @Column( name = "yearly_revenue" )
    private BigDecimal yearlyRevenue;

    @Column( name = "yearly_produces_style" )
    private Long yearlyProducesStyle;

    @Column( name = "alexa_ranking" )
    private Long alexaRanking;

    @Column( name = "tax_id" )
    private String taxId;

    @Column( name = "no_of_child" , columnDefinition = "bigint default 0")
    private Long noOfChild;

    @Column( name = "customer_min_segment" )
    private Long customerMinSegment;

    @Column( name = "customer_max_segment" )
    private Long customerMaxSegment;

    @Column( name = "ecom_sales_percentage" )
    private Long eComSalesPercentage;

    @Column( name = "shop_sales_percentage" )
    private Long shopSalesPercentage;

    @Column( name ="status" )
    private Status status = Status.PIPELINE;

    @Column( name = "statusUpdatedAt" )
    private LocalDateTime statusUpdatedAt;

    @Column( name = "power_bi_url" )
    private String powerBiUrl;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "logo_doc_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_brand_logo_doc_id" ) )
    private Document logoDocument;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn( name = "parent_id", foreignKey = @ForeignKey( name = "fk_brand_parent_id" ) )
    private Brand parent;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "brand" )
    private Set<BrandLocationMap> brandLocationMapSet = new HashSet<>();

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "brand" )
    private Set<BankDetails> bankDetailsSet = new HashSet<>();

    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "brand" )
    private Set<BrandProductSubCategoryMap> brandProductSubCategoryMapList = new HashSet<>();

    @Enumerated
    @ElementCollection( targetClass = PriceType.class )
    private Set<PriceType> incotermSet = new HashSet<>();

    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "brand" )
    private List<BrandUserMap> brandUserMaps = new ArrayList<>();

    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "brand" )
    private List<BrandCertificate> certificateList = new ArrayList<>();

    @ToString.Exclude
    @ManyToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinTable( name = "brand_operational_zone_map",
            joinColumns = @JoinColumn( name = "brand_id" ),
            inverseJoinColumns = @JoinColumn( name = "country_id" ),
            foreignKey = @ForeignKey( name = "fk_brand_operational_zone_map_brand_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_brand_operational_zone_map_country_id" )
    )
    private Set<Country> operationalZoneSet = new HashSet<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Brand that = (Brand) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }
}
