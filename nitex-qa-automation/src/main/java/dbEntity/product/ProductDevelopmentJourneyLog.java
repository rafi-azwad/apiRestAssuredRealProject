package dbEntity.product;

import dbEntity.audit.AuditableEntity;
import dbEntity.enums.Status;
import dbEntity.sample.SampleActivityType;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Entity
@Table( name = "product_development_journey_log" )
public class ProductDevelopmentJourneyLog extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "product_development_journey_log_generator" )
    @SequenceGenerator( name = "product_development_journey_log_generator", sequenceName = "product_development_journey_log_seq" )
    private Long id;

    @Column( name = "activity_type" )
    private SampleActivityType activityType;

    @Column( name = "required_date" )
    private LocalDate requiredDate;

    @Column( name = "completed_date" )
    private LocalDateTime deliveryDate;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "assigned_to", foreignKey = @ForeignKey( name = "fk_product_development_assigned_to" ) )
    private User assignedTo;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "fk_product_development_product_id" ) )
    private Product product;


    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        ProductDevelopmentJourneyLog log = ( ProductDevelopmentJourneyLog ) o;
        return Objects.equals( id, log.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }
}
