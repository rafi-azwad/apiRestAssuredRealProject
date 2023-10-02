package dbEntity.brand;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandUserId implements Serializable {
    private Long brand;
    private Long user;
}
