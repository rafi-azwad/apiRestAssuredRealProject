package dbEntity.product;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductAccessibilityId implements Serializable {

    private Long userId;
    private Long productId;
    private ProductAccessibilityType accessibilityType;
}
