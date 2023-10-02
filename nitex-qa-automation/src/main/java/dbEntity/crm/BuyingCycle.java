package dbEntity.crm;

import dbEntity.audit.AuditableEntity;
import dbEntity.brand.Brand;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Objects;

@Data
@Entity
@Table( name = "buying_cycle" )
public class BuyingCycle extends AuditableEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "buying_cycle_sequence_generator" )
    @SequenceGenerator( name = "buying_cycle_sequence_generator", sequenceName = "buying_cycle_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "start_date" )
    private LocalDate startDate;

    @Column( name = "end_date" )
    private LocalDate endDate;

    @Column( name = "remarks" )
    private String remarks;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_buying_cycle_brand_id" ) )
    private Brand brand;

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuyingCycle that = (BuyingCycle) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash(id);
    }
}
