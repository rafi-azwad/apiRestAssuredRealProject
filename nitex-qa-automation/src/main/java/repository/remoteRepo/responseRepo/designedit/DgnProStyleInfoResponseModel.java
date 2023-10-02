package repository.remoteRepo.responseRepo.designedit;

import java.io.Serializable;
import java.util.List;

public class DgnProStyleInfoResponseModel {

    /**
     * success : true
     * message : Style info updated successfully
     * payload : {"id":63560,"name":"test","referenceNumber":"tets","systemReferenceNumber":"MT23-A0577","liked":false,"subCategory":"SINGLE BREASTED BLAZER","availabilityStatus":"TECHPACK","addedByNitex":true,"isNitexProduct":true,"isBasicInfoUpdated":true,"isChangeRequired":false,"hasUnseenMention":false,"numberOfResold":0,"orderRefNumbers":[],"addedByName":"QA Automation","addedAt":"2023-08-04T04:47:02","designDocuments":[{"id":170584,"docType":"PRODUCT_DESIGN","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2023/8/1691124420416_4-D.png","name":"4-D.png","isGeneratedFromPDF":false,"dateAdded":"2023-05-15"}],"collectionId":39167,"collectionName":"Popy 25th apr style","extraFlag":{"isArtBoardCreated":false,"isMeasurementCompleted":false,"isSupplierDeveloped":false}}
     */

    private boolean success;
    private String message;
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

    public PayloadBean getPayload() {
        return payload;
    }

    public void setPayload(PayloadBean payload) {
        this.payload = payload;
    }

    public static class PayloadBean implements Serializable {
        /**
         * id : 63560
         * name : test
         * referenceNumber : tets
         * systemReferenceNumber : MT23-A0577
         * liked : false
         * subCategory : SINGLE BREASTED BLAZER
         * availabilityStatus : TECHPACK
         * addedByNitex : true
         * isNitexProduct : true
         * isBasicInfoUpdated : true
         * isChangeRequired : false
         * hasUnseenMention : false
         * numberOfResold : 0
         * orderRefNumbers : []
         * addedByName : QA Automation
         * addedAt : 2023-08-04T04:47:02
         * designDocuments : [{"id":170584,"docType":"PRODUCT_DESIGN","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2023/8/1691124420416_4-D.png","name":"4-D.png","isGeneratedFromPDF":false,"dateAdded":"2023-05-15"}]
         * collectionId : 39167
         * collectionName : Popy 25th apr style
         * extraFlag : {"isArtBoardCreated":false,"isMeasurementCompleted":false,"isSupplierDeveloped":false}
         */

        private int id;
        private String name;
        private String referenceNumber;
        private String systemReferenceNumber;
        private boolean liked;
        private String subCategory;
        private String availabilityStatus;
        private boolean addedByNitex;
        private boolean isNitexProduct;
        private boolean isBasicInfoUpdated;
        private boolean isChangeRequired;
        private boolean hasUnseenMention;
        private int numberOfResold;
        private String addedByName;
        private String addedAt;
        private int collectionId;
        private String collectionName;
        private ExtraFlagBean extraFlag;
        private List<?> orderRefNumbers;
        private List<DesignDocumentsBean> designDocuments;

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

        public String getReferenceNumber() {
            return referenceNumber;
        }

        public void setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
        }

        public String getSystemReferenceNumber() {
            return systemReferenceNumber;
        }

        public void setSystemReferenceNumber(String systemReferenceNumber) {
            this.systemReferenceNumber = systemReferenceNumber;
        }

        public boolean isLiked() {
            return liked;
        }

        public void setLiked(boolean liked) {
            this.liked = liked;
        }

        public String getSubCategory() {
            return subCategory;
        }

        public void setSubCategory(String subCategory) {
            this.subCategory = subCategory;
        }

        public String getAvailabilityStatus() {
            return availabilityStatus;
        }

        public void setAvailabilityStatus(String availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
        }

        public boolean isAddedByNitex() {
            return addedByNitex;
        }

        public void setAddedByNitex(boolean addedByNitex) {
            this.addedByNitex = addedByNitex;
        }

        public boolean isIsNitexProduct() {
            return isNitexProduct;
        }

        public void setIsNitexProduct(boolean isNitexProduct) {
            this.isNitexProduct = isNitexProduct;
        }

        public boolean isIsBasicInfoUpdated() {
            return isBasicInfoUpdated;
        }

        public void setIsBasicInfoUpdated(boolean isBasicInfoUpdated) {
            this.isBasicInfoUpdated = isBasicInfoUpdated;
        }

        public boolean isIsChangeRequired() {
            return isChangeRequired;
        }

        public void setIsChangeRequired(boolean isChangeRequired) {
            this.isChangeRequired = isChangeRequired;
        }

        public boolean isHasUnseenMention() {
            return hasUnseenMention;
        }

        public void setHasUnseenMention(boolean hasUnseenMention) {
            this.hasUnseenMention = hasUnseenMention;
        }

        public int getNumberOfResold() {
            return numberOfResold;
        }

        public void setNumberOfResold(int numberOfResold) {
            this.numberOfResold = numberOfResold;
        }

        public String getAddedByName() {
            return addedByName;
        }

        public void setAddedByName(String addedByName) {
            this.addedByName = addedByName;
        }

        public String getAddedAt() {
            return addedAt;
        }

        public void setAddedAt(String addedAt) {
            this.addedAt = addedAt;
        }

        public int getCollectionId() {
            return collectionId;
        }

        public void setCollectionId(int collectionId) {
            this.collectionId = collectionId;
        }

        public String getCollectionName() {
            return collectionName;
        }

        public void setCollectionName(String collectionName) {
            this.collectionName = collectionName;
        }

        public ExtraFlagBean getExtraFlag() {
            return extraFlag;
        }

        public void setExtraFlag(ExtraFlagBean extraFlag) {
            this.extraFlag = extraFlag;
        }

        public List<?> getOrderRefNumbers() {
            return orderRefNumbers;
        }

        public void setOrderRefNumbers(List<?> orderRefNumbers) {
            this.orderRefNumbers = orderRefNumbers;
        }

        public List<DesignDocumentsBean> getDesignDocuments() {
            return designDocuments;
        }

        public void setDesignDocuments(List<DesignDocumentsBean> designDocuments) {
            this.designDocuments = designDocuments;
        }

        public static class ExtraFlagBean implements Serializable {
            /**
             * isArtBoardCreated : false
             * isMeasurementCompleted : false
             * isSupplierDeveloped : false
             */

            private boolean isArtBoardCreated;
            private boolean isMeasurementCompleted;
            private boolean isSupplierDeveloped;

            public boolean isIsArtBoardCreated() {
                return isArtBoardCreated;
            }

            public void setIsArtBoardCreated(boolean isArtBoardCreated) {
                this.isArtBoardCreated = isArtBoardCreated;
            }

            public boolean isIsMeasurementCompleted() {
                return isMeasurementCompleted;
            }

            public void setIsMeasurementCompleted(boolean isMeasurementCompleted) {
                this.isMeasurementCompleted = isMeasurementCompleted;
            }

            public boolean isIsSupplierDeveloped() {
                return isSupplierDeveloped;
            }

            public void setIsSupplierDeveloped(boolean isSupplierDeveloped) {
                this.isSupplierDeveloped = isSupplierDeveloped;
            }
        }

        public static class DesignDocumentsBean implements Serializable {
            /**
             * id : 170584
             * docType : PRODUCT_DESIGN
             * docUrl : https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2023/8/1691124420416_4-D.png
             * name : 4-D.png
             * isGeneratedFromPDF : false
             * dateAdded : 2023-05-15
             */

            private int id;
            private String docType;
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
}
