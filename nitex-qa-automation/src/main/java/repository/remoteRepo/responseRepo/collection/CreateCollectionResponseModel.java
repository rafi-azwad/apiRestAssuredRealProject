package repository.remoteRepo.responseRepo.collection;

import java.io.Serializable;
import java.util.List;

public class CreateCollectionResponseModel {


    /**
     * success : true
     * message : Collection added successfully
     * id : 39002
     * payload : {"id":39002,"name":"Sample collection for QA","ownerName":"Hussain Mahdi","numOfDesign":0,"lastDesignUpdatedAt":"2023-05-09T11:16:06","collectionViewType":"PRODUCT_LIST","documentResponseList":[],"tags":[{"id":10602,"text":"Winter"}],"isFavorite":false,"isNitexCollection":true}
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
         * id : 39002
         * name : Sample collection for QA
         * ownerName : Hussain Mahdi
         * numOfDesign : 0
         * lastDesignUpdatedAt : 2023-05-09T11:16:06
         * collectionViewType : PRODUCT_LIST
         * documentResponseList : []
         * tags : [{"id":10602,"text":"Winter"}]
         * isFavorite : false
         * isNitexCollection : true
         */

        private int id;
        private String name;
        private String ownerName;
        private int numOfDesign;
        private String lastDesignUpdatedAt;
        private String collectionViewType;
        private boolean isFavorite;
        private boolean isNitexCollection;
        private List<?> documentResponseList;
        private List<TagsBean> tags;

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

        public String getLastDesignUpdatedAt() {
            return lastDesignUpdatedAt;
        }

        public void setLastDesignUpdatedAt(String lastDesignUpdatedAt) {
            this.lastDesignUpdatedAt = lastDesignUpdatedAt;
        }

        public String getCollectionViewType() {
            return collectionViewType;
        }

        public void setCollectionViewType(String collectionViewType) {
            this.collectionViewType = collectionViewType;
        }

        public boolean isIsFavorite() {
            return isFavorite;
        }

        public void setIsFavorite(boolean isFavorite) {
            this.isFavorite = isFavorite;
        }

        public boolean isIsNitexCollection() {
            return isNitexCollection;
        }

        public void setIsNitexCollection(boolean isNitexCollection) {
            this.isNitexCollection = isNitexCollection;
        }

        public List<?> getDocumentResponseList() {
            return documentResponseList;
        }

        public void setDocumentResponseList(List<?> documentResponseList) {
            this.documentResponseList = documentResponseList;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public static class TagsBean implements Serializable {
            /**
             * id : 10602
             * text : Winter
             */

            private int id;
            private String text;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
    }
}