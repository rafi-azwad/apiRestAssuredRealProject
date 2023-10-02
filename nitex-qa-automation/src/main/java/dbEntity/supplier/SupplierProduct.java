package dbEntity.supplier;

import dbEntity.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicUpdate
@Table(name = "supplier_product")
public class SupplierProduct {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "supplier_product_sequence_generator")
    @SequenceGenerator( name="supplier_product_sequence_generator", sequenceName = "supplier_product_sequence", initialValue = 1 )
    @Column( name ="id" )
    private Long id;

    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY  )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_supplier_product_supplier_id" ) )
    private Supplier supplier;

    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY  )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "fk_supplier_product_product_id" ) )
    private Product product;

    public SupplierProduct( Supplier supplier, Product product ){
        this.supplier = supplier;
        this.product = product;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        SupplierProduct supplierProduct = ( SupplierProduct ) o;
        return Objects.equals( id, supplierProduct.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }

}
