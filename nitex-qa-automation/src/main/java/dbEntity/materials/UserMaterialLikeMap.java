package dbEntity.materials;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table( name = "user_material_fav_map" )
public class UserMaterialLikeMap {

    @EmbeddedId
    private UserMaterialPair userMaterialPair;

    @Column( name ="date_added" )
    private Date dateAdded = new Date();

    @Column( name = "is_seen" )
    private Boolean isSeen = false;
}