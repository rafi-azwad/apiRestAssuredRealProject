package dbEntity.log;

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

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@Table( name = "activity_log_related_entity_id" )
public class ActivityLogRelatedEntityId {

    @Id
    private Long id;

    @Column( name = "activity_module" )
    private ActivityModule activityModule;

    @Column( name = "action_type" )
    private ActionType actionType;

    @Column( name = "show_in_timeline" )
    private Boolean showInTimeline;

    @Column( name = "created_by" )
    private Long createdBy;

    @Column( name = "created_at" )
    private LocalDateTime createdAt;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Type( JsonBinaryType.class )
    @Column( name = "related_entity_id_json", columnDefinition = "jsonb" )
    private RelatedEntityId relatedEntityId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivityLogRelatedEntityId that = (ActivityLogRelatedEntityId) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
