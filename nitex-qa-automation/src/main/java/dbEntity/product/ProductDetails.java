package dbEntity.product;

import dbEntity.brand.Brand;
import dbEntity.supplier.FixedTag;
import dbEntity.supplier.FreeTextTag;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table( name = "product_details" )
public class ProductDetails implements Cloneable {

    @Id
    private Long id;

    @Column( name = "has_print" )
    private Boolean hasPrint = true;

    @Column( name = "has_wash" )
    private Boolean hasWash = true;

    @Column( name = "has_embroidery" )
    private Boolean hasEmbroidery = true;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinColumn( name = "fitting_type_tag_id", foreignKey = @ForeignKey( name = "fk_product_fitting_type_tag_id" ) )
    private FreeTextTag fittingTypeTag;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinColumn( name = "rise_tag_id", foreignKey = @ForeignKey( name = "fk_product_rise_tag_id" ) )
    private FreeTextTag riseTag;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinColumn( name = "length_tag_id", foreignKey = @ForeignKey( name = "fk_product_length_tag_id" ) )
    private FreeTextTag lengthTag;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "size_standard_tag_id", foreignKey = @ForeignKey( name = "fk_product_size_standard_tag_id" ) )
    private FixedTag sizeStandardTag;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "inspiration_brand_id", foreignKey = @ForeignKey( name = "fk_product_inspiration_brand_id" ) )
    private Brand inspirationBrand;

    @ManyToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinTable(
            name = "product_embellishment_details_map",
            joinColumns = @JoinColumn( name = "product_id"),
            inverseJoinColumns = @JoinColumn( name = "embellishment_details_id" ),
            foreignKey = @ForeignKey( name = "fk_product_embellishment_details_map_product_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_product_embellishment_details_map_embellishment_id" ) )
    private Set<EmbellishmentDetails> embellishmentDetailsSet = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductDetails that = (ProductDetails) o;
        return Objects.equals( id, that.id );
    }

    @Override
    public int hashCode() {
        if ( this.id != null )
            return Objects.hash( this.id );
        return System.identityHashCode( this );
    }
}
