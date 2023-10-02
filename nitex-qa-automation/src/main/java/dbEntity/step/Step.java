package dbEntity.step;

import dbEntity.enums.Status;
import dbEntity.order.Order;
import dbEntity.order.OrderMaterials;
import dbEntity.product.Product;
import dbEntity.rfq.ProductInfoForRfq;
import dbEntity.stage.Deliverable;
import dbEntity.stage.Stage;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table( name = "step" )
@NoArgsConstructor
public class Step {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "step_sequence_generator" )
    @SequenceGenerator( name = "step_sequence_generator", sequenceName = "step_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "step_name" )
    private String stepName;

    @Column( name = "step_description" )
    private String stepDescription;

    @Column( name = "pending_dashboard_name" )
    private String pendingDashboardName;

    @Column( name = "completed_dashboard_name" )
    private String completedDashboardName;

    @Column( name = "completed_action" )
    private String completedAction;

    @Column( name = "completed_acted_upon" )
    private String completedActedUpon;

    @Column( name = "step_type" )
    private StepType stepType = StepType.TASK;

    @Column( name = "step_scope" )
    private StepScope stepScope;

    @Column( name = "duration_days" )
    private Long durationDays;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @Column( name = "step_sequence_index" )
    private Long stepSequenceIndex;

    @Column( name = "revision_count" )
    private Long revisionCount;

    @Column( name = "production_target" )
    private Integer productionTarget;

    @Column( name = "actual_production_quantity" )
    private Integer actualProductionQuantity;

    @Column( name = "start_date" )
    private LocalDateTime startDate;

    @Column( name = "end_date" )
    private LocalDateTime endDate;

    @Column( name = "actual_end_date" )
    private LocalDateTime actualEndDate;

    @CreatedDate
    @Column( name = "created_date" )
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Column( name = "updated_date" )
    private LocalDateTime updatedDate;

    @Column( name = "icon" )
    private StepIcon icon;

    @Column( name = "is_deleted" )
    private Boolean isDeleted = false;

    @Column( name = "not_applicable" )
    private Boolean notApplicable = false;

    @Column( name = "is_subtask" )
    private Boolean isSubTask = false;

    @Column( name = "is_buyer_approval_needed" )
    private Boolean isBuyerApprovalNeeded;

    @Column( name = "step_master_id" )
    private Long stepMasterId;

    @Column( name = "original_start_date" )
    private LocalDateTime previousStartDate;

    @Column( name = "original_end_date" )
    private LocalDateTime previousEndDate;

    @Column( name = "template_version" )
    private TemplateVersion templateVersion = TemplateVersion.FOUR;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "added_by", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_step_user_id") )
    @ToString.Exclude
    private User addedBy;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "deliverable_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_step_master_deliverable_id" ) )
    private Deliverable deliverable;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "stage_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_step_stage_id" ) )
    @ToString.Exclude
    private Stage stage;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "product_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_step_product_id" ) )
    @ToString.Exclude
    private Product product;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_info_for_rfq_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_step_product_info_for_rfq_id" ) )
    private ProductInfoForRfq productInfoForRfq;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "order_material_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_step_order_material_id" ) )
    @ToString.Exclude
    private OrderMaterials orderMaterials;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "order_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_step_order_id" ) )
    @ToString.Exclude
    private Order order;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "parent_step_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_step_parent_step_id" ) )
    @ToString.Exclude
    private Step parentStep;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "step", cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @ToString.Exclude
    private Set<StepProductionQuantity> productionQuantitySet = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinTable(
            name = "step_members",
            joinColumns = @JoinColumn( name = "step_id", referencedColumnName = "id" ),
            inverseJoinColumns = @JoinColumn( name = "user_id", referencedColumnName = "id" ),
            foreignKey = @ForeignKey( name = "fk_step_member_step_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_step_member_user_id" )
    )
    @ToString.Exclude
    private Set<User> memberSet;

    @ManyToMany( fetch = FetchType.LAZY )
    @JoinTable(
            name = "step_dependency_map",
            joinColumns = @JoinColumn( name = "step_id" ),
            inverseJoinColumns = @JoinColumn( name = "dependent_step_id" ),
            foreignKey = @ForeignKey( name = "fk_step_master_dependency_map_step_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_step_master_dependency_map_dependent_step_id" )
    )
    @ToString.Exclude
    private Set<Step> dependencySet;


    public Step( Long id, String stepName ) {
        this.id = id;
        this.stepName = stepName;
    }

    @Override
    public boolean equals( Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Step step = (Step) o;
        return id != null && Objects.equals(id, step.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }
}
