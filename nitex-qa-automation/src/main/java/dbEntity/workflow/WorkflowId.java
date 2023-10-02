package dbEntity.workflow;


import dbEntity.notification.EntityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkflowId implements Serializable {
    private WorkflowType type;
    private WorkflowStep step;
    private EntityType entityType;
    private Long entityId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkflowId that = (WorkflowId) o;
        return type == that.type && step == that.step && entityType == that.entityType && Objects.equals(entityId, that.entityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, step, entityType, entityId);
    }
}
