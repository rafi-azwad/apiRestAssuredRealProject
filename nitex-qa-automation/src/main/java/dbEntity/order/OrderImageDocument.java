package dbEntity.order;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table( name = "order_image_document")
public class OrderImageDocument {

    @Id
    @Column( name = "id" )
    private Long id;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }  )
    @JoinColumn( name = "order_id", foreignKey = @ForeignKey( name = "fk_order_image_document_order_id" ) )
    private  Order order;

    @Column( name = "product_ids" , columnDefinition = "bigint[]" )
    @Type( ListArrayType.class )
    private List<Long> productIds;

    @Column( name = "product_design_paths" , columnDefinition = "text[]" )
    @Type( ListArrayType.class )
    private  List<String> productDesignPaths;

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        OrderImageDocument orderImageDocument = ( OrderImageDocument ) o;
        return Objects.equals( id, orderImageDocument.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }
}
