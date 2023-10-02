package dbEntity.user;

import dbEntity.notification.EntityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntitySeenMapId implements Serializable {
    private Long userId;
    private EntityType entityType;
    private Long entityId;
}
