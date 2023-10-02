package dbEntity.step;

import dbEntity.stage.DeliverableApplicableFabric;
import lombok.Data;

import java.io.Serializable;

@Data
public class ProductionPropagationMasterId implements Serializable {
    private Long currentStepId;
    private Long nextStepId;
    private DeliverableApplicableFabric applicableFabric;
}
