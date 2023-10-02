package dbEntity.projection;


import dbEntity.audit.AuditableEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table( name = "projection_history" )
public class ProjectionHistory extends AuditableEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "projection_history_sequence_generator" )
    @SequenceGenerator( name = "projection_history_sequence_generator", sequenceName = "projection_history_sequence" )
    private Long id;

    @Column( name = "approved_amount" )
    private BigDecimal approvedAmount;
    @Column( name = "amount" )
    private BigDecimal amount;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn( name = "projection_id", foreignKey = @ForeignKey( name = "fk_projection_history_projection_id" ) )
    private Projection projection;

    public ProjectionHistory( BigDecimal approvedAmount, BigDecimal amount, Projection projection) {
        this.approvedAmount = approvedAmount;
        this.amount = amount;
        this.projection = projection;
    }
}
