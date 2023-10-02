package dbEntity.notification;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import dbEntity.post.RelatedEntityId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table( name = "notification_related_entity_id" )
public class NotificationRelatedEntityId {
    @Id
    private Long id;

    @Column( name = "notification_category" )
    private NotificationCategory notificationCategory;

    @Column( name = "notification_event" )
    private NotificationEvent notificationEvent;

    @Column( name = "front_end_notification_event" )
    private NotificationEvent.FrontEndNotificationEvent frontEndNotificationEvent;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Type( JsonBinaryType.class )
    @Column( name = "related_entity_id_json", columnDefinition = "jsonb" )
    private RelatedEntityId relatedEntityId;

    @Column( name = "created_at" )
    private String createdAt;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Type( ListArrayType.class )
    @Column( name = "user_id", columnDefinition = "bigint[]" )
    private List<Long> userIdList = new ArrayList<>();
}
