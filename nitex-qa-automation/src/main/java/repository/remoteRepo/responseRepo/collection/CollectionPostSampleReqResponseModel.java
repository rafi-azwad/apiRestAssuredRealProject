package repository.remoteRepo.responseRepo.collection;

public class CollectionPostSampleReqResponseModel {


    /**
     * success : true
     * message : Sample request successfully
     * id : 15759
     */

    private boolean success;
    private String message;
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
