package dbEntity.stage;


import dbEntity.step.StepMaster;
import dbEntity.step.StepScope;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Objects;

@Data
@Entity
@DynamicUpdate
@Table( name = "stage_master" )
@EqualsAndHashCode( exclude = {"stepMasterList"} )
public class StageMaster {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "stage_master_sequence_generator" )
    @SequenceGenerator( name = "stage_master_sequence_generator", sequenceName = "stage_master_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "stage_name" )
    private String stageName;

    @Column( name = "template_name" )
    private String templateName;

    @Column( name = "template_duration_days" )
    private Long templateDurationDays;

    @Column( name = "duration_days" )
    private Long durationDays;

    @Column( name = "constants" )
    private StageConstants constants;

    @Column( name = "stage_sequence_index" )
    private Long stageSequenceIndex;

    @Column( name = "step_scope" )
    private StepScope stepScope;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "stageMaster")
    private List<StepMaster> stepMasterList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StageMaster that = (StageMaster) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public StageMaster getUnifiedObject() {

        StageMaster stageMaster = new StageMaster();
        BeanUtils.copyProperties( this, stageMaster );
        stageMaster.setId( this.getStageSequenceIndex() );
        stageMaster.setStepMasterList( null );
        return stageMaster;
    }
}
