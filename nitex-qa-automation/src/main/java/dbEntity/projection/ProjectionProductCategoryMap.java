package dbEntity.projection;

import dbEntity.category.Category;
import dbEntity.enums.Status;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
@Table( name = "projection_product_category_map" )
public class ProjectionProductCategoryMap {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "projection_product_category_map_sequence_generator" )
    @SequenceGenerator( name = "projection_product_category_map_sequence_generator", sequenceName = "projection_product_category_map_sequence" )
    private Long id;

    @Column( name = "target_style", columnDefinition = "bigint default 0")
    private Long targetStyle = 0L;

    @Column( name = "approved_style", columnDefinition = "bigint default 0")
    private Long approvedStyle = 0L;

    @Column( name = "approved_amount" )
    private BigDecimal approvedAmount = BigDecimal.ZERO;
    @Column( name = "amount" )
    private BigDecimal amount = BigDecimal.ZERO;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @Column( name = "remarks" )
    private String remarks;

    @Column( name = "approve_at" )
    private LocalDateTime approveAt;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn( name = "projection_id", foreignKey = @ForeignKey( name = "fk_projection_product_category_map_projection_id" ) )
    private Projection projection;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn( name = "sub_category_id", foreignKey = @ForeignKey( name = "fk_projection_product_category_map_category_id" ) )
    private Category category;

    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "approve_by", foreignKey = @ForeignKey( name = "fk_projection_product_category_map_approve_by" ) )
    private User approveBy;

    public ProjectionProductCategoryMap( Projection projection, Category category ) {
        this.projection = projection;
        this.category = category;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectionProductCategoryMap that = (ProjectionProductCategoryMap) o;
        return id != null && Objects.equals( id, that.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }

    @Override
    public ProjectionProductCategoryMap clone() {

        ProjectionProductCategoryMap projectionProductCategoryMap = new ProjectionProductCategoryMap();
        BeanUtils.copyProperties( this, projectionProductCategoryMap);

        projectionProductCategoryMap.setId( null );

        return projectionProductCategoryMap;
    }

}
