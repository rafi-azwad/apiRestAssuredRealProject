package dbEntity.stage;

import dbEntity.enums.Status;
import dbEntity.order.Order;
import dbEntity.step.StepScope;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Entity
@DynamicUpdate
@Table( name = "stage" )
public class Stage {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "stage_sequence_generator" )
    @SequenceGenerator( name = "stage_sequence_generator", sequenceName = "stage_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "stage_name" )
    private String stageName;

    @Column( name = "duration_days" )
    private Long durationDays;

    @Column( name = "step_scope" )
    private StepScope stepScope;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @Column( name = "constants" )
    private StageConstants constants;

    @Column( name = "stage_sequence_index" )
    private Long stageSequenceIndex;

    @Column( name = "stage_master_id" )
    private Long stageMasterId;

    @Column( name = "start_date" )
    private LocalDateTime startDate;

    @Column( name = "end_date" )
    private LocalDateTime endDate;

    @Column( name = "actual_end_date" )
    private LocalDateTime actualEndDate;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "order_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_stage_order_id" ) )
    private Order order;

    @Override
    public boolean equals( Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Stage stage = (Stage) o;
        return id != null && Objects.equals(id, stage.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }

}
