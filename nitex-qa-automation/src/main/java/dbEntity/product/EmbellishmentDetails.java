package dbEntity.product;

import dbEntity.supplier.Supplier;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.Objects;

@Data
@Entity
@Table( name = "embellishment_details" )
public class EmbellishmentDetails implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "embellishment_details_id_seq_generator" )
    @SequenceGenerator( name = "embellishment_details_id_seq_generator", sequenceName = "embellishment_details_id_seq" )
    private Long id;

    @Column( name = "category" )
    private ProductEmbellishmentCategory category;

    @Column( name = "description", length = 4000 )
    private String description;

    @Column( name = "price" )
    private Double price;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_embellishment_details_supplier_id" ) )
    private Supplier supplier;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmbellishmentDetails that = (EmbellishmentDetails) o;
        return Objects.equals( id, that.id );
    }

    @Override
    public int hashCode() {
        if ( this.id != null )
            return Objects.hash( this.id );
        return System.identityHashCode( this );
    }
}
