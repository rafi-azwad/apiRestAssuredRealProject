package repository.remoteRepo.responseRepo.designedit;

public class DgnGetArtBoardCanvasResponseModel {

    /**
     * code : BAD_REQUEST
     * timestamp : 03/08/2023
     * status : 400
     * message : ArtBoard already generated!!!
     */

    private String code;
    private String timestamp;
    private int status;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
