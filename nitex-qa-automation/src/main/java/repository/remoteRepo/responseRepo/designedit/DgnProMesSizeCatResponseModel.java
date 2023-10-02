package repository.remoteRepo.responseRepo.designedit;

public class DgnProMesSizeCatResponseModel {


    /**
     * success : true
     * message : New size category saved successfully
     */

    private boolean success;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
