package repository.remoteRepo.responseRepo.designedit;

import java.io.Serializable;
import java.util.List;

public class DgnProDevComNewResponseModel {

    /**
     * success : true
     * message : Post added successfully
     * payload : {"id":58552,"postedBy":{"id":19003,"name":"Nitex QA Automation","email":"automation@nitex.info","designation":"System","primaryUserType":"ADMIN"},"postType":"TASK_REGULAR_POST","postDate":"2023-07-28","postTime":"05:10 AM","text":"re","productName":"SHIRT","artBoardName":"Flat sketches","postPositionNo":1,"docList":[],"commentList":[],"recipients":[{"recipientType":"BUYER"},{"recipientType":"NITEX"}],"mentionedUserIds":[],"dateAdded":"2023-07-28T05:10:35"}
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
         * id : 58552
         * postedBy : {"id":19003,"name":"Nitex QA Automation","email":"automation@nitex.info","designation":"System","primaryUserType":"ADMIN"}
         * postType : TASK_REGULAR_POST
         * postDate : 2023-07-28
         * postTime : 05:10 AM
         * text : re
         * productName : SHIRT
         * artBoardName : Flat sketches
         * postPositionNo : 1
         * docList : []
         * commentList : []
         * recipients : [{"recipientType":"BUYER"},{"recipientType":"NITEX"}]
         * mentionedUserIds : []
         * dateAdded : 2023-07-28T05:10:35
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
             * recipientType : BUYER
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
