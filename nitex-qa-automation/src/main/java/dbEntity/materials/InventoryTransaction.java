package dbEntity.materials;

import dbEntity.audit.AuditableEntity;
import dbEntity.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.Hibernate;

import java.util.Objects;

@Data
@Accessors( chain = true )
@Entity
@Table( name = "inventory_transaction" )
public class InventoryTransaction  extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "inventory_transaction_id_generator" )
    @SequenceGenerator( name = "inventory_transaction_id_generator", sequenceName = "inventory_transaction_id_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "transaction_type", nullable = false )
    private TransactionType transactionType;

    @Column( name = "quantity" )
    private Double quantity;

    /* ex. ( issue id, received id etc.. ) */
    @Column( name = "reference_id" )
    private Long referenceId;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "material_id", nullable = false, foreignKey = @ForeignKey( name = "fk_inventory_transaction_material_id" ) )
    private Material material;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        InventoryTransaction inventoryTransaction = (InventoryTransaction) o;
        return id != null && Objects.equals(id, inventoryTransaction.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }

}
