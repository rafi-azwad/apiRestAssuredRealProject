package repository.remoteRepo.requestRepo.designedit;

import java.io.Serializable;

public class DesignArtBoardAddRequestModel {


    /**
     * code : canvasId4
     * documentDTO : {"base64Str":"test","docMimeType":"test","documentType":"REFERENCE_IMAGE","name":"test"}
     * historyJson : test
     * name : Flat sketches
     * productId : 61280
     * serial : 4
     */

    private String code;
    private DocumentDTOBean documentDTO;
    private String historyJson;
    private String name;
    private String productId;
    private int serial;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DocumentDTOBean getDocumentDTO() {
        return documentDTO;
    }

    public void setDocumentDTO(DocumentDTOBean documentDTO) {
        this.documentDTO = documentDTO;
    }

    public String getHistoryJson() {
        return historyJson;
    }

    public void setHistoryJson(String historyJson) {
        this.historyJson = historyJson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public static class DocumentDTOBean implements Serializable {
        /**
         * base64Str : test
         * docMimeType : test
         * documentType : REFERENCE_IMAGE
         * name : test
         */

        private String base64Str;
        private String docMimeType;
        private String documentType;
        private String name;

        public String getBase64Str() {
            return base64Str;
        }

        public void setBase64Str(String base64Str) {
            this.base64Str = base64Str;
        }

        public String getDocMimeType() {
            return docMimeType;
        }

        public void setDocMimeType(String docMimeType) {
            this.docMimeType = docMimeType;
        }

        public String getDocumentType() {
            return documentType;
        }

        public void setDocumentType(String documentType) {
            this.documentType = documentType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
