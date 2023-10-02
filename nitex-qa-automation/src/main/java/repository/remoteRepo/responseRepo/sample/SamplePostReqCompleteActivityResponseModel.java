package repository.remoteRepo.responseRepo.sample;

public class SamplePostReqCompleteActivityResponseModel {


    /**
     * success : true
     * message : Sample Activity complete successfully.
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
