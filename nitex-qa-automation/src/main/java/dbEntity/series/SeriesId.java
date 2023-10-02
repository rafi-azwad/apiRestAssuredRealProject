package dbEntity.series;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeriesId implements Serializable {

    private SeriesType type;
    private String name;
}
