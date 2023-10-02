package repository.remoteRepo.responseRepo.collection;

public class CollectionPostLikeResponseModel {


    /**
     * success : true
     * message : Successfully added to favourite
     * payload : 90
     */

    private boolean success;
    private String message;
    private int payload;

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

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }
}
