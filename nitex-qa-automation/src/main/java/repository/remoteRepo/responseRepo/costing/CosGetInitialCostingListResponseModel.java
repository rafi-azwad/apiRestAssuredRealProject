package repository.remoteRepo.responseRepo.costing;

import java.io.Serializable;
import java.util.List;

public class CosGetInitialCostingListResponseModel {


    /**
     * totalPages : 3
     * totalElements : 32
     * currentPage : 0
     * data : [{"id":36552,"collectionName":"Tech pack 2","name":"Tech pack 2","ownerName":"Alam","numOfDesign":1,"numOfCompletedDesign":0,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"26/01/2023","createdBy":"Alam","brand":"Affliction","brandId":3002,"season":"WINTER_24","isNitexCollection":false,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"TECHPACK","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/design/2023/1/1674714455475_techpack1.jpg"],"productAvailabilityStatusCountMap":{"TECHPACK":1},"pendingPhotography":1,"completedPhotography":0},{"id":12502,"collectionName":"Sweet winter","name":"Sweet winter","ownerName":"Toni","numOfDesign":6,"numOfCompletedDesign":4,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"28/11/2021","createdBy":"Toma","brand":"Nitex","brandId":1,"isNitexCollection":true,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"DEVELOPMENT","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/design/2021/11/1638074048763_black_check.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/design/2021/11/1638075256761_genmedia_PIC1748280_RL_01_w1500_h1500_c217224230255.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/design/2021/11/1638078900245_hbeu50198254_610_100.jpg"],"productAvailabilityStatusCountMap":{"DEVELOPMENT":1,"TECHPACK":1,"COMPLETE":4},"pendingPhotography":6,"completedPhotography":0},{"id":16954,"collectionName":"Winter Girls 22","name":"Winter Girls 22","ownerName":"Toni","numOfDesign":15,"numOfCompletedDesign":1,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"23/02/2022","createdBy":"Ghalib","brand":"Nitex","brandId":1,"season":"WINTER_24","isNitexCollection":true,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"TECHPACK","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/2/1645687377316_56.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/2/1645687407776_59.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/2/1645687433803_50.jpg"],"productAvailabilityStatusCountMap":{"SOLD":1,"DEVELOPMENT":3,"TECHPACK":11},"pendingPhotography":15,"completedPhotography":0},{"id":28854,"collectionName":"Status check","name":"Status check","ownerName":"Naima","numOfDesign":3,"numOfCompletedDesign":1,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"16/08/2022","createdBy":"Naima","brand":"Nitex","brandId":1,"season":"WINTER_25","isNitexCollection":true,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"DEVELOPMENT","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2022/8/1660643620985_Techpack_NCGDBQ-SS2324-GF-007-2.jpeg","https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/8/1660643673698_24255066_1629501137140362_6368870941904407652_o.jpg"],"productAvailabilityStatusCountMap":{"DEVELOPMENT":1,"COMPLETE":1,"TECHPACK":1},"pendingPhotography":2,"completedPhotography":0},{"id":21902,"collectionName":"Test by Rashed","name":"Test by Rashed","ownerName":"Mahdi","numOfDesign":19,"numOfCompletedDesign":1,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"02/06/2022","createdBy":"Adnan1","brand":"Daniel Hechter","brandId":1804,"season":"WINTER_25","isNitexCollection":true,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"DEVELOPMENT","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2022/6/1654244085977_1652687899480_photo-1552252059-9d77e4059ad1.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2022/6/1654249834630_1652688560060_photo-1598554793905-075f7b355cd9.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2022/6/1654250676344_1652687899298_photo-1552874869-5c39ec9288dc.jpg"],"productAvailabilityStatusCountMap":{"DEVELOPMENT":16,"TECHPACK":2,"COMPLETE":1},"pendingPhotography":17,"completedPhotography":2},{"id":38903,"collectionName":"Farabi collection","name":"Farabi collection","ownerName":"Adnan1","numOfDesign":4,"numOfCompletedDesign":1,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"08/05/2023","createdBy":"Adnan1","brand":"Nitex","brandId":1,"season":"AUTUMN_20","isNitexCollection":true,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"DEVELOPMENT","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2023/5/1683537461515_1676041258780_GT22-A1281_-B.png","https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/5/1683627040897_WT23-A1982_--F.png"],"productAvailabilityStatusCountMap":{"DEVELOPMENT":1,"COMPLETE":1,"TECHPACK":2},"pendingPhotography":1,"completedPhotography":1},{"id":37702,"collectionName":"abcd efgh","name":"abcd efgh","ownerName":"Mahdi","numOfDesign":10,"numOfCompletedDesign":5,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"28/02/2023","createdBy":"Adnan1","brand":"SCALPERS","brandId":3202,"season":"AUTUMN_23","isNitexCollection":true,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"TECHPACK","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/5/1683707022482_1420000153292.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/5/1683707082870_0550000131637.png"],"productAvailabilityStatusCountMap":{"COMPLETE":4,"TECHPACK":5,"PUBLISHED":1},"pendingPhotography":2,"completedPhotography":0},{"id":30652,"collectionName":"8/30/1","name":"8/30/1","ownerName":"Toma","numOfDesign":5,"numOfCompletedDesign":4,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"30/08/2022","createdBy":"Adnan1","brand":"Nitex","brandId":1,"season":"WINTER_23","isNitexCollection":true,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"DEVELOPMENT","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/9/1662445185547_product-jpeg-500x500_%282%29.jpg"],"productAvailabilityStatusCountMap":{"SOLD":1,"DEVELOPMENT":1,"COMPLETE":3},"pendingPhotography":1,"completedPhotography":0},{"id":32503,"collectionName":"Spoiler alert","name":"Spoiler alert","ownerName":"Toni","numOfDesign":13,"numOfCompletedDesign":6,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"27/10/2022","createdBy":"Adnan1","brand":"Nitex","brandId":1,"isNitexCollection":true,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"DEVELOPMENT","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666937189196_2f4debe6c0ce3f54d8e3524baabb50ba.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666937294570_7c76695cd8c0c1b87317fcd57efc2e18.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/10/1666937333741_96e98f407acfae92d51c8f62ffc0dda5.jpg"],"productAvailabilityStatusCountMap":{"SOLD":1,"DEVELOPMENT":3,"TECHPACK":4,"COMPLETE":5},"pendingPhotography":12,"completedPhotography":1},{"id":22002,"collectionName":"last moment checkk","name":"last moment checkk","ownerName":"Toni","numOfDesign":15,"numOfCompletedDesign":7,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"03/06/2022","createdBy":"Adnan1","brand":"HERMES PARIS","brandId":3052,"isNitexCollection":true,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"DEVELOPMENT","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2022/6/1654258407980_eaf0bbd85b33c252493d82896070b560.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2022/6/1654258481664_hbeu50452873_100_100.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2022/6/1654258491470_c6225e3c25c57b932ac545866a6e97f6.jpg"],"productAvailabilityStatusCountMap":{"SOLD":4,"DEVELOPMENT":4,"COMPLETE":3,"TECHPACK":4},"pendingPhotography":14,"completedPhotography":0},{"id":28955,"collectionName":"Newly created collection to check IS DELETE ","name":"Newly created collection to check IS DELETE ","ownerName":"Adnan1","numOfDesign":12,"numOfCompletedDesign":1,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"17/08/2022","createdBy":"Adnan1","brand":"Nitex","brandId":1,"season":"WINTER_26","isNitexCollection":true,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"TECHPACK","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2022/8/1661927321190_0958202D-1636___F.jpeg"],"productAvailabilityStatusCountMap":{"DEVELOPMENT":2,"TECHPACK":9,"COMPLETE":1},"pendingPhotography":1,"completedPhotography":0},{"id":27275,"collectionName":"Status check ","name":"Status check ","ownerName":"Naima","numOfDesign":8,"numOfCompletedDesign":0,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"07/08/2022","createdBy":"Naima","brand":"American Eagle","brandId":3,"season":"WINTER_23","isNitexCollection":true,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"TECHPACK","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2022/8/1659865792285_AKK02159-808-30___F.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2022/8/1659865807466_MB-1577___F.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/reference_image/2022/8/1659865823111_GC-020___F.jpg"],"productAvailabilityStatusCountMap":{"TECHPACK":8},"pendingPhotography":7,"completedPhotography":1},{"id":21502,"collectionName":"Design tool dependency check","name":"Design tool dependency check","ownerName":"Toni","numOfDesign":51,"numOfCompletedDesign":34,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"26/05/2022","createdBy":"Adnan1","brand":"HERMES PARIS","brandId":3052,"season":"SUMMER_25","isNitexCollection":true,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"DEVELOPMENT","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1666948881731_2020productmockups_1.png","https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1667191666629_1622512801.jpg","https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1667191667263_44.jpg"],"productAvailabilityStatusCountMap":{"SOLD":9,"DEVELOPMENT":10,"COMPLETE":25,"TECHPACK":7},"pendingPhotography":3,"completedPhotography":0},{"id":6353,"collectionName":"100% Organic Special","name":"100% Organic Special","ownerName":"Toni","numOfDesign":13,"numOfCompletedDesign":12,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"28/05/2021","createdBy":"Adnan1","brand":"Nitex","brandId":1,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"DEVELOPMENT","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1665471079131_81kJzDOwjNL._AC._SR360%2C460.png"],"productAvailabilityStatusCountMap":{"SOLD":6,"TECHPACK":1,"COMPLETE":6},"pendingPhotography":1,"completedPhotography":0},{"id":32655,"collectionName":"M - Check Copy Collection","name":"M - Check Copy Collection","ownerName":"Toni","numOfDesign":14,"numOfCompletedDesign":7,"isNew":false,"isPinned":false,"hasUnseenMention":false,"dateCreated":"30/10/2022","createdBy":"Toni","brand":"American Eagle","brandId":3,"season":"WINTER_23","isNitexCollection":false,"collectionViewType":"PRODUCT_LIST","availabilityStatus":"DEVELOPMENT","documentPathList":["https://d2939dhdpmjcbe.cloudfront.net/product/design/2022/10/1667114236409_profile-pic_%281%29.png"],"productAvailabilityStatusCountMap":{"SOLD":4,"DEVELOPMENT":4,"COMPLETE":3,"TECHPACK":3},"pendingPhotography":1,"completedPhotography":0}]
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
         * id : 36552
         * collectionName : Tech pack 2
         * name : Tech pack 2
         * ownerName : Alam
         * numOfDesign : 1
         * numOfCompletedDesign : 0
         * isNew : false
         * isPinned : false
         * hasUnseenMention : false
         * dateCreated : 26/01/2023
         * createdBy : Alam
         * brand : Affliction
         * brandId : 3002
         * season : WINTER_24
         * isNitexCollection : false
         * collectionViewType : PRODUCT_LIST
         * availabilityStatus : TECHPACK
         * documentPathList : ["https://d2939dhdpmjcbe.cloudfront.net/product/design/2023/1/1674714455475_techpack1.jpg"]
         * productAvailabilityStatusCountMap : {"TECHPACK":1}
         * pendingPhotography : 1
         * completedPhotography : 0
         */

        private int id;
        private String collectionName;
        private String name;
        private String ownerName;
        private int numOfDesign;
        private int numOfCompletedDesign;
        private boolean isNew;
        private boolean isPinned;
        private boolean hasUnseenMention;
        private String dateCreated;
        private String createdBy;
        private String brand;
        private int brandId;
        private String season;
        private boolean isNitexCollection;
        private String collectionViewType;
        private String availabilityStatus;
        private ProductAvailabilityStatusCountMapBean productAvailabilityStatusCountMap;
        private int pendingPhotography;
        private int completedPhotography;
        private List<String> documentPathList;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public int getNumOfDesign() {
            return numOfDesign;
        }

        public void setNumOfDesign(int numOfDesign) {
            this.numOfDesign = numOfDesign;
        }

        public int getNumOfCompletedDesign() {
            return numOfCompletedDesign;
        }

        public void setNumOfCompletedDesign(int numOfCompletedDesign) {
            this.numOfCompletedDesign = numOfCompletedDesign;
        }

        public boolean isIsNew() {
            return isNew;
        }

        public void setIsNew(boolean isNew) {
            this.isNew = isNew;
        }

        public boolean isIsPinned() {
            return isPinned;
        }

        public void setIsPinned(boolean isPinned) {
            this.isPinned = isPinned;
        }

        public boolean isHasUnseenMention() {
            return hasUnseenMention;
        }

        public void setHasUnseenMention(boolean hasUnseenMention) {
            this.hasUnseenMention = hasUnseenMention;
        }

        public String getDateCreated() {
            return dateCreated;
        }

        public void setDateCreated(String dateCreated) {
            this.dateCreated = dateCreated;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getBrandId() {
            return brandId;
        }

        public void setBrandId(int brandId) {
            this.brandId = brandId;
        }

        public String getSeason() {
            return season;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        public boolean isIsNitexCollection() {
            return isNitexCollection;
        }

        public void setIsNitexCollection(boolean isNitexCollection) {
            this.isNitexCollection = isNitexCollection;
        }

        public String getCollectionViewType() {
            return collectionViewType;
        }

        public void setCollectionViewType(String collectionViewType) {
            this.collectionViewType = collectionViewType;
        }

        public String getAvailabilityStatus() {
            return availabilityStatus;
        }

        public void setAvailabilityStatus(String availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
        }

        public ProductAvailabilityStatusCountMapBean getProductAvailabilityStatusCountMap() {
            return productAvailabilityStatusCountMap;
        }

        public void setProductAvailabilityStatusCountMap(ProductAvailabilityStatusCountMapBean productAvailabilityStatusCountMap) {
            this.productAvailabilityStatusCountMap = productAvailabilityStatusCountMap;
        }

        public int getPendingPhotography() {
            return pendingPhotography;
        }

        public void setPendingPhotography(int pendingPhotography) {
            this.pendingPhotography = pendingPhotography;
        }

        public int getCompletedPhotography() {
            return completedPhotography;
        }

        public void setCompletedPhotography(int completedPhotography) {
            this.completedPhotography = completedPhotography;
        }

        public List<String> getDocumentPathList() {
            return documentPathList;
        }

        public void setDocumentPathList(List<String> documentPathList) {
            this.documentPathList = documentPathList;
        }

        public static class ProductAvailabilityStatusCountMapBean implements Serializable {
            /**
             * TECHPACK : 1
             */

            private int TECHPACK;

            public int getTECHPACK() {
                return TECHPACK;
            }

            public void setTECHPACK(int TECHPACK) {
                this.TECHPACK = TECHPACK;
            }
        }
    }
}
