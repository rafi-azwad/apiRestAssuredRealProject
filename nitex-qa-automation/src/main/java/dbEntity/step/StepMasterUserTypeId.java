package dbEntity.step;

import dbEntity.user.UserType;
import lombok.Data;

import java.io.Serializable;

@Data
public class StepMasterUserTypeId implements Serializable {

    private StepMaster stepMaster;
    private UserType userType;
}
