package dbEntity.user;

import dbEntity.notification.EntityType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "user_entity_seen_map" )
@IdClass( UserEntitySeenMapId.class )
public class UserEntitySeenMap {

    @Id
    @Column( name = "user_id" )
    private Long userId;

    @Id
    @Column( name = "entity_type" )
    private EntityType entityType;

    @Id
    @Column( name = "entity_id" )
    private Long entityId;

    @Column( name ="seen_date" )
    private Date seenDate;

    public UserEntitySeenMap( Long userId, EntityType entityType, Long entityId ){
        this.userId = userId;
        this.entityType = entityType;
        this.entityId = entityId;
    }

}
