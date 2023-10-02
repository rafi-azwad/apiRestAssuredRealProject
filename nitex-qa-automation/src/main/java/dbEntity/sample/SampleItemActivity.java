package dbEntity.sample;

import dbEntity.audit.AuditableEntity;
import dbEntity.enums.Status;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "sample_item_activity",
        indexes = @Index( name="index__sample_item_activity__sample_item_id", columnList = "sample_item_id" )
)
public class SampleItemActivity extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "sample_item_activity_sequence_generator" )
    @SequenceGenerator( name = "sample_item_activity_sequence_generator", sequenceName = "sample_item_activity_sequence" )
    private Long id;

    @Column( name = "activity_type" )
    private SampleActivityType activityType;

    @Column( name = "required_date" )
    private LocalDate requiredDate;

    @Column( name = "delivery_date" )
    private LocalDateTime deliveryDate;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "assigned_to", foreignKey = @ForeignKey( name = "fk_sample_item_activity_assigned_to" ) )
    private User assignedTo;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "sample_item_id", foreignKey = @ForeignKey( name = "fk_sample_item_activity_sample_item_id" ) )
    private SampleItem sampleItem;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleItemActivity that = (SampleItemActivity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return Objects.hash( activityType );
        return Objects.hash(id);
    }

    public SampleItemActivity( SampleItem sampleItem ) {
        this.sampleItem = sampleItem;
    }

    public SampleItemActivity( SampleActivityType sampleActivityType ) {
        this.activityType = sampleActivityType;
    }


    public SampleItemActivity clone( SampleItem sampleItem ) {
        SampleItemActivity sampleItemActivity = new SampleItemActivity();
        BeanUtils.copyProperties( this, sampleItemActivity );
        sampleItemActivity.setId( null );
        sampleItemActivity.setSampleItem( sampleItem );
        return sampleItemActivity;
    }
}
