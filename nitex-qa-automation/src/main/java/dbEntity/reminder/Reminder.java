package dbEntity.reminder;

import dbEntity.notification.EntityType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "reminder" )
public class Reminder {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "reminder_sequence" )
    @SequenceGenerator( name = "reminder_sequence", sequenceName = "reminder_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "entity_id" )
    private Long entityId;

    @Column( name = "entity_type" )
    private EntityType entityType;

    @Column( name = "notification_id" )
    private String notificationId;

    @Column( name = "response_message", columnDefinition = "TEXT" )
    private String responseMessage;
}
