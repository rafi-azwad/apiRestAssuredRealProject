package repository.remoteRepo.responseRepo.collection;

public class CollectionPostBulkReqResponseModel {


    /**
     * success : true
     * message : Costing request sent successfully
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
