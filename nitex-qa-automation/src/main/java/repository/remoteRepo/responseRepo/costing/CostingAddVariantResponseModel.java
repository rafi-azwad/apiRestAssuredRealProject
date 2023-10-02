package repository.remoteRepo.responseRepo.costing;

import java.io.Serializable;

public class CostingAddVariantResponseModel {


    /**
     * success : true
     * message : New variant added successfully
     * id : 15565
     * payload : {"id":15565,"productId":60706,"market":"Men","category":"JACKET","featureImageDocUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2023/5/1683092966086_Techapck.jpg","productRefNo":"WC1152501DIN","productTitle":"JACKET","productCreator":"Towhid","initialCostingId":29665,"quantityWiseCostingId":27415,"isChangeRequired":false,"isSameProduct":true,"isSameVariant":false,"status":"INITIALIZED","isCloned":false,"isQuoted":false}
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
         * id : 15565
         * productId : 60706
         * market : Men
         * category : JACKET
         * featureImageDocUrl : https://d2939dhdpmjcbe.cloudfront.net/product/design/2023/5/1683092966086_Techapck.jpg
         * productRefNo : WC1152501DIN
         * productTitle : JACKET
         * productCreator : Towhid
         * initialCostingId : 29665
         * quantityWiseCostingId : 27415
         * isChangeRequired : false
         * isSameProduct : true
         * isSameVariant : false
         * status : INITIALIZED
         * isCloned : false
         * isQuoted : false
         */

        private int id;
        private int productId;
        private String market;
        private String category;
        private String featureImageDocUrl;
        private String productRefNo;
        private String productTitle;
        private String productCreator;
        private int initialCostingId;
        private int quantityWiseCostingId;
        private boolean isChangeRequired;
        private boolean isSameProduct;
        private boolean isSameVariant;
        private String status;
        private boolean isCloned;
        private boolean isQuoted;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public String getProductRefNo() {
            return productRefNo;
        }

        public void setProductRefNo(String productRefNo) {
            this.productRefNo = productRefNo;
        }

        public String getProductTitle() {
            return productTitle;
        }

        public void setProductTitle(String productTitle) {
            this.productTitle = productTitle;
        }

        public String getProductCreator() {
            return productCreator;
        }

        public void setProductCreator(String productCreator) {
            this.productCreator = productCreator;
        }

        public int getInitialCostingId() {
            return initialCostingId;
        }

        public void setInitialCostingId(int initialCostingId) {
            this.initialCostingId = initialCostingId;
        }

        public int getQuantityWiseCostingId() {
            return quantityWiseCostingId;
        }

        public void setQuantityWiseCostingId(int quantityWiseCostingId) {
            this.quantityWiseCostingId = quantityWiseCostingId;
        }

        public boolean isIsChangeRequired() {
            return isChangeRequired;
        }

        public void setIsChangeRequired(boolean isChangeRequired) {
            this.isChangeRequired = isChangeRequired;
        }

        public boolean isIsSameProduct() {
            return isSameProduct;
        }

        public void setIsSameProduct(boolean isSameProduct) {
            this.isSameProduct = isSameProduct;
        }

        public boolean isIsSameVariant() {
            return isSameVariant;
        }

        public void setIsSameVariant(boolean isSameVariant) {
            this.isSameVariant = isSameVariant;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public boolean isIsCloned() {
            return isCloned;
        }

        public void setIsCloned(boolean isCloned) {
            this.isCloned = isCloned;
        }

        public boolean isIsQuoted() {
            return isQuoted;
        }

        public void setIsQuoted(boolean isQuoted) {
            this.isQuoted = isQuoted;
        }
    }
}
