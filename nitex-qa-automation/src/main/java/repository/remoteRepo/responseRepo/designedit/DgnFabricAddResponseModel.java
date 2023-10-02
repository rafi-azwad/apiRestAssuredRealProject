package repository.remoteRepo.responseRepo.designedit;

import java.io.Serializable;
import java.util.List;

public class DgnFabricAddResponseModel {


    /**
     * success : true
     * message : Fabric added successfully
     * id : 60969
     * payload : {"id":60969,"libraryId":60968,"referenceNumber":"F23-A0157","name":"Stretch denim, 50% polyolefin 50% Coir, 200.0 OZ","materialType":"MAIN_FABRIC","compositionDetails":"50% polyolefin 50% Coir","tagResponseList":[],"fixedTagResponseList":[],"colorResponseList":[],"isExpired":false,"liked":false}
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
         * id : 60969
         * libraryId : 60968
         * referenceNumber : F23-A0157
         * name : Stretch denim, 50% polyolefin 50% Coir, 200.0 OZ
         * materialType : MAIN_FABRIC
         * compositionDetails : 50% polyolefin 50% Coir
         * tagResponseList : []
         * fixedTagResponseList : []
         * colorResponseList : []
         * isExpired : false
         * liked : false
         */

        private int id;
        private int libraryId;
        private String referenceNumber;
        private String name;
        private String materialType;
        private String compositionDetails;
        private boolean isExpired;
        private boolean liked;
        private List<?> tagResponseList;
        private List<?> fixedTagResponseList;
        private List<?> colorResponseList;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getLibraryId() {
            return libraryId;
        }

        public void setLibraryId(int libraryId) {
            this.libraryId = libraryId;
        }

        public String getReferenceNumber() {
            return referenceNumber;
        }

        public void setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMaterialType() {
            return materialType;
        }

        public void setMaterialType(String materialType) {
            this.materialType = materialType;
        }

        public String getCompositionDetails() {
            return compositionDetails;
        }

        public void setCompositionDetails(String compositionDetails) {
            this.compositionDetails = compositionDetails;
        }

        public boolean isIsExpired() {
            return isExpired;
        }

        public void setIsExpired(boolean isExpired) {
            this.isExpired = isExpired;
        }

        public boolean isLiked() {
            return liked;
        }

        public void setLiked(boolean liked) {
            this.liked = liked;
        }

        public List<?> getTagResponseList() {
            return tagResponseList;
        }

        public void setTagResponseList(List<?> tagResponseList) {
            this.tagResponseList = tagResponseList;
        }

        public List<?> getFixedTagResponseList() {
            return fixedTagResponseList;
        }

        public void setFixedTagResponseList(List<?> fixedTagResponseList) {
            this.fixedTagResponseList = fixedTagResponseList;
        }

        public List<?> getColorResponseList() {
            return colorResponseList;
        }

        public void setColorResponseList(List<?> colorResponseList) {
            this.colorResponseList = colorResponseList;
        }
    }
}
