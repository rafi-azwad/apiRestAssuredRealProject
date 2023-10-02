package dbEntity.materials;

import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.Hibernate;

import java.time.LocalDate;
import java.util.Objects;

@Data
@Accessors( chain = true )
@Entity
@Table( name = "inventory_issue_log" )
public class InventoryIssueLog {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "inventory_issue_log_id_generator" )
    @SequenceGenerator( name = "inventory_issue_log_id_generator", sequenceName = "inventory_issue_log_id_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "issue_date" )
    private LocalDate issueDate;

    @Column( name = "quantity" )
    private Double quantity;

    @Column( name = "remarks" )
    private String remarks;

    @Column( name = "is_editable" )
    private Boolean isEditable;


    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "user_id", nullable = false, foreignKey = @ForeignKey( name = "fk_inventory_issue_log_user_id" ) )
    private User user;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "material_id", nullable = false, foreignKey = @ForeignKey( name = "fk_inventory_issue_log_material_id" ) )
    private Material material;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        InventoryIssueLog issueInventory = (InventoryIssueLog) o;
        return id != null && Objects.equals(id, issueInventory.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }
}
