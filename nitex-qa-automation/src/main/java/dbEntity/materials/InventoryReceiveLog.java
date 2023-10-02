package dbEntity.materials;

import dbEntity.supplier.Supplier;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.Hibernate;

import java.time.LocalDate;
import java.util.Objects;

@Data
@Accessors( chain = true )
@Entity
@Table( name = "inventory_receive_log" )
public class InventoryReceiveLog {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "inventory_receive_log_id_generator" )
    @SequenceGenerator( name = "inventory_receive_log_id_generator", sequenceName = "inventory_receive_log_id_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "received_date" )
    private LocalDate receivedDate;

    @Column( name = "quantity" )
    private Double quantity;

    @Column( name = "unit_price" )
    private Double unitPrice;

    @Column( name = "material_type" )
    private MaterialType materialType;

    @Column( name = "remarks" )
    private String remarks;

    @Column( name = "is_editable" )
    private Boolean isEditable;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "location_id", foreignKey = @ForeignKey( name = "fk_inventory_receive_log_location_id" ) )
    private InventoryRACLocation racLocation;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "user_id", nullable = false, foreignKey = @ForeignKey( name = "fk_inventory_receive_log_user_id" ) )
    private User user;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_inventory_receive_log_supplier_id" ) )
    private Supplier supplier;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "material_id", nullable = false, foreignKey = @ForeignKey( name = "fk_inventory_receive_log_material_id" ) )
    private Material material;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        InventoryReceiveLog inventoryReceiveLog = (InventoryReceiveLog) o;
        return id != null && Objects.equals(id, inventoryReceiveLog.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }
}
