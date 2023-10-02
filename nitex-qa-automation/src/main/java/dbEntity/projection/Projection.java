package dbEntity.projection;

import dbEntity.brand.Brand;
import dbEntity.crm.BuyingCycle;
import dbEntity.enums.Status;
import dbEntity.location.Country;
import dbEntity.product.ProductGroup;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@Entity
@DynamicUpdate
@Table( name = "projection" )
public class Projection implements Cloneable{

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "projection_sequence_generator" )
    @SequenceGenerator( name = "projection_sequence_generator", sequenceName = "projection_sequence" )
    private Long id;

    @Enumerated
    @Column( name = "type" )
    private ProjectionType type;

    @Column( name = "year" )
    private Long year;

    @Column( name = "target_style" )
    private Long targetStyle;

    @Column( name = "approved_style", columnDefinition = "bigint default 0")
    private Long approvedStyle = 0L;

    @Column( name = "approved_amount" )
    private BigDecimal approvedAmount = BigDecimal.ZERO;
    @Column( name = "amount" )
    private BigDecimal amount;

    @Column( name = "start_date" )
    private LocalDate startDate;

    @Column( name = "end_date" )
    private LocalDate endDate;

    @Column( name = "remarks" )
    private String remarks;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @Column( name = "no_of_product_category", columnDefinition = "bigint default 0")
    private Long noOfProductCategory = 0L;

    @Column( name = "approve_at" )
    private LocalDateTime approveAt;

    @Column( name = "no_of_approved", columnDefinition = "bigint default 0")
    private Long noOfApproved = 0L;

    @Enumerated
    @Column( name = "latest_modification_stage" )
    private ProjectionType latestModificationStage = ProjectionType.SEASON;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn( name = "parent_projection_id", foreignKey = @ForeignKey( name = "fk_projection_parent_projection_id" ) )
    private Projection parentProjection;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_projection_brand_id" ) )
    private Brand brand;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn( name = "buying_cycle_id", foreignKey = @ForeignKey( name = "fk_projection_buying_cycle_id" ) )
    private BuyingCycle buyingCycle;

    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "product_group_id", foreignKey = @ForeignKey( name ="fk_projection_product_group_id" ) )
    private ProductGroup productGroup;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn( name = "country_id", foreignKey = @ForeignKey( name = "fk_projection_country_id" ) )
    private Country country;

    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "projected_by", foreignKey = @ForeignKey( name = "fk_projection_projected_by" ) )
    private User projectedBy;

    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "approve_by", foreignKey = @ForeignKey( name = "fk_projection_approve_by" ) )
    private User approveBy;

    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "buyer_by", foreignKey = @ForeignKey( name = "fk_projection_buyer_by" ) )
    private User buyer;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "projection" )
    private Set<ProjectionProductCategoryMap> categoryMapSet = new HashSet<>();



    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projection that = (Projection) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash(id);
    }

    @Override
    public Projection clone() {

        Projection projection = new Projection();
        BeanUtils.copyProperties( this, projection );

        projection.setId( null );
        projection.setParentProjection( this );
        Set<ProjectionProductCategoryMap> projectionProductCategoryMapset = projection.getCategoryMapSet()
                .stream()
                .map( item -> {
                    ProjectionProductCategoryMap newItem = item.clone();
                    newItem.setProjection( this );
                    return newItem;
                } )
                .collect( Collectors.toSet() );
        projection.setCategoryMapSet( projectionProductCategoryMapset );

        return projection;
    }
}
