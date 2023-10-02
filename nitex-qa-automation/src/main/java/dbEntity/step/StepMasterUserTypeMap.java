package dbEntity.step;

import dbEntity.user.UserType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "step_master_user_type_map" )
@IdClass( StepMasterUserTypeId.class )
public class StepMasterUserTypeMap {

    @Id
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "step_master_id", foreignKey = @ForeignKey( name = "fk_step_master_user_type_map_step_master_id" ) )
    private StepMaster stepMaster;

    @Id
    @Column( name = "user_type" )
    private UserType userType;
}
