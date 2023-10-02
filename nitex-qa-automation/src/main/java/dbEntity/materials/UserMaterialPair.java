package dbEntity.materials;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class  UserMaterialPair implements Serializable {

    @Column( name = "user_id" )
    private Long userId;

    @Column( name = "material_id" )
    private Long materialId;

    public UserMaterialPair(Long userId, Long materialId) {
        this.userId = userId;
        this.materialId = materialId;
    }

    public UserMaterialPair() {
    }
}
