package dbEntity.post;

import dbEntity.log.ActionType;
import dbEntity.log.ActivityModule;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Table( name = "order_timeline_view" )
@IdClass( OrderTimelineViewId.class )
public class OrderTimelineView {

    @Id
    private Long id;

    @Id
    @Column( name = "table_name" )
    private String tableName;

    @Column( name = "activity_module" )
    private ActivityModule activityModule;

    @Column( name = "action_type" )
    private ActionType actionType;

    @Column( name = "order_id" )
    private Long orderId;

    @Column( name = "product_id" )
    private Long productId;

    @Column( name = "created_by" )
    private Long createdBy;

    @Column( name = "created_at" )
    private LocalDateTime createdAt;

    @Column( name = "show_in_timeline" )
    private Boolean showInTimeline;

}
