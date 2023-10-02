package dbEntity.brand;


import dbEntity.category.ProductSubCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table( name = "brand_product_sub_category_map" )
@IdClass( BrandProductSubCategoryId.class )
public class BrandProductSubCategoryMap {

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_brand_product_sub_category_map_brand_id" ) )
    private Brand brand;

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "product_sub_category_id", foreignKey = @ForeignKey( name = "fk_brand_product_sub_category_map_product_sub_category_id" ) )
    private ProductSubCategory productSubCategory;

    @Column( name = "min_price" )
    private Double minPrice;

    @Column( name = "max_price" )
    private Double maxPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrandProductSubCategoryMap that = (BrandProductSubCategoryMap) o;
        return Objects.equals( brand.getId(), that.brand.getId() ) && Objects.equals( productSubCategory.getId(), that.productSubCategory.getId() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( brand.getId(), productSubCategory.getId() );
    }
}
