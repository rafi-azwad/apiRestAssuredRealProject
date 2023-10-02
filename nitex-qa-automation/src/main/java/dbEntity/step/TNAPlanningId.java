package dbEntity.step;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TNAPlanningId implements Serializable {
    private Long orderId;
    private Long rfqId;
}
