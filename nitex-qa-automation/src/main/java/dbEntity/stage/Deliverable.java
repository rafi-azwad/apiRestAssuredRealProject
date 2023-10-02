package dbEntity.stage;

import dbEntity.order.Order;
import dbEntity.product.Product;
import dbEntity.rfq.ProductInfoForRfq;
import dbEntity.step.Step;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table( name = "deliverable" )
public class Deliverable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "deliverable_id_sequence_generator" )
    @SequenceGenerator( name = "deliverable_id_sequence_generator", sequenceName = "deliverable_id_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "applicable_fabric" )
    private DeliverableApplicableFabric applicableFabric;

    @Column( name = "material_type" )
    private DeliverableMaterialTypeFlag materialType;

    @Column( name = "sequence_index" )
    private Long sequenceIndex;

    @Column( name = "deliverable_master_id" )
    private Long deliverableMasterId;

    @Column( name = "is_critical" )
    private Boolean isCritical;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "order_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_deliverable_order_id") )
    @ToString.Exclude
    private Order order;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "product_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_deliverable_product_id") )
    @ToString.Exclude
    private Product product;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_info_for_rfq_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_deliverable_product_info_for_rfq_id" ) )
    private ProductInfoForRfq productInfoForRfq;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "stage_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_deliverable_stage_id") )
    @ToString.Exclude
    private Stage stage;

    @OneToMany( mappedBy = "deliverable", fetch = FetchType.LAZY )
    private Set<Step> stepSet;

    @Override
    public boolean equals( Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Deliverable deliverable = (Deliverable) o;
        return id != null && Objects.equals(id, deliverable.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }
}
