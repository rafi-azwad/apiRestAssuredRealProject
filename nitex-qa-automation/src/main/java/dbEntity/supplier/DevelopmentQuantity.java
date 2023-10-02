package dbEntity.supplier;

import dbEntity.audit.AuditableEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Objects;

@Data
@Entity
@Table( name = "supplier_development_quantity" )
public class DevelopmentQuantity extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "supplier_development_quantity_id_seq_generator" )
    @SequenceGenerator( name = "supplier_development_quantity_id_seq_generator", sequenceName = "supplier_development_quantity_id_seq" )
    private Long id;

    @Column( name = "type", nullable = false )
    private SupplierType type;

    @Column( name = "quantity" )
    private Integer quantity;

    @Column( name = "production_date" )
    private LocalDate productionDate;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_supplier_development_quantity_supplier_id" ) )
    private Supplier supplier;

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        DevelopmentQuantity developmentQuantity = ( DevelopmentQuantity ) o;
        return Objects.equals( id, developmentQuantity.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }
}
