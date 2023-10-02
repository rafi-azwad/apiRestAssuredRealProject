package repository.remoteRepo.requestRepo.designedit;

import lombok.Builder;

import java.io.Serializable;
import java.util.List;

public class DgnInspirationStyleRequestModel {

    private List<DocumentDTOListBean> documentDTOList;

    public List<DocumentDTOListBean> getDocumentDTOList() {
        return documentDTOList;
    }

    public void setDocumentDTOList(List<DocumentDTOListBean> documentDTOList) {
        this.documentDTOList = documentDTOList;
    }

    @Builder
    public static class DocumentDTOListBean implements Serializable {
        /**
         * base64Str :
         * name : 1677241112527_BT22-A2467_--F.png
         * docMimeType : image/png
         * documentType : PRODUCT_DESIGN
         */

        private String base64Str;
        private String name;
        private String docMimeType;
        private String documentType;

        public String getBase64Str() {
            return base64Str;
        }

        public void setBase64Str(String base64Str) {
            this.base64Str = base64Str;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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
    }
}
