package repository.remoteRepo.requestRepo.designedit;

import java.io.Serializable;
import java.util.List;

public class DgnProductAddV2ReqestModel {

    /**
     * documentDTOList : [{"documentId":159486,"front":false},{"documentId":159487,"front":true},{"documentId":159488,"front":false}]
     * productSubCategoryId : 58
     * name : SHIRT
     * productGroupId : 1
     * collectionId : 39167
     */

    private int productSubCategoryId;
    private String name;
    private String productGroupId;
    private String collectionId;
    private List<DocumentDTOListBean> documentDTOList;

    public int getProductSubCategoryId(String arg0) {
        return productSubCategoryId;
    }

    public void setProductSubCategoryId(int productSubCategoryId) {
        this.productSubCategoryId = productSubCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(String productGroupId) {
        this.productGroupId = productGroupId;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public List<DocumentDTOListBean> getDocumentDTOList() {
        return documentDTOList;
    }

    public void setDocumentDTOList(List<DocumentDTOListBean> documentDTOList) {
        this.documentDTOList = documentDTOList;
    }

    public static class DocumentDTOListBean implements Serializable {
        /**
         * documentId : 159486
         * front : false
         */

        private int documentId;
        private boolean front;

        public int getDocumentId(int inCostingConvert) {
            return documentId;
        }

        public void setDocumentId(int documentId) {
            this.documentId = documentId;
        }

        public boolean isFront() {
            return front;
        }

        public void setFront(boolean front) {
            this.front = front;
        }
    }
}
