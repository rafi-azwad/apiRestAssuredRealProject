package dbEntity.step;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table( name = "production_propagation" )
public class ProductionPropagation {

    @Id
    @Column( name = "current_step_id" )
    private Long currentStepId;

    @Column( name = "next_step_id" )
    private Long nextStepId;
}
