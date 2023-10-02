package dbEntity.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CollectionDocumentId implements Serializable {
    private Long collection;
    private Long document;
}
