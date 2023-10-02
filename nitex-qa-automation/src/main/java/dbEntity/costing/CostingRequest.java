package dbEntity.costing;

import dbEntity.audit.AuditableEntity;
import dbEntity.collection.Collection;
import dbEntity.enums.Status;
import dbEntity.product.Product;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@Entity
@Table( name = "costing_request" )
@NoArgsConstructor
public class CostingRequest extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "costing_request_id_generator" )
    @SequenceGenerator( name = "costing_request_id_generator", sequenceName = "costing_request_id_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "status", nullable = false )
    private Status status = Status.REQUESTED;

    @Column( name = "type" )
    private CostingRequestType type = CostingRequestType.INITIAL_COSTING;

    @Transient
    private Long productId;

    @Column( name = "completed_date" )
    private LocalDateTime completedDate;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "fk_costinq_request_product_id" ) )
    private Product product;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "collection_id", foreignKey = @ForeignKey( name = "fk_costinq_request_collection_id" ) )
    private Collection collection;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "costing_sheet_price_id", foreignKey = @ForeignKey( name = "fk_costinq_request_costing_sheet_price_id" ) )
    private QuantityWiseCostingSheetPrice costingSheetPrice;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "assigned_to", foreignKey = @ForeignKey( name = "fk_costinq_request_user_id" ) )
    private User assignedTo;

    public CostingRequest( Long id, Status status, Long productId ) {
        this.id = id;
        this.status = status;
        this.productId = productId;
    }
}
