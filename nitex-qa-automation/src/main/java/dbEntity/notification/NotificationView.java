package dbEntity.notification;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table( name = "notification_view" )
public class NotificationView {
    @Id
    @Column( name = "id" )
    private Long id;

    @Column( name = "user_id" )
    private Long userId;

    @Column( name = "is_seen" )
    private Boolean isSeen = false;

    @Column( name = "is_important" )
    private Boolean isImportant = false;

    @Column( name = "notification_id" )
    private Long notificationId;

}
