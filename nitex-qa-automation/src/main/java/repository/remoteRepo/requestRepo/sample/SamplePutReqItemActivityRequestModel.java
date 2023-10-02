package repository.remoteRepo.requestRepo.sample;

import java.io.Serializable;

public class SamplePutReqItemActivityRequestModel {


    /**
     * sampleActivityDTO : {"activityType":"PATTERN","assignedTo":11755,"assignedName":"Shahin","requiredDate":"2023-05-16"}
     * sampleItemId : 15702
     */

    private SampleActivityDTOBean sampleActivityDTO;
    private int sampleItemId;

    public SampleActivityDTOBean getSampleActivityDTO() {
        return sampleActivityDTO;
    }

    public void setSampleActivityDTO(SampleActivityDTOBean sampleActivityDTO) {
        this.sampleActivityDTO = sampleActivityDTO;
    }

    public int getSampleItemId() {
        return sampleItemId;
    }

    public void setSampleItemId(int sampleItemId) {
        this.sampleItemId = sampleItemId;
    }

    public static class SampleActivityDTOBean implements Serializable {
        /**
         * activityType : PATTERN
         * assignedTo : 11755
         * assignedName : Shahin
         * requiredDate : 2023-05-16
         */

        private String activityType;
        private int assignedTo;
        private String assignedName;
        private String requiredDate;

        public String getActivityType() {
            return activityType;
        }

        public void setActivityType(String activityType) {
            this.activityType = activityType;
        }

        public int getAssignedTo() {
            return assignedTo;
        }

        public void setAssignedTo(int assignedTo) {
            this.assignedTo = assignedTo;
        }

        public String getAssignedName() {
            return assignedName;
        }

        public void setAssignedName(String assignedName) {
            this.assignedName = assignedName;
        }

        public String getRequiredDate() {
            return requiredDate;
        }

        public void setRequiredDate(String requiredDate) {
            this.requiredDate = requiredDate;
        }
    }
}
