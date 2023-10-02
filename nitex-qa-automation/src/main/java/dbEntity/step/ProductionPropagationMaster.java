package dbEntity.step;

import dbEntity.stage.DeliverableApplicableFabric;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "production_propagation_master" )
@IdClass( ProductionPropagationMasterId.class )
public class ProductionPropagationMaster {

    @Id
    @Column( name = "current_step_id" )
    private Long currentStepId;

    @Id
    @Column( name = "next_step_id" )
    private Long nextStepId;

    @Id
    @Column( name = "applicable_fabric" )
    private DeliverableApplicableFabric applicableFabric;
}
