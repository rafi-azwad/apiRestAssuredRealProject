package repository.remoteRepo.responseRepo.designedit;

import java.io.Serializable;

public class DgnArtBoardAddResponseModel {

    /**
     * success : true
     * message : Added successfully
     * id : 31915
     * payload : {"id":31915,"name":"Flat sketches","code":"canvasId4","serial":4}
     */

    private boolean success;
    private String message;
    private int id;
    private PayloadBean payload;

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

    public PayloadBean getPayload() {
        return payload;
    }

    public void setPayload(PayloadBean payload) {
        this.payload = payload;
    }

    public static class PayloadBean implements Serializable {
        /**
         * id : 31915
         * name : Flat sketches
         * code : canvasId4
         * serial : 4
         */

        private int id;
        private String name;
        private String code;
        private int serial;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getSerial() {
            return serial;
        }

        public void setSerial(int serial) {
            this.serial = serial;
        }
    }
}
