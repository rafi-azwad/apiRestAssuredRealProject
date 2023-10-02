package dbEntity.notification;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@Table( name = "seen_notification" )
@ToString( exclude = { "notification" })
@EqualsAndHashCode( exclude = { "notification" })
public class SeenNotification {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "seen_notification_sequence_generator" )
    @SequenceGenerator( name = "seen_notification_sequence_generator", sequenceName = "seen_notification_sequence" )
    private Long id;

    @Column( name = "user_id" )
    private Long userId;

    @Column( name = "is_seen" )
    private Boolean isSeen = false;

    @Column( name = "is_latest_seen" )
    private Boolean isLatestSeen = false;

    @Column( name = "is_important" )
    private Boolean isImportant = false;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "notification_id", foreignKey = @ForeignKey( name = "fk_seen_notification_notification_id" ) )
    private Notification notification;
}
