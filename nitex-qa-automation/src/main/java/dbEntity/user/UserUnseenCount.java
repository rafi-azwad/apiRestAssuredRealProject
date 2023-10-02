package dbEntity.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "user_unseen_count" )
public class UserUnseenCount {

    @Id
    @Column( name = "user_id" )
    private Long userId;

    @Column( name = "collection_favourite_count" )
    private Long collectionFavouriteUnseenCount = 0L;
}
