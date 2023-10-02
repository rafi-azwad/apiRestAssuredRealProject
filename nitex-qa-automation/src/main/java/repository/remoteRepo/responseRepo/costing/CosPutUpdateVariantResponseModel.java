package repository.remoteRepo.responseRepo.costing;

public class CosPutUpdateVariantResponseModel {


    /**
     * success : true
     * message : variant updated successfully
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
