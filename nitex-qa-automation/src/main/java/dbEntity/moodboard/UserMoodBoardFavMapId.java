package dbEntity.moodboard;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMoodBoardFavMapId implements Serializable {
    private Long moodBoardId;
    private Long userId;
}
