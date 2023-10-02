package repository.remoteRepo.responseRepo.photography;

import java.io.Serializable;

public class PhotoPostGroupAddResponseModel {

    /**
     * success : true
     * message : Document Added successfully to product
     * id : 177161
     * payload : {"id":177161,"docType":"FRONT_IMAGE","documentGroup":"PHYSICAL_SAMPLE","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/8/608/1693459813287_1678945045486_MB23-A0341-F.png","name":"1678945045486_MB23-A0341-F.png","isGeneratedFromPDF":false,"dateAdded":"2023-08-31"}
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
         * id : 177161
         * docType : FRONT_IMAGE
         * documentGroup : PHYSICAL_SAMPLE
         * docUrl : https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/8/608/1693459813287_1678945045486_MB23-A0341-F.png
         * name : 1678945045486_MB23-A0341-F.png
         * isGeneratedFromPDF : false
         * dateAdded : 2023-08-31
         */

        private int id;
        private String docType;
        private String documentGroup;
        private String docUrl;
        private String name;
        private boolean isGeneratedFromPDF;
        private String dateAdded;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDocType() {
            return docType;
        }

        public void setDocType(String docType) {
            this.docType = docType;
        }

        public String getDocumentGroup() {
            return documentGroup;
        }

        public void setDocumentGroup(String documentGroup) {
            this.documentGroup = documentGroup;
        }

        public String getDocUrl() {
            return docUrl;
        }

        public void setDocUrl(String docUrl) {
            this.docUrl = docUrl;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isIsGeneratedFromPDF() {
            return isGeneratedFromPDF;
        }

        public void setIsGeneratedFromPDF(boolean isGeneratedFromPDF) {
            this.isGeneratedFromPDF = isGeneratedFromPDF;
        }

        public String getDateAdded() {
            return dateAdded;
        }

        public void setDateAdded(String dateAdded) {
            this.dateAdded = dateAdded;
        }
    }
}
