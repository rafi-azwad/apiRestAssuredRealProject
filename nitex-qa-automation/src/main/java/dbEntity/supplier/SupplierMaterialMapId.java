package dbEntity.supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierMaterialMapId implements Serializable {
    private Long supplier;
    private Long material;
}
