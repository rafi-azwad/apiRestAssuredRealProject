package dbEntity.rfq;

import dbEntity.measurement.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuotationsId implements Serializable {
    private Long color;
    private Size size;
    private Long productInfoForRfq;
}
