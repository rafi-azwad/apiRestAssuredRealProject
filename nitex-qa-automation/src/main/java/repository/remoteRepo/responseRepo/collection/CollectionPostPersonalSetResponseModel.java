package repository.remoteRepo.responseRepo.collection;

public class CollectionPostPersonalSetResponseModel {


    /**
     * success : true
     * message : Personal setting added successfully
     * id : 10603
     * payload :
     */

    private boolean success;
    private String message;
    private int id;
    private String payload;

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

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
