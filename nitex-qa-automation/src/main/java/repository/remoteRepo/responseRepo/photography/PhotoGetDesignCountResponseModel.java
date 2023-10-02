package repository.remoteRepo.responseRepo.photography;

public class PhotoGetDesignCountResponseModel {


    /**
     * TODAY : 39
     * COMPLETED : 38
     * PENDING : 120
     */

    private int TODAY;
    private int COMPLETED;
    private int PENDING;

    public int getTODAY() {
        return TODAY;
    }

    public void setTODAY(int TODAY) {
        this.TODAY = TODAY;
    }

    public int getCOMPLETED() {
        return COMPLETED;
    }

    public void setCOMPLETED(int COMPLETED) {
        this.COMPLETED = COMPLETED;
    }

    public int getPENDING() {
        return PENDING;
    }

    public void setPENDING(int PENDING) {
        this.PENDING = PENDING;
    }
}
