package repository.remoteRepo.responseRepo.sample;

import java.io.Serializable;
import java.util.List;

public class SampleGetRequestResponseModel {


    /**
     * id : 15202
     * collectionName : Farabi collection
     * collectionId : 38903
     * refNo : D23-A0050
     * noOfDesign : 2
     * brandId : 1
     * brand : Nitex
     * quantity : 3
     * noOfSize : 1
     * requestedBy : Adnan1
     * requestedById : 6352
     * requestedDate : 2023-05-08
     * deliveryDate : 2023-05-23
     * noOfUnreadMessage : 0
     * requireDate : 2023-05-12
     * status : COMPLETED
     * activityCountList : [{"activity":"Pattern","count":0},{"activity":"Measurement","count":0},{"activity":"Cutting","count":0},{"activity":"Emb","count":0},{"activity":"Sewing","count":0},{"activity":"Consumption","count":0},{"activity":"Delivered","count":3}]
     * productDocuments : ["https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/5/1683627040897_WT23-A1982_--F.png","https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2023/5/1683537461515_1676041258780_GT22-A1281_-B.png","https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/5/1683627040897_WT23-A1982_--F.png"]
     * sampleRequestItemResponseList : [{"id":15702,"referenceNumber":"MT23-A0306","productId":60959,"market":"Men","category":"SWEATSHIRT","requireDate":"2023-05-12","estimatedDeliveryDate":"2023-05-12","deliveryDate":"2023-05-23","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/5/1683627040897_WT23-A1982_--F.png","materialList":["Sherpa, 70.0% Viscose 30.0% Cotton, 150.0 GSM, Light peach"],"sampleItemDetailsResponseList":[{"id":29902,"size":"M","quantity":1,"colorResponse":{}}],"currentPendingActivity":{"activityType":"PUBLISHED","status":"COMPLETED"},"patternActivityResponse":{"id":29955,"activityType":"PATTERN","requiredDate":"2023-05-16","deliveryDate":"2023-05-16T05:37:52","status":"COMPLETED","assignedTo":11755,"assignedToName":"Shahin","createdAt":"2023-05-16T05:35:27"},"cuttingActivityResponse":{"id":29956,"activityType":"CUTTING","requiredDate":"2023-05-17","deliveryDate":"2023-05-16T05:52:55","status":"COMPLETED","assignedTo":12852,"assignedToName":"Riad Sikdar","createdAt":"2023-05-16T05:50:49"},"isConsumptionCompleted":true,"isMeasurementCompleted":true,"timeLineActivityResponse":[{"activityType":"DESIGN_UPLOADED","status":"COMPLETED","createdAt":"2023-05-08T09:17:08"},{"id":29852,"activityType":"REQUESTED","deliveryDate":"2023-05-16T05:58:18","status":"COMPLETED","createdAt":"2023-05-15T06:56:37"},{"id":29955,"activityType":"PATTERN","requiredDate":"2023-05-16","deliveryDate":"2023-05-16T05:37:52","status":"COMPLETED","assignedTo":11755,"assignedToName":"Shahin","createdAt":"2023-05-16T05:35:27"},{"id":29956,"activityType":"CUTTING","requiredDate":"2023-05-17","deliveryDate":"2023-05-16T05:52:55","status":"COMPLETED","assignedTo":12852,"assignedToName":"Riad Sikdar","createdAt":"2023-05-16T05:50:49"},{"activityType":"PRINT","status":"PENDING"},{"activityType":"EMBROIDERY","status":"PENDING"},{"activityType":"SEWING","status":"PENDING"},{"activityType":"WASH","status":"PENDING"},{"id":29957,"activityType":"DELIVERED","deliveryDate":"2023-05-23T04:02:56","status":"COMPLETED","createdAt":"2023-05-16T05:58:18"},{"activityType":"COSTING","deliveryDate":"2023-05-31T06:56:04","status":"COMPLETED"},{"activityType":"PHOTOSHOOT","deliveryDate":"2023-05-09T10:10:41","status":"COMPLETED"},{"activityType":"PUBLISHED","status":"COMPLETED"},{"activityType":"SENT_TO_BD","status":"PENDING"}],"unitResponse":{"id":1,"name":"BD-Inhouse","type":"SAMPLE_HOUSE"},"status":"DELIVERED","buyerApprovalStatus":"PENDING","productCreator":"Adnan1","productCreationDate":"08/05/2023"},{"id":15653,"referenceNumber":"GT23-A0307","productId":60960,"market":"Women","category":"SINGLE BREASTED BLAZER","requireDate":"2023-05-12","estimatedDeliveryDate":"2023-05-17","deliveryDate":"2023-05-23","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2023/5/1683537461515_1676041258780_GT22-A1281_-B.png","materialList":["Sherpa, 70.0% Viscose 30.0% Cotton, 150.0 GSM, Light peach","rib 3*4, 50% Manila 50% Microfiber, 50.0 GSM","Double Jersey, 50% Synthetic Resin 50% polyolefin","Flat knit Rib, 100% Polyester, 120.0 GSM"],"sampleItemDetailsResponseList":[{"id":29803,"size":"M","quantity":1,"colorResponse":{"id":72106,"code":"11-4001 TCX","hexCode":"#edf1ff","name":"Brilliant White","pantoneColorId":1,"colorType":"SOLID","representedBy":"PANTONE_OR_HEX_CODE"}}],"currentPendingActivity":{"id":30057,"activityType":"DELIVERED","deliveryDate":"2023-05-23T04:02:56","status":"COMPLETED","createdAt":"2023-05-23T04:02:56"},"isConsumptionCompleted":false,"isMeasurementCompleted":false,"timeLineActivityResponse":[{"activityType":"DESIGN_UPLOADED","status":"COMPLETED","createdAt":"2023-05-08T09:17:43"},{"id":29753,"activityType":"REQUESTED","deliveryDate":"2023-05-23T04:02:56","status":"COMPLETED","createdAt":"2023-05-08T09:37:53"},{"activityType":"PATTERN","status":"PENDING"},{"activityType":"CUTTING","status":"PENDING"},{"activityType":"PRINT","status":"PENDING"},{"activityType":"EMBROIDERY","status":"PENDING"},{"activityType":"SEWING","status":"PENDING"},{"activityType":"WASH","status":"PENDING"},{"id":30057,"activityType":"DELIVERED","deliveryDate":"2023-05-23T04:02:56","status":"COMPLETED","createdAt":"2023-05-23T04:02:56"},{"activityType":"COSTING","status":"PENDING"},{"activityType":"PHOTOSHOOT","status":"PENDING"},{"activityType":"PUBLISHED","status":"PENDING"},{"activityType":"SENT_TO_BD","status":"PENDING"}],"unitResponse":{"id":1,"name":"BD-Inhouse","type":"SAMPLE_HOUSE"},"status":"DELIVERED","buyerApprovalStatus":"PENDING","productCreator":"Adnan1","productCreationDate":"08/05/2023","noOfUnreadMessage":2},{"id":15652,"referenceNumber":"MT23-A0306","productId":60959,"market":"Men","category":"SWEATSHIRT","requireDate":"2023-05-12","deliveryDate":"2023-05-23","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/5/1683627040897_WT23-A1982_--F.png","materialList":["Sherpa, 70.0% Viscose 30.0% Cotton, 150.0 GSM, Light peach"],"sampleItemDetailsResponseList":[{"id":29802,"size":"M","quantity":1,"colorResponse":{}}],"currentPendingActivity":{"activityType":"PUBLISHED","status":"COMPLETED"},"isConsumptionCompleted":true,"isMeasurementCompleted":true,"timeLineActivityResponse":[{"activityType":"DESIGN_UPLOADED","status":"COMPLETED","createdAt":"2023-05-08T09:17:08"},{"id":29752,"activityType":"REQUESTED","deliveryDate":"2023-05-23T04:02:56","status":"COMPLETED","createdAt":"2023-05-08T09:37:53"},{"activityType":"PATTERN","status":"PENDING"},{"activityType":"CUTTING","status":"PENDING"},{"activityType":"PRINT","status":"PENDING"},{"activityType":"EMBROIDERY","status":"PENDING"},{"activityType":"SEWING","status":"PENDING"},{"activityType":"WASH","status":"PENDING"},{"id":30058,"activityType":"DELIVERED","deliveryDate":"2023-05-23T04:02:56","status":"COMPLETED","createdAt":"2023-05-23T04:02:56"},{"activityType":"COSTING","deliveryDate":"2023-05-31T06:56:04","status":"COMPLETED"},{"activityType":"PHOTOSHOOT","deliveryDate":"2023-05-09T10:10:41","status":"COMPLETED"},{"activityType":"PUBLISHED","status":"COMPLETED"},{"activityType":"SENT_TO_BD","status":"PENDING"}],"unitResponse":{"id":1,"name":"BD-Inhouse","type":"SAMPLE_HOUSE"},"status":"DELIVERED","buyerApprovalStatus":"PENDING","productCreator":"Adnan1","productCreationDate":"08/05/2023"}]
     * requestedDocumentList : []
     * unitResponseList : [{"id":1,"name":"BD-Inhouse","type":"SAMPLE_HOUSE"}]
     */

    private int id;
    private String collectionName;
    private int collectionId;
    private String refNo;
    private int noOfDesign;
    private int brandId;
    private String brand;
    private int quantity;
    private int noOfSize;
    private String requestedBy;
    private int requestedById;
    private String requestedDate;
    private String deliveryDate;
    private int noOfUnreadMessage;
    private String requireDate;
    private String status;
    private List<ActivityCountListBean> activityCountList;
    private List<String> productDocuments;
    private List<SampleRequestItemResponseListBean> sampleRequestItemResponseList;
    private List<?> requestedDocumentList;
    private List<UnitResponseListBean> unitResponseList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public int getNoOfDesign() {
        return noOfDesign;
    }

    public void setNoOfDesign(int noOfDesign) {
        this.noOfDesign = noOfDesign;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getNoOfSize() {
        return noOfSize;
    }

    public void setNoOfSize(int noOfSize) {
        this.noOfSize = noOfSize;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public int getRequestedById() {
        return requestedById;
    }

    public void setRequestedById(int requestedById) {
        this.requestedById = requestedById;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getNoOfUnreadMessage() {
        return noOfUnreadMessage;
    }

    public void setNoOfUnreadMessage(int noOfUnreadMessage) {
        this.noOfUnreadMessage = noOfUnreadMessage;
    }

    public String getRequireDate() {
        return requireDate;
    }

    public void setRequireDate(String requireDate) {
        this.requireDate = requireDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ActivityCountListBean> getActivityCountList() {
        return activityCountList;
    }

    public void setActivityCountList(List<ActivityCountListBean> activityCountList) {
        this.activityCountList = activityCountList;
    }

    public List<String> getProductDocuments() {
        return productDocuments;
    }

    public void setProductDocuments(List<String> productDocuments) {
        this.productDocuments = productDocuments;
    }

    public List<SampleRequestItemResponseListBean> getSampleRequestItemResponseList() {
        return sampleRequestItemResponseList;
    }

    public void setSampleRequestItemResponseList(List<SampleRequestItemResponseListBean> sampleRequestItemResponseList) {
        this.sampleRequestItemResponseList = sampleRequestItemResponseList;
    }

    public List<?> getRequestedDocumentList() {
        return requestedDocumentList;
    }

    public void setRequestedDocumentList(List<?> requestedDocumentList) {
        this.requestedDocumentList = requestedDocumentList;
    }

    public List<UnitResponseListBean> getUnitResponseList() {
        return unitResponseList;
    }

    public void setUnitResponseList(List<UnitResponseListBean> unitResponseList) {
        this.unitResponseList = unitResponseList;
    }

    public static class ActivityCountListBean implements Serializable {
        /**
         * activity : Pattern
         * count : 0
         */

        private String activity;
        private int count;

        public String getActivity() {
            return activity;
        }

        public void setActivity(String activity) {
            this.activity = activity;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    public static class SampleRequestItemResponseListBean implements Serializable {
        /**
         * id : 15702
         * referenceNumber : MT23-A0306
         * productId : 60959
         * market : Men
         * category : SWEATSHIRT
         * requireDate : 2023-05-12
         * estimatedDeliveryDate : 2023-05-12
         * deliveryDate : 2023-05-23
         * featureImageDocUrl : https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/5/1683627040897_WT23-A1982_--F.png
         * materialList : ["Sherpa, 70.0% Viscose 30.0% Cotton, 150.0 GSM, Light peach"]
         * sampleItemDetailsResponseList : [{"id":29902,"size":"M","quantity":1,"colorResponse":{}}]
         * currentPendingActivity : {"activityType":"PUBLISHED","status":"COMPLETED"}
         * patternActivityResponse : {"id":29955,"activityType":"PATTERN","requiredDate":"2023-05-16","deliveryDate":"2023-05-16T05:37:52","status":"COMPLETED","assignedTo":11755,"assignedToName":"Shahin","createdAt":"2023-05-16T05:35:27"}
         * cuttingActivityResponse : {"id":29956,"activityType":"CUTTING","requiredDate":"2023-05-17","deliveryDate":"2023-05-16T05:52:55","status":"COMPLETED","assignedTo":12852,"assignedToName":"Riad Sikdar","createdAt":"2023-05-16T05:50:49"}
         * isConsumptionCompleted : true
         * isMeasurementCompleted : true
         * timeLineActivityResponse : [{"activityType":"DESIGN_UPLOADED","status":"COMPLETED","createdAt":"2023-05-08T09:17:08"},{"id":29852,"activityType":"REQUESTED","deliveryDate":"2023-05-16T05:58:18","status":"COMPLETED","createdAt":"2023-05-15T06:56:37"},{"id":29955,"activityType":"PATTERN","requiredDate":"2023-05-16","deliveryDate":"2023-05-16T05:37:52","status":"COMPLETED","assignedTo":11755,"assignedToName":"Shahin","createdAt":"2023-05-16T05:35:27"},{"id":29956,"activityType":"CUTTING","requiredDate":"2023-05-17","deliveryDate":"2023-05-16T05:52:55","status":"COMPLETED","assignedTo":12852,"assignedToName":"Riad Sikdar","createdAt":"2023-05-16T05:50:49"},{"activityType":"PRINT","status":"PENDING"},{"activityType":"EMBROIDERY","status":"PENDING"},{"activityType":"SEWING","status":"PENDING"},{"activityType":"WASH","status":"PENDING"},{"id":29957,"activityType":"DELIVERED","deliveryDate":"2023-05-23T04:02:56","status":"COMPLETED","createdAt":"2023-05-16T05:58:18"},{"activityType":"COSTING","deliveryDate":"2023-05-31T06:56:04","status":"COMPLETED"},{"activityType":"PHOTOSHOOT","deliveryDate":"2023-05-09T10:10:41","status":"COMPLETED"},{"activityType":"PUBLISHED","status":"COMPLETED"},{"activityType":"SENT_TO_BD","status":"PENDING"}]
         * unitResponse : {"id":1,"name":"BD-Inhouse","type":"SAMPLE_HOUSE"}
         * status : DELIVERED
         * buyerApprovalStatus : PENDING
         * productCreator : Adnan1
         * productCreationDate : 08/05/2023
         * noOfUnreadMessage : 2
         */

        private int id;
        private String referenceNumber;
        private int productId;
        private String market;
        private String category;
        private String requireDate;
        private String estimatedDeliveryDate;
        private String deliveryDate;
        private String featureImageDocUrl;
        private CurrentPendingActivityBean currentPendingActivity;
        private PatternActivityResponseBean patternActivityResponse;
        private CuttingActivityResponseBean cuttingActivityResponse;
        private boolean isConsumptionCompleted;
        private boolean isMeasurementCompleted;
        private UnitResponseBean unitResponse;
        private String status;
        private String buyerApprovalStatus;
        private String productCreator;
        private String productCreationDate;
        private int noOfUnreadMessage;
        private List<String> materialList;
        private List<SampleItemDetailsResponseListBean> sampleItemDetailsResponseList;
        private List<TimeLineActivityResponseBean> timeLineActivityResponse;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getReferenceNumber() {
            return referenceNumber;
        }

        public void setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public String getMarket() {
            return market;
        }

        public void setMarket(String market) {
            this.market = market;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getRequireDate() {
            return requireDate;
        }

        public void setRequireDate(String requireDate) {
            this.requireDate = requireDate;
        }

        public String getEstimatedDeliveryDate() {
            return estimatedDeliveryDate;
        }

        public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
            this.estimatedDeliveryDate = estimatedDeliveryDate;
        }

        public String getDeliveryDate() {
            return deliveryDate;
        }

        public void setDeliveryDate(String deliveryDate) {
            this.deliveryDate = deliveryDate;
        }

        public String getFeatureImageDocUrl() {
            return featureImageDocUrl;
        }

        public void setFeatureImageDocUrl(String featureImageDocUrl) {
            this.featureImageDocUrl = featureImageDocUrl;
        }

        public CurrentPendingActivityBean getCurrentPendingActivity() {
            return currentPendingActivity;
        }

        public void setCurrentPendingActivity(CurrentPendingActivityBean currentPendingActivity) {
            this.currentPendingActivity = currentPendingActivity;
        }

        public PatternActivityResponseBean getPatternActivityResponse() {
            return patternActivityResponse;
        }

        public void setPatternActivityResponse(PatternActivityResponseBean patternActivityResponse) {
            this.patternActivityResponse = patternActivityResponse;
        }

        public CuttingActivityResponseBean getCuttingActivityResponse() {
            return cuttingActivityResponse;
        }

        public void setCuttingActivityResponse(CuttingActivityResponseBean cuttingActivityResponse) {
            this.cuttingActivityResponse = cuttingActivityResponse;
        }

        public boolean isIsConsumptionCompleted() {
            return isConsumptionCompleted;
        }

        public void setIsConsumptionCompleted(boolean isConsumptionCompleted) {
            this.isConsumptionCompleted = isConsumptionCompleted;
        }

        public boolean isIsMeasurementCompleted() {
            return isMeasurementCompleted;
        }

        public void setIsMeasurementCompleted(boolean isMeasurementCompleted) {
            this.isMeasurementCompleted = isMeasurementCompleted;
        }

        public UnitResponseBean getUnitResponse() {
            return unitResponse;
        }

        public void setUnitResponse(UnitResponseBean unitResponse) {
            this.unitResponse = unitResponse;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getBuyerApprovalStatus() {
            return buyerApprovalStatus;
        }

        public void setBuyerApprovalStatus(String buyerApprovalStatus) {
            this.buyerApprovalStatus = buyerApprovalStatus;
        }

        public String getProductCreator() {
            return productCreator;
        }

        public void setProductCreator(String productCreator) {
            this.productCreator = productCreator;
        }

        public String getProductCreationDate() {
            return productCreationDate;
        }

        public void setProductCreationDate(String productCreationDate) {
            this.productCreationDate = productCreationDate;
        }

        public int getNoOfUnreadMessage() {
            return noOfUnreadMessage;
        }

        public void setNoOfUnreadMessage(int noOfUnreadMessage) {
            this.noOfUnreadMessage = noOfUnreadMessage;
        }

        public List<String> getMaterialList() {
            return materialList;
        }

        public void setMaterialList(List<String> materialList) {
            this.materialList = materialList;
        }

        public List<SampleItemDetailsResponseListBean> getSampleItemDetailsResponseList() {
            return sampleItemDetailsResponseList;
        }

        public void setSampleItemDetailsResponseList(List<SampleItemDetailsResponseListBean> sampleItemDetailsResponseList) {
            this.sampleItemDetailsResponseList = sampleItemDetailsResponseList;
        }

        public List<TimeLineActivityResponseBean> getTimeLineActivityResponse() {
            return timeLineActivityResponse;
        }

        public void setTimeLineActivityResponse(List<TimeLineActivityResponseBean> timeLineActivityResponse) {
            this.timeLineActivityResponse = timeLineActivityResponse;
        }

        public static class CurrentPendingActivityBean implements Serializable {
            /**
             * activityType : PUBLISHED
             * status : COMPLETED
             */

            private String activityType;
            private String status;

            public String getActivityType() {
                return activityType;
            }

            public void setActivityType(String activityType) {
                this.activityType = activityType;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }
        }

        public static class PatternActivityResponseBean implements Serializable {
            /**
             * id : 29955
             * activityType : PATTERN
             * requiredDate : 2023-05-16
             * deliveryDate : 2023-05-16T05:37:52
             * status : COMPLETED
             * assignedTo : 11755
             * assignedToName : Shahin
             * createdAt : 2023-05-16T05:35:27
             */

            private int id;
            private String activityType;
            private String requiredDate;
            private String deliveryDate;
            private String status;
            private int assignedTo;
            private String assignedToName;
            private String createdAt;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getActivityType() {
                return activityType;
            }

            public void setActivityType(String activityType) {
                this.activityType = activityType;
            }

            public String getRequiredDate() {
                return requiredDate;
            }

            public void setRequiredDate(String requiredDate) {
                this.requiredDate = requiredDate;
            }

            public String getDeliveryDate() {
                return deliveryDate;
            }

            public void setDeliveryDate(String deliveryDate) {
                this.deliveryDate = deliveryDate;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public int getAssignedTo() {
                return assignedTo;
            }

            public void setAssignedTo(int assignedTo) {
                this.assignedTo = assignedTo;
            }

            public String getAssignedToName() {
                return assignedToName;
            }

            public void setAssignedToName(String assignedToName) {
                this.assignedToName = assignedToName;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }
        }

        public static class CuttingActivityResponseBean implements Serializable {
            /**
             * id : 29956
             * activityType : CUTTING
             * requiredDate : 2023-05-17
             * deliveryDate : 2023-05-16T05:52:55
             * status : COMPLETED
             * assignedTo : 12852
             * assignedToName : Riad Sikdar
             * createdAt : 2023-05-16T05:50:49
             */

            private int id;
            private String activityType;
            private String requiredDate;
            private String deliveryDate;
            private String status;
            private int assignedTo;
            private String assignedToName;
            private String createdAt;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getActivityType() {
                return activityType;
            }

            public void setActivityType(String activityType) {
                this.activityType = activityType;
            }

            public String getRequiredDate() {
                return requiredDate;
            }

            public void setRequiredDate(String requiredDate) {
                this.requiredDate = requiredDate;
            }

            public String getDeliveryDate() {
                return deliveryDate;
            }

            public void setDeliveryDate(String deliveryDate) {
                this.deliveryDate = deliveryDate;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public int getAssignedTo() {
                return assignedTo;
            }

            public void setAssignedTo(int assignedTo) {
                this.assignedTo = assignedTo;
            }

            public String getAssignedToName() {
                return assignedToName;
            }

            public void setAssignedToName(String assignedToName) {
                this.assignedToName = assignedToName;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }
        }

        public static class UnitResponseBean implements Serializable {
            /**
             * id : 1
             * name : BD-Inhouse
             * type : SAMPLE_HOUSE
             */

            private int id;
            private String name;
            private String type;

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

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class SampleItemDetailsResponseListBean implements Serializable {
            /**
             * id : 29902
             * size : M
             * quantity : 1
             * colorResponse : {}
             */

            private int id;
            private String size;
            private int quantity;
            private ColorResponseBean colorResponse;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getSize() {
                return size;
            }

            public void setSize(String size) {
                this.size = size;
            }

            public int getQuantity() {
                return quantity;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }

            public ColorResponseBean getColorResponse() {
                return colorResponse;
            }

            public void setColorResponse(ColorResponseBean colorResponse) {
                this.colorResponse = colorResponse;
            }

            public static class ColorResponseBean implements Serializable {
            }
        }

        public static class TimeLineActivityResponseBean implements Serializable {
            /**
             * activityType : DESIGN_UPLOADED
             * status : COMPLETED
             * createdAt : 2023-05-08T09:17:08
             * id : 29852
             * deliveryDate : 2023-05-16T05:58:18
             * requiredDate : 2023-05-16
             * assignedTo : 11755
             * assignedToName : Shahin
             */

            private String activityType;
            private String status;
            private String createdAt;
            private int id;
            private String deliveryDate;
            private String requiredDate;
            private int assignedTo;
            private String assignedToName;

            public String getActivityType() {
                return activityType;
            }

            public void setActivityType(String activityType) {
                this.activityType = activityType;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getDeliveryDate() {
                return deliveryDate;
            }

            public void setDeliveryDate(String deliveryDate) {
                this.deliveryDate = deliveryDate;
            }

            public String getRequiredDate() {
                return requiredDate;
            }

            public void setRequiredDate(String requiredDate) {
                this.requiredDate = requiredDate;
            }

            public int getAssignedTo() {
                return assignedTo;
            }

            public void setAssignedTo(int assignedTo) {
                this.assignedTo = assignedTo;
            }

            public String getAssignedToName() {
                return assignedToName;
            }

            public void setAssignedToName(String assignedToName) {
                this.assignedToName = assignedToName;
            }
        }
    }

    public static class UnitResponseListBean implements Serializable {
        /**
         * id : 1
         * name : BD-Inhouse
         * type : SAMPLE_HOUSE
         */

        private int id;
        private String name;
        private String type;

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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
