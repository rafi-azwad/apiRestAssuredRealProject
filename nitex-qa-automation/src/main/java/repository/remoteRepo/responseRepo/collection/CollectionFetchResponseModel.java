package repository.remoteRepo.responseRepo.collection;

import java.io.Serializable;
import java.util.List;

public class CollectionFetchResponseModel {

    /**
     * id : 38753
     * name : Sample collection for QA
     * ownerId : 1
     * brandId : 1
     * brand : Nitex
     * season : WINTER_23
     * isNitexCollection : true
     * collectionViewType : PRODUCT_LIST
     * userResponseList : [{"id":1,"name":"Hussain Mahdi","designation":"Co-founder & Chairman","email":"mahdi@nitex.info","profilePicDocument":{"id":156884,"docType":"PROFILE_PHOTO","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2023/4/1682500032460_unnamed.jpg","name":"unnamed.jpg","isGeneratedFromPDF":false,"dateAdded":"2023-04-26"},"nickName":"Mahdi","primaryUserType":"ADMIN","allUserTypes":["ADMIN"]}]
     * tagResponseList : [{"id":10504,"text":"Winter"}]
     * noOfProduct : 0
     * noOfSoldProduct : 0
     * noOfCompleteProduct : 0
     * status : TECHPACK
     * lastDesignUpdatedAt : 2023-05-07T06:29:57
     * moodBoardId : 16103
     * isCompleted : false
     * noOfUnreadMessage : 0
     * owner : {"id":1,"name":"Hussain Mahdi","nickName":"Mahdi","email":"mahdi@nitex.info","designation":"Co-founder & Chairman","primaryUserType":"ADMIN"}
     */

    private int id;
    private String name;
    private int ownerId;
    private int brandId;
    private String brand;
    private String season;
    private boolean isNitexCollection;
    private String collectionViewType;
    private int noOfProduct;
    private int noOfSoldProduct;
    private int noOfCompleteProduct;
    private String status;
    private String lastDesignUpdatedAt;
    private int moodBoardId;
    private boolean isCompleted;
    private int noOfUnreadMessage;
    private OwnerBean owner;
    private List<UserResponseListBean> userResponseList;
    private List<TagResponseListBean> tagResponseList;

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

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
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

    public int getNoOfProduct() {
        return noOfProduct;
    }

    public void setNoOfProduct(int noOfProduct) {
        this.noOfProduct = noOfProduct;
    }

    public int getNoOfSoldProduct() {
        return noOfSoldProduct;
    }

    public void setNoOfSoldProduct(int noOfSoldProduct) {
        this.noOfSoldProduct = noOfSoldProduct;
    }

    public int getNoOfCompleteProduct() {
        return noOfCompleteProduct;
    }

    public void setNoOfCompleteProduct(int noOfCompleteProduct) {
        this.noOfCompleteProduct = noOfCompleteProduct;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastDesignUpdatedAt() {
        return lastDesignUpdatedAt;
    }

    public void setLastDesignUpdatedAt(String lastDesignUpdatedAt) {
        this.lastDesignUpdatedAt = lastDesignUpdatedAt;
    }

    public int getMoodBoardId() {
        return moodBoardId;
    }

    public void setMoodBoardId(int moodBoardId) {
        this.moodBoardId = moodBoardId;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public int getNoOfUnreadMessage() {
        return noOfUnreadMessage;
    }

    public void setNoOfUnreadMessage(int noOfUnreadMessage) {
        this.noOfUnreadMessage = noOfUnreadMessage;
    }

    public OwnerBean getOwner() {
        return owner;
    }

    public void setOwner(OwnerBean owner) {
        this.owner = owner;
    }

    public List<UserResponseListBean> getUserResponseList() {
        return userResponseList;
    }

    public void setUserResponseList(List<UserResponseListBean> userResponseList) {
        this.userResponseList = userResponseList;
    }

    public List<TagResponseListBean> getTagResponseList() {
        return tagResponseList;
    }

    public void setTagResponseList(List<TagResponseListBean> tagResponseList) {
        this.tagResponseList = tagResponseList;
    }

    public static class OwnerBean implements Serializable {
        /**
         * id : 1
         * name : Hussain Mahdi
         * nickName : Mahdi
         * email : mahdi@nitex.info
         * designation : Co-founder & Chairman
         * primaryUserType : ADMIN
         */

        private int id;
        private String name;
        private String nickName;
        private String email;
        private String designation;
        private String primaryUserType;

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

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public String getPrimaryUserType() {
            return primaryUserType;
        }

        public void setPrimaryUserType(String primaryUserType) {
            this.primaryUserType = primaryUserType;
        }
    }

    public static class UserResponseListBean implements Serializable {
        /**
         * id : 1
         * name : Hussain Mahdi
         * designation : Co-founder & Chairman
         * email : mahdi@nitex.info
         * profilePicDocument : {"id":156884,"docType":"PROFILE_PHOTO","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2023/4/1682500032460_unnamed.jpg","name":"unnamed.jpg","isGeneratedFromPDF":false,"dateAdded":"2023-04-26"}
         * nickName : Mahdi
         * primaryUserType : ADMIN
         * allUserTypes : ["ADMIN"]
         */

        private int id;
        private String name;
        private String designation;
        private String email;
        private ProfilePicDocumentBean profilePicDocument;
        private String nickName;
        private String primaryUserType;
        private List<String> allUserTypes;

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

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public ProfilePicDocumentBean getProfilePicDocument() {
            return profilePicDocument;
        }

        public void setProfilePicDocument(ProfilePicDocumentBean profilePicDocument) {
            this.profilePicDocument = profilePicDocument;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getPrimaryUserType() {
            return primaryUserType;
        }

        public void setPrimaryUserType(String primaryUserType) {
            this.primaryUserType = primaryUserType;
        }

        public List<String> getAllUserTypes() {
            return allUserTypes;
        }

        public void setAllUserTypes(List<String> allUserTypes) {
            this.allUserTypes = allUserTypes;
        }

        public static class ProfilePicDocumentBean implements Serializable {
            /**
             * id : 156884
             * docType : PROFILE_PHOTO
             * docUrl : https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2023/4/1682500032460_unnamed.jpg
             * name : unnamed.jpg
             * isGeneratedFromPDF : false
             * dateAdded : 2023-04-26
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

    public static class TagResponseListBean implements Serializable {
        /**
         * id : 10504
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