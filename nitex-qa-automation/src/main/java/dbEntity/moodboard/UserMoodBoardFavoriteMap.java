package dbEntity.moodboard;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table( name = "user_moodboard_fav_map" )
@IdClass( UserMoodBoardFavMapId.class )
public class UserMoodBoardFavoriteMap {

    @Id
    @Column( name = "id" )
    private Long moodBoardId;

    @Id
    @Column( name = "user_id" )
    private Long userId;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}  )
    @JoinColumn( name = "moodboard_id", foreignKey = @ForeignKey( name = "user_moodboard_fav_map_moodboard_id_fk" ) )
    private MoodBoard moodBoard;

    @Column( name ="date_added" )
    private Date dateAdded = new Date();

    @Column( name = "is_seen" )
    private Boolean isSeen = false;
}
