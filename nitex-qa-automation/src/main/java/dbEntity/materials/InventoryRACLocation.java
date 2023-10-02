package dbEntity.materials;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table( name = "inventory_rac_location" )
public class InventoryRACLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventory_rac_location_id_generator")
    @SequenceGenerator(name = "inventory_rac_location_id_generator", sequenceName = "inventory_rac_location_id_sequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "building")
    private String building;

    @Column(name = "floor")
    private String floor;

    @Column(name = "room_number")
    private String roomNumber;

    @Column(name = "rac_number")
    private String racNumber;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "racLocation" )
    private List<InventoryReceiveLog> inventoryReceiveLogList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        InventoryRACLocation racLocation = (InventoryRACLocation) o;
        return id != null && Objects.equals(id, racLocation.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }

}