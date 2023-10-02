package dbEntity.category;

import dbEntity.product.ProductGroup;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table( name = "product_sub_category" )
public class ProductSubCategory {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "product_sub_category_sequence_generator" )
    @SequenceGenerator( name = "product_sub_category_sequence_generator", sequenceName = "product_sub_category_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "is_primary", columnDefinition = "boolean default false" )
    private Boolean isPrimary = false;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "category_id", foreignKey = @ForeignKey( name = "fk_product_sub_category_category_id" ) )
    private Category category;

    @ManyToMany( fetch=FetchType.LAZY , cascade = { CascadeType.PERSIST , CascadeType.MERGE } )
    @JoinTable(
            name = "product_sub_category_group_map",
            joinColumns = @JoinColumn( name = "product_sub_category_id" ),
            inverseJoinColumns = @JoinColumn( name = "product_group_id" ),
            foreignKey = @ForeignKey( name = "fk_product_sub_category_group_map_sub_category_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_product_sub_category_group_map_group_id" ) )
    Set<ProductGroup> productGroupSet = new HashSet<>();
}
