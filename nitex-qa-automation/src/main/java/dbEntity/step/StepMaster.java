package dbEntity.step;

import dbEntity.stage.DeliverableMaster;
import dbEntity.stage.StageMaster;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@Entity
@Table( name = "step_master" )
@EqualsAndHashCode( exclude = {"stageMaster", "dependencySet", "stepMasterUserTypeMapSet"} )
public class StepMaster {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "step_master_sequence_generator" )
    @SequenceGenerator( name = "step_master_sequence_generator", sequenceName = "step_master_sequence" )
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
    private StepType stepType;

    @Column( name = "step_scope" )
    private StepScope stepScope;

    @Column( name = "duration_days" )
    private Long durationDays;

    @Column( name = "step_sequence_index" )
    private Long stepSequenceIndex;

    @Column( name = "icon" )
    private StepIcon icon;

    @Column( name = "not_applicable" )
    private Boolean notApplicable;

    @Column( name = "mandatory_flag" )
    private MandatoryFlag mandatoryFlag;

    @Column( name = "for_imported_material" )
    private Boolean forImportedMaterial;

    @Column( name = "is_buyer_approval_needed" )
    private Boolean isBuyerApprovalNeeded;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "stage_master_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_step_master_stage_master_id" ) )
    private StageMaster stageMaster;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "deliverable_master_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_step_master_deliverable_master_id" ) )
    private DeliverableMaster deliverableMaster;

    @ManyToMany( fetch = FetchType.LAZY )
    @JoinTable(
            name = "step_master_dependency_map",
            joinColumns = @JoinColumn( name = "step_master_id" ),
            inverseJoinColumns = @JoinColumn( name = "dependent_step_master_id" ),
            foreignKey = @ForeignKey( name = "fk_step_master_dependency_map_step_master_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_step_master_dependency_map_dependent_step_master_id" )
    )
    private Set<StepMaster> dependencySet;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "stepMaster" )
    private Set<StepMasterUserTypeMap> stepMasterUserTypeMapSet;

}
