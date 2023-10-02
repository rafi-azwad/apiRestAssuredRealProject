package dbEntity.workflow;

import dbEntity.enums.Status;
import dbEntity.notification.EntityType;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table( name = "workflow" )
@IdClass( WorkflowId.class )
public class Workflow {

    @Id
    @Column( name = "type" )
    private WorkflowType type;

    @Id
    @Column( name = "step" )
    private WorkflowStep step;

    @Id
    @Column( name = "entity_type" )
    private EntityType entityType;

    @Id
    @Column( name = "entity_id" )
    private Long entityId;

    @Column( name = "status" )
    private Status status;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinTable(
            name = "workflow_members",
            joinColumns = {
                    @JoinColumn( name = "workflow_type", referencedColumnName = "type" ),
                    @JoinColumn( name = "workflow_step", referencedColumnName = "step" ),
                    @JoinColumn( name = "workflow_entity_type", referencedColumnName = "entity_type" ),
                    @JoinColumn( name = "workflow_entity_id", referencedColumnName = "entity_id" )
            },
            inverseJoinColumns = @JoinColumn( name = "user_id", referencedColumnName = "id" ),
            foreignKey = @ForeignKey( name = "fk_workflow_members_workflow_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_workflow_members_user_id" )
    )
    private Set<User> memberSet = new HashSet<>();
}
