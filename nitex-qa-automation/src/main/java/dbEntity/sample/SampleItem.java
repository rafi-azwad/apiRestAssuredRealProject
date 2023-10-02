package dbEntity.sample;

import dbEntity.audit.AuditableEntity;
import dbEntity.enums.Status;
import dbEntity.organogram.OperationalUnit;
import dbEntity.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(
        name = "sample_item",
        indexes = @Index( name="index__sample_item__sample_request_id", columnList = "sample_request_id" )
)
@NoArgsConstructor
@AllArgsConstructor
public class SampleItem extends AuditableEntity {

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "sample_item_sequence_generator" )
    @SequenceGenerator( name = "sample_item_sequence_generator", sequenceName = "sample_item_sequence" )
    private Long id;

    @Column( name = "required_date" )
    private LocalDate requiredDate;

    @Column( name = "estimated_delivery_date" )
    private LocalDate estimatedDeliveryDate;

    @Column( name = "remarks" )
    private String remarks;

    @Column( name = "material" )
    private String material;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @Column( name = "buyer_approval_status" )
    private Status buyerApprovalStatus = Status.PENDING;

    @Column( name = "pattern_completed_status" )
    private Status patternCompletedStatus = Status.PENDING;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "operational_unit_id", foreignKey = @ForeignKey( name = "fk_sample_item_operational_unit_id" ) )
    private OperationalUnit operationalUnit;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "current_pending_activity", foreignKey = @ForeignKey( name = "fk_sample_item_current_pending_activity" ) )
    private SampleItemActivity currentPendingActivity;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "sample_request_id", foreignKey = @ForeignKey( name = "fk_sample_item_sample_request_id" ) )
    private SampleRequest sampleRequest;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "fk_sample_item_product_id" ) )
    private Product product;

    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "sampleItem" )
    private Set<SampleItemDetails> sampleItemDetails = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "sampleItem" )
    private Set<SampleItemActivity> itemActivities = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleItem that = (SampleItem) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return product.hashCode();
        return Objects.hash(id);
    }

    public SampleItem ( Product product ) {
        this.product = product;
    }
}
