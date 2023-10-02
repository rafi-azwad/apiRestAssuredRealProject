package dbEntity.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollectionProductId implements Serializable {
    private Long collection;
    private Long product;
}
