package dbEntity.user;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table( name = "user_collection_fav_map" )
@IdClass( UserCollectionFavMapId.class )
public class UserCollectionFavMap {

    @Id
    @Column( name = "collection_id" )
    private Long collectionId;

    @Id
    @Column( name = "user_id" )
    private Long userId;

    @Column( name = "liked_count" )
    private Long likedCount;

    @Column( name ="max_date_added" )
    private Date maxDateAdded;

    @Column( name = "product_count" )
    private Long productCount;
}
