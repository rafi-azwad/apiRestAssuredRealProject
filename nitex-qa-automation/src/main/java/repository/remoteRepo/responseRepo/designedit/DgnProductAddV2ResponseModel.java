package repository.remoteRepo.responseRepo.designedit;

public class DgnProductAddV2ResponseModel {

    /**
     * success : true
     * message : Style uploaded
     * id : 63012
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
