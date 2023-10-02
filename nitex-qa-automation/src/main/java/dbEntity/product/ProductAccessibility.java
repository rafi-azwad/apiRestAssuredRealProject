package dbEntity.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table( name = "product_accessibility" )
@IdClass( ProductAccessibilityId.class )
@AllArgsConstructor
@NoArgsConstructor
public class ProductAccessibility {

    @Id
    @Column( name = "user_id" )
    private Long userId;

    @Id
    @Column( name = "product_id" )
    private Long productId;

    @Id
    @Column( name = "accessibility_type" )
    private ProductAccessibilityType accessibilityType;

}
