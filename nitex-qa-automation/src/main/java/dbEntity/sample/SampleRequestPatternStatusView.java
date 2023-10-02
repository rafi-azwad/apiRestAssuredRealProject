package dbEntity.sample;

import dbEntity.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "sample_request_pattern_status_view" )
@IdClass( SampleRequestPatternStatusViewId.class )
public class SampleRequestPatternStatusView {

    @Id
    @Column( name = "sample_request_id" )
    private Long sampleRequestId;

    @Id
    @Column( name = "assigned_to" )
    private Long requestTo;

    @Column( name = "pattern_status" )
    private Status patternStatus;
}
