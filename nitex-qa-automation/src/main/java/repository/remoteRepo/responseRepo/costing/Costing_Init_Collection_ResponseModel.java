package repository.remoteRepo.responseRepo.costing;

import java.io.Serializable;
import java.util.List;

public class Costing_Init_Collection_ResponseModel {


    /**
     * totalPages : 1
     * totalElements : 1
     * currentPage : 0
     * data : [{"id":61280,"name":"SHIRT","referenceNumber":"MT23-A0326-OPTION1","systemReferenceNumber":"MT23-A0326-OP1","liked":false,"subCategory":"SINGLE BREASTED BLAZER","availabilityStatus":"DEVELOPMENT","fabricDetails":"50% polyolefin 50% Coir","addedByNitex":true,"isNitexProduct":true,"isBasicInfoUpdated":true,"fabricName":"Stretch denim, 50% polyolefin 50% Coir, 200.0 OZ","compositionDetails":"50% polyolefin 50% Coir","construction":"Stretch denim","gsm":200,"isChangeRequired":false,"hasUnseenMention":false,"numberOfResold":0,"orderRefNumbers":[],"addedByName":"Adnan1","addedAt":"2023-05-15T07:00:19","designDocuments":[{"id":159550,"docType":"PRODUCT_DESIGN","documentGroup":"PHYSICAL_SAMPLE","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/5/1684143435219_4-D.png","name":"4-D.png","isGeneratedFromPDF":false,"dateAdded":"2023-05-15"}],"collectionId":39167,"collectionName":"Popy 25th apr style","extraFlag":{"isArtBoardCreated":true,"isMeasurementCompleted":false,"isSupplierDeveloped":false,"photographyUpdated":["FRONT_IMAGE"]},"costingCompleted":false,"mainFabricType":"DENIM","options":[{"id":61278,"name":"SHIRT","referenceNumber":"MT23-A0326","isChangeRequired":false,"hasUnseenMention":false,"numberOfResold":0,"orderRefNumbers":[]}],"developmentLocations":["BD-Inhouse"]}]
     */

    private int totalPages;
    private int totalElements;
    private int currentPage;
    private List<DataBean> data;

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * id : 61280
         * name : SHIRT
         * referenceNumber : MT23-A0326-OPTION1
         * systemReferenceNumber : MT23-A0326-OP1
         * liked : false
         * subCategory : SINGLE BREASTED BLAZER
         * availabilityStatus : DEVELOPMENT
         * fabricDetails : 50% polyolefin 50% Coir
         * addedByNitex : true
         * isNitexProduct : true
         * isBasicInfoUpdated : true
         * fabricName : Stretch denim, 50% polyolefin 50% Coir, 200.0 OZ
         * compositionDetails : 50% polyolefin 50% Coir
         * construction : Stretch denim
         * gsm : 200.0
         * isChangeRequired : false
         * hasUnseenMention : false
         * numberOfResold : 0
         * orderRefNumbers : []
         * addedByName : Adnan1
         * addedAt : 2023-05-15T07:00:19
         * designDocuments : [{"id":159550,"docType":"PRODUCT_DESIGN","documentGroup":"PHYSICAL_SAMPLE","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/5/1684143435219_4-D.png","name":"4-D.png","isGeneratedFromPDF":false,"dateAdded":"2023-05-15"}]
         * collectionId : 39167
         * collectionName : Popy 25th apr style
         * extraFlag : {"isArtBoardCreated":true,"isMeasurementCompleted":false,"isSupplierDeveloped":false,"photographyUpdated":["FRONT_IMAGE"]}
         * costingCompleted : false
         * mainFabricType : DENIM
         * options : [{"id":61278,"name":"SHIRT","referenceNumber":"MT23-A0326","isChangeRequired":false,"hasUnseenMention":false,"numberOfResold":0,"orderRefNumbers":[]}]
         * developmentLocations : ["BD-Inhouse"]
         */

        private int id;
        private String name;
        private String referenceNumber;
        private String systemReferenceNumber;
        private boolean liked;
        private String subCategory;
        private String availabilityStatus;
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
        private boolean costingCompleted;
        private String mainFabricType;
        private List<?> orderRefNumbers;
        private List<DesignDocumentsBean> designDocuments;
        private List<OptionsBean> options;
        private List<String> developmentLocations;

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

        public boolean isCostingCompleted() {
            return costingCompleted;
        }

        public void setCostingCompleted(boolean costingCompleted) {
            this.costingCompleted = costingCompleted;
        }

        public String getMainFabricType() {
            return mainFabricType;
        }

        public void setMainFabricType(String mainFabricType) {
            this.mainFabricType = mainFabricType;
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

        public List<OptionsBean> getOptions() {
            return options;
        }

        public void setOptions(List<OptionsBean> options) {
            this.options = options;
        }

        public List<String> getDevelopmentLocations() {
            return developmentLocations;
        }

        public void setDevelopmentLocations(List<String> developmentLocations) {
            this.developmentLocations = developmentLocations;
        }

        public static class ExtraFlagBean implements Serializable {
            /**
             * isArtBoardCreated : true
             * isMeasurementCompleted : false
             * isSupplierDeveloped : false
             * photographyUpdated : ["FRONT_IMAGE"]
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

        public static class DesignDocumentsBean implements Serializable {
            /**
             * id : 159550
             * docType : PRODUCT_DESIGN
             * documentGroup : PHYSICAL_SAMPLE
             * docUrl : https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/5/1684143435219_4-D.png
             * name : 4-D.png
             * isGeneratedFromPDF : false
             * dateAdded : 2023-05-15
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

        public static class OptionsBean implements Serializable {
            /**
             * id : 61278
             * name : SHIRT
             * referenceNumber : MT23-A0326
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
    }
}
