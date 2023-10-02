package dbEntity.product;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;

@Data
@Entity
@Table( name = "product_group", uniqueConstraints = @UniqueConstraint( columnNames = { "name" }, name = "uk_product_group_name" ) )
public class ProductGroup implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "product_group_sequence_generator")
    @SequenceGenerator( name="product_group_sequence_generator", sequenceName = "product_group_sequence", initialValue = 1 )
    @Column( name = "id" )
    private Long id;

    @Size( min = 1, max = 300 )
    @Column( name = "name" )
    private String name;

    @Column( name = "code" )
    private String code;

    @Column( name = "presentation_order" )
    private Integer presentationOrder;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "parent_product_group", foreignKey = @ForeignKey( name ="product_group_product_group_id_fk" ) )
    @ToString.Exclude
    private ProductGroup parentProductGroup;

    @Override
    public ProductGroup clone() {

        ProductGroup productGroup = new ProductGroup();
        productGroup.setName( this.name );
        productGroup.setCode( this.code );
        productGroup.setParentProductGroup( this.parentProductGroup );

        return productGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductGroup that = (ProductGroup) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
