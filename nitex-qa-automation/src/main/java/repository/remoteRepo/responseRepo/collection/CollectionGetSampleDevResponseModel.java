package repository.remoteRepo.responseRepo.collection;

import java.io.Serializable;
import java.util.List;

public class CollectionGetSampleDevResponseModel {


    private List<SampleItemsBean> sampleItems;

    public List<SampleItemsBean> getSampleItems() {
        return sampleItems;
    }

    public void setSampleItems(List<SampleItemsBean> sampleItems) {
        this.sampleItems = sampleItems;
    }

    public static class SampleItemsBean implements Serializable {
        /**
         * referenceNumber : null-1
         * productId : 61210
         * market : Women
         * category : TAILORED PANTS
         * featureImageDocUrl : https://d2939dhdpmjcbe.cloudfront.net/product/design/2023/5/1683818189939_WOMEN%27S_CROP_RIDER_JACKET-%28WT121-SS-21-FRONT%29.png
         * materialList : ["10x3 Rib, 75% Silk 25% Viscose, 2x2 rib, 300.0 GSM, Ozone Fading","2/1 Right Hand Twill, 100% Nylon, 12.45 OZ"]
         * sampleItemDetailsResponseList : [{"colorResponse":{"id":71056,"code":"18-1442 TCX","hexCode":"#913832","name":"Red Ochre","pantoneColorId":558,"colorType":"SOLID","representedBy":"PANTONE_OR_HEX_CODE"}}]
         * isConsumptionCompleted : false
         * isMeasurementCompleted : false
         * timeLineActivityResponse : [{"activityType":"DESIGN_UPLOADED","status":"COMPLETED","createdAt":"2023-05-11T15:16:30"},{"activityType":"REQUESTED","status":"PENDING"},{"activityType":"PATTERN","status":"PENDING"},{"activityType":"CUTTING","status":"PENDING"},{"activityType":"PRINT","status":"PENDING"},{"activityType":"EMBROIDERY","status":"PENDING"},{"activityType":"SEWING","status":"PENDING"},{"activityType":"WASH","status":"PENDING"},{"activityType":"DELIVERED","status":"PENDING"},{"activityType":"COSTING","status":"PENDING"},{"activityType":"PHOTOSHOOT","status":"PENDING"},{"activityType":"PUBLISHED","status":"PENDING"},{"activityType":"SENT_TO_BD","status":"PENDING"}]
         * isCostingRequested : false
         * isPhotoshootRequested : false
         * consumptionResponse : []
         * status : PENDING
         * buyerApprovalStatus : PENDING
         * productCreator : Adnan1
         * productCreationDate : 11/05/2023
         * basePrice : 5.0
         */

        private String referenceNumber;
        private int productId;
        private String market;
        private String category;
        private String featureImageDocUrl;
        private boolean isConsumptionCompleted;
        private boolean isMeasurementCompleted;
        private boolean isCostingRequested;
        private boolean isPhotoshootRequested;
        private String status;
        private String buyerApprovalStatus;
        private String productCreator;
        private String productCreationDate;
        private double basePrice;
        private List<String> materialList;
        private List<SampleItemDetailsResponseListBean> sampleItemDetailsResponseList;
        private List<TimeLineActivityResponseBean> timeLineActivityResponse;
        private List<?> consumptionResponse;

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

        public String getFeatureImageDocUrl() {
            return featureImageDocUrl;
        }

        public void setFeatureImageDocUrl(String featureImageDocUrl) {
            this.featureImageDocUrl = featureImageDocUrl;
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

        public boolean isIsCostingRequested() {
            return isCostingRequested;
        }

        public void setIsCostingRequested(boolean isCostingRequested) {
            this.isCostingRequested = isCostingRequested;
        }

        public boolean isIsPhotoshootRequested() {
            return isPhotoshootRequested;
        }

        public void setIsPhotoshootRequested(boolean isPhotoshootRequested) {
            this.isPhotoshootRequested = isPhotoshootRequested;
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

        public double getBasePrice() {
            return basePrice;
        }

        public void setBasePrice(double basePrice) {
            this.basePrice = basePrice;
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

        public List<?> getConsumptionResponse() {
            return consumptionResponse;
        }

        public void setConsumptionResponse(List<?> consumptionResponse) {
            this.consumptionResponse = consumptionResponse;
        }

        public static class SampleItemDetailsResponseListBean implements Serializable {
            /**
             * colorResponse : {"id":71056,"code":"18-1442 TCX","hexCode":"#913832","name":"Red Ochre","pantoneColorId":558,"colorType":"SOLID","representedBy":"PANTONE_OR_HEX_CODE"}
             */

            private ColorResponseBean colorResponse;

            public ColorResponseBean getColorResponse() {
                return colorResponse;
            }

            public void setColorResponse(ColorResponseBean colorResponse) {
                this.colorResponse = colorResponse;
            }

            public static class ColorResponseBean implements Serializable {
                /**
                 * id : 71056
                 * code : 18-1442 TCX
                 * hexCode : #913832
                 * name : Red Ochre
                 * pantoneColorId : 558
                 * colorType : SOLID
                 * representedBy : PANTONE_OR_HEX_CODE
                 */

                private int id;
                private String code;
                private String hexCode;
                private String name;
                private int pantoneColorId;
                private String colorType;
                private String representedBy;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getHexCode() {
                    return hexCode;
                }

                public void setHexCode(String hexCode) {
                    this.hexCode = hexCode;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getPantoneColorId() {
                    return pantoneColorId;
                }

                public void setPantoneColorId(int pantoneColorId) {
                    this.pantoneColorId = pantoneColorId;
                }

                public String getColorType() {
                    return colorType;
                }

                public void setColorType(String colorType) {
                    this.colorType = colorType;
                }

                public String getRepresentedBy() {
                    return representedBy;
                }

                public void setRepresentedBy(String representedBy) {
                    this.representedBy = representedBy;
                }
            }
        }

        public static class TimeLineActivityResponseBean implements Serializable {
            /**
             * activityType : DESIGN_UPLOADED
             * status : COMPLETED
             * createdAt : 2023-05-11T15:16:30
             */

            private String activityType;
            private String status;
            private String createdAt;

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
        }
    }
}
