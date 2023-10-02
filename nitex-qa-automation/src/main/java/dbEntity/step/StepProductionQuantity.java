package dbEntity.step;

import dbEntity.audit.AuditableEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table( name = "step_production_quantity" )
public class StepProductionQuantity extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "step_production_quantity_id_seq_generator" )
    @SequenceGenerator( name = "step_production_quantity_id_seq_generator", sequenceName = "step_production_quantity_id_seq" )
    private Long id;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "step_id", foreignKey = @ForeignKey( name = "fk_step_production_quantity_step_id" ) )
    private Step step;

    @Column( name = "quantity" )
    private Integer quantity;

    @Column( name = "production_date" )
    private LocalDate productionDate;
}
