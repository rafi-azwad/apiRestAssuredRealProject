package dbEntity.supplier;

import dbEntity.audit.AuditableEntity;
import dbEntity.document.Document;
import dbEntity.enums.PriceRange;
import dbEntity.location.Location;
import dbEntity.payment.BankDetails;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.*;

@Data
@Entity
@Table( name = "supplier" )
public class Supplier extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "supplier_sequence_generator" )
    @SequenceGenerator( name = "supplier_sequence_generator", sequenceName = "supplier_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "code" )
    private String code;

    @Column( name = "website_url" )
    private String websiteUrl;

    @Column( name = "threesixty_view_url", length = 2000 )
    private String threeSixtyViewUrl;

    @Column( name = "preview_image_url", length = 300 )
    private String previewImageUrl;

    @Column( name = "no_of_line" )
    private Integer numberOfLine;

    @Column( name = "accord_score" )
    private Double accordScore;

    @Column( name = "no_of_workers" )
    private Integer noOfWorkers;

    @Column( name = "is_composite" )
    private Boolean isComposite;

    @Column( name = "have_rnd" )
    private Boolean haveRnd;

    @Column( name = "have_lab" )
    private Boolean haveLab;

    @Column( name = "have_studio" )
    private Boolean haveStudio;

    @Column( name = "have_sample" )
    private Boolean haveSample;

    @Column( name = "have_etp" )
    private Boolean haveEtp;

    @Column( name = "have_wtp" )
    private Boolean haveWtp;

    @Column( name = "ratting_value" )
    private Double rattingValue;

    @Column( name = "no_of_reviews" )
    private Integer noOfReviews;

    @Column( name = "isVisited" )
    private Boolean isVisited;

    @Column( name = "visited_at" )
    private LocalDate visitedAt;

    @Column( name = "development_value" )
    private Double developmentValue;

    @Column( name = "garments_target_qty" )
    private Integer garmentsTargetQty;

    @Column( name = "garments_sample_development_qty" )
    private Integer garmentsSampleDevelopmentQty;

    @Column( name = "fabric_target_qty" )
    private Integer fabricTargetQty;

    @Column( name = "fabric_sample_development_qty" )
    private Integer fabricSampleDevelopmentQty;

    @ToString.Exclude
    @OneToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "visited_by", foreignKey = @ForeignKey( name = "fk_supplier_visited_by" ) )
    private User visitedBy;

    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "partnership_owner", foreignKey = @ForeignKey( name = "supplier_partnership_owner_id_fk" ) )
    private User partnershipOwner;

    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "relationship_manager", foreignKey = @ForeignKey( name = "supplier_relationship_manager_id_fk" ) )
    private User relationshipManager;

    @ToString.Exclude
    @OneToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinColumn( name = "profile_image_id", foreignKey = @ForeignKey( name = "fk_supplier_profile_image_id" ) )
    private Document profileImage;

    @Enumerated
    @ElementCollection( targetClass = SupplierType.class )
    private Set<SupplierType> typeSet = new HashSet<>();

    @Enumerated
    @ElementCollection( targetClass = SupplierCategory.class )
    private Set<SupplierCategory> categorySet = new HashSet<>();

    @Enumerated
    @ElementCollection( targetClass = PriceRange.class )
    private Set<PriceRange> pricePontSet = new HashSet<>();

    @ToString.Exclude
    @ManyToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinTable(
            name = "supplier_tag_map",
            joinColumns = @JoinColumn( name = "supplier_id"),
            inverseJoinColumns = @JoinColumn( name = "tag_id" ),
            foreignKey = @ForeignKey( name = "fk_supplier_tag_map_supplier_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_supplier_tag_map_tag_id" ) )
    private Set<FreeTextTag> tagSet = new HashSet<>();

    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "supplier" )
    private Set<SupplierDocumentMap> documentMaps = new HashSet<>();

    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "supplier", cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    private List<SupplierBrandMap> brandList = new ArrayList<>();

    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "supplier" )
    private List<Location> locationList;

    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "supplier" )
    private List<ContactPerson> contactPersonList;

    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "supplier" )
    private List<SupplierCertificate> certificateList;

    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "supplier" )
    private List<Review> reviewList;

    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "supplier" )
    private List<BankDetails> bankDetailsList;

    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "supplier" )
    private List<SupplierProductionCapacity> productionCapacities = new ArrayList<>();

    @ToString.Exclude
    @OneToMany( mappedBy = "supplier", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } , orphanRemoval = true )
    private Set<DevelopmentQuantity> developmentQuantities = new HashSet<>();



    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Supplier supplier = ( Supplier ) o;
        return Objects.equals( id, supplier.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }
}
