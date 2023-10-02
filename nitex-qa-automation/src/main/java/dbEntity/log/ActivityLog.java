package dbEntity.log;

import dbEntity.audit.AuditableEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table( name = "activity_log" )
@EqualsAndHashCode( callSuper = false )
public class ActivityLog extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "activity_log_generator" )
    @SequenceGenerator( name = "activity_log_generator", sequenceName = "activity_log_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "activity_module" )
    private ActivityModule activityModule;

    @Column( name = "action_type" )
    private ActionType actionType;

    @NotNull
    @Column( name = "body_text_json", columnDefinition = "TEXT" )
    private String bodyTextJson;

    @Column( name = "additional_property" )
    private String additionalProperty;

    @Column( name = "profile_image_path", columnDefinition = "TEXT" )
    private String profileImagePath;

    @Column( name = "related_entity_id_json", columnDefinition = "TEXT" )
    private String relatedEntityIdJSON;

    @Column( name = "show_in_timeline" )
    private Boolean showInTimeline;
}
