package dbEntity.user;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class UserProductPair implements Serializable {

    @Column( name = "user_id" )
    private Long userId;

    @Column( name = "product_id" )
    private Long productId;

    public UserProductPair(Long userId, Long productId) {
        this.userId = userId;
        this.productId = productId;
    }

    public UserProductPair() {
    }
}
