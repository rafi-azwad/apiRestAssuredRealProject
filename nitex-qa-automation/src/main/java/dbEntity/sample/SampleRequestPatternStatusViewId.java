package dbEntity.sample;

import lombok.Data;

import java.io.Serializable;

@Data
public class SampleRequestPatternStatusViewId implements Serializable {
    private Long sampleRequestId;
    private Long requestTo;
}
