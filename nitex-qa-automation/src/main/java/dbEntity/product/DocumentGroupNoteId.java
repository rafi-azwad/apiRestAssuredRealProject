package dbEntity.product;


import dbEntity.document.DocumentGroup;
import lombok.Data;

import java.io.Serializable;

@Data
public class DocumentGroupNoteId implements Serializable {
    private DocumentGroup documentGroup;
    private Long productId;
}
