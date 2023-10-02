package dbEntity.notification;

import dbEntity.audit.AuditableEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@Data
@Entity
@Table( name = "notification" )
@ToString( exclude = { "seenNotificationSet" })
@EqualsAndHashCode( callSuper = false, exclude = { "seenNotificationSet" } )
public class Notification extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "notification_sequence_generator")
    @SequenceGenerator( name="notification_sequence_generator", sequenceName = "notification_sequence", initialValue = 1 )
    @Column( name = "id" )
    private Long id;

    @Column( name = "notification_event" )
    private NotificationEvent notificationEvent;

    @Column( name = "notification_category" )
    private NotificationCategory notificationCategory;

    @NotNull
    @Column( name = "text", columnDefinition = "TEXT" )
    private String text;

    @Column( name = "profile_image_path", columnDefinition = "TEXT" )
    private String profileImagePath;

    @Column( name = "notification_image_path_json", columnDefinition = "TEXT" )
    private String notificationImagePathJson;

    @Column( name = "related_entity_id_json", columnDefinition = "TEXT" )
    private String relatedEntityIdJSON;

    @Column( name = "deleted_info_json", columnDefinition = "TEXT" )
    private String deletedInfoJson;

    @Column( name = "to_user_id_json" )
    private String toUserIdJson;

    @OneToMany( mappedBy = "notification" )
    private Set<SeenNotification> seenNotificationSet;

    @Column( name = "front_end_notification_event" )
    private NotificationEvent.FrontEndNotificationEvent frontEndNotificationEvent;

    @Column( name = "is_group" )
    private Boolean isGroup;

    @Column( name = "group_by_key" )
    private String groupByKey;

}
