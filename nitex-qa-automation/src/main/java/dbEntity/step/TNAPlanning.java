package dbEntity.step;

import dbEntity.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity( name = "tna_planning" )
@IdClass( TNAPlanningId.class )
public class TNAPlanning {

    @Id
    @Column( name = "order_id" )
    private Long orderId;

    @Id
    @Column( name = "rfq_id" )
    private Long rfqId;

    @Column( name = "template_name" )
    private String templateName;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @Column( name = "template_version" )
    private TemplateVersion templateVersion = TemplateVersion.FOUR;

    @Column( name = "plan_start_date" )
    private LocalDate planStartDate;

    @Column( name = "max_step_master_id" )
    private Long maxStepMasterId;

    @Column( name = "last_response_object_json", columnDefinition = "TEXT" )
    private String lastResponseObjectJson;

    @Column( name = "step_master_list_json", columnDefinition = "TEXT" )
    private String stepMasterListJson;

    @Column( name = "step_master_dependency_map_json", columnDefinition = "TEXT" )
    private String stepMasterDependencyMapJson;
}
