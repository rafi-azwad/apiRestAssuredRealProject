package dbEntity.order;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table( name = "order_product_image_document" )
public class OrderProductImageDocument {

    @Id
    @Column( name = "id" )
    private Long id; // product id

    @Column( name = "product_feature_image_path" )
    private String productFeatureImagePath;

    public OrderProductImageDocument( Long id, String path ){
        this.id = id;
        this.productFeatureImagePath = path;
    }
}
