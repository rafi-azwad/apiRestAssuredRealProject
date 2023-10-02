package dbEntity.collection;

import dbEntity.enums.AvailabilityStatus;
import lombok.Data;

import java.io.Serializable;

@Data
public class CollectionStatusId implements Serializable {
    private Long collectionId;
    private AvailabilityStatus status;
}
