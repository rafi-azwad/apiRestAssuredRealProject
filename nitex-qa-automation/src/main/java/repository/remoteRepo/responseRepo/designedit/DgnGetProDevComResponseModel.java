package repository.remoteRepo.responseRepo.designedit;

import java.io.Serializable;
import java.util.List;

public class DgnGetProDevComResponseModel {


    /**
     * totalPages : 1
     * totalElements : 5
     * currentPage : 0
     * data : [{"id":58507,"postedBy":{"id":19003,"name":"Nitex QA Automation","email":"automation@nitex.info","designation":"System","primaryUserType":"ADMIN"},"postType":"PRODUCT_DEVELOPMENT_COMMENT","postDate":"2023-07-28","postTime":"05:01 AM","text":"re","productName":"SHIRT","artBoardName":"Flat sketches","postPositionNo":1,"docList":[],"commentList":[],"recipients":[{"recipientType":"NITEX"},{"recipientType":"BUYER"}],"mentionedUserIds":[],"dateAdded":"2023-07-28T05:01:37","isSeen":true},{"id":58506,"postedBy":{"id":19003,"name":"Nitex QA Automation","email":"automation@nitex.info","designation":"System","primaryUserType":"ADMIN"},"postType":"PRODUCT_DEVELOPMENT_COMMENT","postDate":"2023-07-28","postTime":"05:01 AM","text":"re","productName":"SHIRT","artBoardName":"Flat sketches","postPositionNo":1,"docList":[],"commentList":[],"recipients":[{"recipientType":"NITEX"},{"recipientType":"BUYER"}],"mentionedUserIds":[],"dateAdded":"2023-07-28T05:01:11","isSeen":true},{"id":58505,"postedBy":{"id":19003,"name":"Nitex QA Automation","email":"automation@nitex.info","designation":"System","primaryUserType":"ADMIN"},"postType":"PRODUCT_DEVELOPMENT_COMMENT","postDate":"2023-07-28","postTime":"05:00 AM","text":"re","productName":"SHIRT","artBoardName":"Flat sketches","postPositionNo":1,"docList":[],"commentList":[],"recipients":[{"recipientType":"NITEX"},{"recipientType":"BUYER"}],"mentionedUserIds":[],"dateAdded":"2023-07-28T05:00:23","isSeen":true},{"id":58504,"postedBy":{"id":19003,"name":"Nitex QA Automation","email":"automation@nitex.info","designation":"System","primaryUserType":"ADMIN"},"postType":"PRODUCT_DEVELOPMENT_COMMENT","postDate":"2023-07-28","postTime":"05:00 AM","text":"re","productName":"SHIRT","artBoardName":"Flat sketches","postPositionNo":1,"docList":[],"commentList":[],"recipients":[{"recipientType":"BUYER"},{"recipientType":"NITEX"}],"mentionedUserIds":[],"dateAdded":"2023-07-28T05:00:00","isSeen":true},{"id":57702,"postedBy":{"id":6352,"name":"Adnan Hossain","email":"adnan1@gmail.com","designation":"Fashion Designer","primaryUserType":"FASHION_DESIGNER","imageUrl":"https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2021/9/1632719984433_Where-abouts-of-Adnan-Syed.jpg"},"postType":"PRODUCT_DEVELOPMENT_COMMENT","postDate":"2023-05-15","postTime":"08:08 AM","text":"re","productName":"SHIRT","artBoardName":"Flat sketches","postPositionNo":1,"docList":[],"commentList":[{"id":57703,"postedBy":{"id":6352,"name":"Adnan Hossain","email":"adnan1@gmail.com","designation":"Fashion Designer","primaryUserType":"FASHION_DESIGNER","imageUrl":"https://d2939dhdpmjcbe.cloudfront.net/profile_pic/2021/9/1632719984433_Where-abouts-of-Adnan-Syed.jpg"},"postType":"COMMENT","postDate":"2023-05-15","postTime":"08:10 AM","text":"ggg","productName":"SHIRT","artBoardName":"Flat sketches","postPositionNo":1,"parentPostId":57702,"docList":[],"commentList":[],"recipients":[],"mentionedUserIds":[],"dateAdded":"2023-05-15T08:10:08","isSeen":true}],"recipients":[{"recipientType":"BUYER"},{"recipientType":"NITEX"}],"mentionedUserIds":[],"dateAdded":"2023-05-15T08:08:06","isSeen":true}]
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
         * id : 58507
         * postedBy : {"id":19003,"name":"Nitex QA Automation","email":"automation@nitex.info","designation":"System","primaryUserType":"ADMIN"}
         * postType : PRODUCT_DEVELOPMENT_COMMENT
         * postDate : 2023-07-28
         * postTime : 05:01 AM
         * text : re
         * productName : SHIRT
         * artBoardName : Flat sketches
         * postPositionNo : 1
         * docList : []
         * commentList : []
         * recipients : [{"recipientType":"NITEX"},{"recipientType":"BUYER"}]
         * mentionedUserIds : []
         * dateAdded : 2023-07-28T05:01:37
         * isSeen : true
         */

        private int id;
        private PostedByBean postedBy;
        private String postType;
        private String postDate;
        private String postTime;
        private String text;
        private String productName;
        private String artBoardName;
        private int postPositionNo;
        private String dateAdded;
        private boolean isSeen;
        private List<?> docList;
        private List<?> commentList;
        private List<RecipientsBean> recipients;
        private List<?> mentionedUserIds;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public PostedByBean getPostedBy() {
            return postedBy;
        }

        public void setPostedBy(PostedByBean postedBy) {
            this.postedBy = postedBy;
        }

        public String getPostType() {
            return postType;
        }

        public void setPostType(String postType) {
            this.postType = postType;
        }

        public String getPostDate() {
            return postDate;
        }

        public void setPostDate(String postDate) {
            this.postDate = postDate;
        }

        public String getPostTime() {
            return postTime;
        }

        public void setPostTime(String postTime) {
            this.postTime = postTime;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getArtBoardName() {
            return artBoardName;
        }

        public void setArtBoardName(String artBoardName) {
            this.artBoardName = artBoardName;
        }

        public int getPostPositionNo() {
            return postPositionNo;
        }

        public void setPostPositionNo(int postPositionNo) {
            this.postPositionNo = postPositionNo;
        }

        public String getDateAdded() {
            return dateAdded;
        }

        public void setDateAdded(String dateAdded) {
            this.dateAdded = dateAdded;
        }

        public boolean isIsSeen() {
            return isSeen;
        }

        public void setIsSeen(boolean isSeen) {
            this.isSeen = isSeen;
        }

        public List<?> getDocList() {
            return docList;
        }

        public void setDocList(List<?> docList) {
            this.docList = docList;
        }

        public List<?> getCommentList() {
            return commentList;
        }

        public void setCommentList(List<?> commentList) {
            this.commentList = commentList;
        }

        public List<RecipientsBean> getRecipients() {
            return recipients;
        }

        public void setRecipients(List<RecipientsBean> recipients) {
            this.recipients = recipients;
        }

        public List<?> getMentionedUserIds() {
            return mentionedUserIds;
        }

        public void setMentionedUserIds(List<?> mentionedUserIds) {
            this.mentionedUserIds = mentionedUserIds;
        }

        public static class PostedByBean implements Serializable {
            /**
             * id : 19003
             * name : Nitex QA Automation
             * email : automation@nitex.info
             * designation : System
             * primaryUserType : ADMIN
             */

            private int id;
            private String name;
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

        public static class RecipientsBean implements Serializable {
            /**
             * recipientType : NITEX
             */

            private String recipientType;

            public String getRecipientType() {
                return recipientType;
            }

            public void setRecipientType(String recipientType) {
                this.recipientType = recipientType;
            }
        }
    }
}
