package dbEntity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCollectionFavMapId implements Serializable {
    private Long collectionId;
    private Long userId;
}
