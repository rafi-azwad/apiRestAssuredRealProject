package dbEntity.supplier;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Objects;

@Data
@Entity
@Table( name = "supplier_production_capacity" )
public class SupplierProductionCapacity {

    @Id
    private Long id; // supplier id is equal to this id

    @Column( name = "sales" )
    private Double sales;

    @Column( name = "knitting" )
    private Double knitting;

    @Column( name = "dyeing" )
    private Double dyeing;

    @Column( name = "sewing" )
    private Double sewing;

    @Column( name = "finishing" )
    private Double finishing;

    @Column( name = "washing" )
    private Double washing;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_supplier_production_capacity_supplier_id" ) )
    private Supplier supplier;

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        SupplierProductionCapacity capacity = ( SupplierProductionCapacity ) o;
        return Objects.equals( id, capacity.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }
}
