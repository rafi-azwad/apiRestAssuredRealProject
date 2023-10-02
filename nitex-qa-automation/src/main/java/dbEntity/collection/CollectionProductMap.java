package dbEntity.collection;

import dbEntity.product.Product;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table( name = "collection_product_map" )
@IdClass( CollectionProductId.class )
public class CollectionProductMap {

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "collection_id", foreignKey = @ForeignKey( name = "collection_product_map_collection_id_fk" ) )
    private Collection collection;

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST} )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "collection_product_map_product_id_fk") )
    private Product product;

    public static CollectionProductMap build(Collection collection, Product product) {
        CollectionProductMap collectionProductMap = new CollectionProductMap();
        collectionProductMap.setCollection( collection );
        collectionProductMap.setProduct( product );
        return collectionProductMap;
    }

    @Override
    public int hashCode() {
        return Objects.hash( collection.getId(), product.getId() );
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        CollectionProductMap that = ( CollectionProductMap ) o;
        return Objects.equals( collection.getId(), that.collection.getId() ) && Objects.equals( product.getId(), that.product.getId() );
    }
}
