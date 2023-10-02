package repository.remoteRepo.responseRepo.designedit;

import java.io.Serializable;
import java.util.List;

public class DgnProductAddResponseModel {

    /**
     * success : true
     * message : Design added to collection successfully
     * id : 39167
     * payload : [{"id":62858,"name":"SWEATSHIRT","referenceNumber":"MT23-A0306-4","systemReferenceNumber":"MT23-A0306-4","liked":false,"subCategory":"SWEATSHIRT","availabilityStatus":"TECHPACK","basePrice":5,"fabricDetails":"70.0% Viscose 30.0% Cotton","addedByNitex":true,"isNitexProduct":true,"isBasicInfoUpdated":true,"fabricName":"Sherpa, 70.0% Viscose 30.0% Cotton, 150.0 GSM, Light peach","compositionDetails":"70.0% Viscose 30.0% Cotton","construction":"Sherpa","gsm":150,"isChangeRequired":false,"hasUnseenMention":false,"numberOfResold":0,"orderRefNumbers":[],"addedByName":"QA Automation","addedAt":"2023-07-20T07:07:28","designDocuments":[{"id":166974,"docType":"PRODUCT_DESIGN","documentGroup":"PHYSICAL_SAMPLE","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/7/1689836846511_WT23-A1982_--F.png","name":"WT23-A1982_--F.png","isGeneratedFromPDF":false,"dateAdded":"2023-05-09"}],"collectionId":39167,"collectionName":"Popy 25th apr style","extraFlag":{"isArtBoardCreated":true,"isMeasurementCompleted":true,"isSupplierDeveloped":false,"photographyUpdated":["FABRIC_IMAGE","EMBELLISHMENT","BACK_IMAGE","FRONT_IMAGE"]},"mainFabricType":"NON_WOVEN","originalProductId":60959,"parentProduct":{"id":60959,"name":"SWEATSHIRT","referenceNumber":"MT23-A0306","isChangeRequired":false,"hasUnseenMention":false,"numberOfResold":0,"orderRefNumbers":[]},"baseAdminPrice":5}]
     */

    private boolean success;
    private String message;
    private int id;
    private List<PayloadBean> payload;

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

    public List<PayloadBean> getPayload() {
        return payload;
    }

    public void setPayload(List<PayloadBean> payload) {
        this.payload = payload;
    }

    public static class PayloadBean implements Serializable {
        /**
         * id : 62858
         * name : SWEATSHIRT
         * referenceNumber : MT23-A0306-4
         * systemReferenceNumber : MT23-A0306-4
         * liked : false
         * subCategory : SWEATSHIRT
         * availabilityStatus : TECHPACK
         * basePrice : 5.0
         * fabricDetails : 70.0% Viscose 30.0% Cotton
         * addedByNitex : true
         * isNitexProduct : true
         * isBasicInfoUpdated : true
         * fabricName : Sherpa, 70.0% Viscose 30.0% Cotton, 150.0 GSM, Light peach
         * compositionDetails : 70.0% Viscose 30.0% Cotton
         * construction : Sherpa
         * gsm : 150.0
         * isChangeRequired : false
         * hasUnseenMention : false
         * numberOfResold : 0
         * orderRefNumbers : []
         * addedByName : QA Automation
         * addedAt : 2023-07-20T07:07:28
         * designDocuments : [{"id":166974,"docType":"PRODUCT_DESIGN","documentGroup":"PHYSICAL_SAMPLE","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/7/1689836846511_WT23-A1982_--F.png","name":"WT23-A1982_--F.png","isGeneratedFromPDF":false,"dateAdded":"2023-05-09"}]
         * collectionId : 39167
         * collectionName : Popy 25th apr style
         * extraFlag : {"isArtBoardCreated":true,"isMeasurementCompleted":true,"isSupplierDeveloped":false,"photographyUpdated":["FABRIC_IMAGE","EMBELLISHMENT","BACK_IMAGE","FRONT_IMAGE"]}
         * mainFabricType : NON_WOVEN
         * originalProductId : 60959
         * parentProduct : {"id":60959,"name":"SWEATSHIRT","referenceNumber":"MT23-A0306","isChangeRequired":false,"hasUnseenMention":false,"numberOfResold":0,"orderRefNumbers":[]}
         * baseAdminPrice : 5.0
         */

        private int id;
        private String name;
        private String referenceNumber;
        private String systemReferenceNumber;
        private boolean liked;
        private String subCategory;
        private String availabilityStatus;
        private double basePrice;
        private String fabricDetails;
        private boolean addedByNitex;
        private boolean isNitexProduct;
        private boolean isBasicInfoUpdated;
        private String fabricName;
        private String compositionDetails;
        private String construction;
        private double gsm;
        private boolean isChangeRequired;
        private boolean hasUnseenMention;
        private int numberOfResold;
        private String addedByName;
        private String addedAt;
        private int collectionId;
        private String collectionName;
        private ExtraFlagBean extraFlag;
        private String mainFabricType;
        private int originalProductId;
        private ParentProductBean parentProduct;
        private double baseAdminPrice;
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

        public double getBasePrice() {
            return basePrice;
        }

        public void setBasePrice(double basePrice) {
            this.basePrice = basePrice;
        }

        public String getFabricDetails() {
            return fabricDetails;
        }

        public void setFabricDetails(String fabricDetails) {
            this.fabricDetails = fabricDetails;
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

        public String getFabricName() {
            return fabricName;
        }

        public void setFabricName(String fabricName) {
            this.fabricName = fabricName;
        }

        public String getCompositionDetails() {
            return compositionDetails;
        }

        public void setCompositionDetails(String compositionDetails) {
            this.compositionDetails = compositionDetails;
        }

        public String getConstruction() {
            return construction;
        }

        public void setConstruction(String construction) {
            this.construction = construction;
        }

        public double getGsm() {
            return gsm;
        }

        public void setGsm(double gsm) {
            this.gsm = gsm;
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

        public String getMainFabricType() {
            return mainFabricType;
        }

        public void setMainFabricType(String mainFabricType) {
            this.mainFabricType = mainFabricType;
        }

        public int getOriginalProductId() {
            return originalProductId;
        }

        public void setOriginalProductId(int originalProductId) {
            this.originalProductId = originalProductId;
        }

        public ParentProductBean getParentProduct() {
            return parentProduct;
        }

        public void setParentProduct(ParentProductBean parentProduct) {
            this.parentProduct = parentProduct;
        }

        public double getBaseAdminPrice() {
            return baseAdminPrice;
        }

        public void setBaseAdminPrice(double baseAdminPrice) {
            this.baseAdminPrice = baseAdminPrice;
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
             * isArtBoardCreated : true
             * isMeasurementCompleted : true
             * isSupplierDeveloped : false
             * photographyUpdated : ["FABRIC_IMAGE","EMBELLISHMENT","BACK_IMAGE","FRONT_IMAGE"]
             */

            private boolean isArtBoardCreated;
            private boolean isMeasurementCompleted;
            private boolean isSupplierDeveloped;
            private List<String> photographyUpdated;

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

            public List<String> getPhotographyUpdated() {
                return photographyUpdated;
            }

            public void setPhotographyUpdated(List<String> photographyUpdated) {
                this.photographyUpdated = photographyUpdated;
            }
        }

        public static class ParentProductBean implements Serializable {
            /**
             * id : 60959
             * name : SWEATSHIRT
             * referenceNumber : MT23-A0306
             * isChangeRequired : false
             * hasUnseenMention : false
             * numberOfResold : 0
             * orderRefNumbers : []
             */

            private int id;
            private String name;
            private String referenceNumber;
            private boolean isChangeRequired;
            private boolean hasUnseenMention;
            private int numberOfResold;
            private List<?> orderRefNumbers;

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

            public List<?> getOrderRefNumbers() {
                return orderRefNumbers;
            }

            public void setOrderRefNumbers(List<?> orderRefNumbers) {
                this.orderRefNumbers = orderRefNumbers;
            }
        }

        public static class DesignDocumentsBean implements Serializable {
            /**
             * id : 166974
             * docType : PRODUCT_DESIGN
             * documentGroup : PHYSICAL_SAMPLE
             * docUrl : https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/7/1689836846511_WT23-A1982_--F.png
             * name : WT23-A1982_--F.png
             * isGeneratedFromPDF : false
             * dateAdded : 2023-05-09
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
}
