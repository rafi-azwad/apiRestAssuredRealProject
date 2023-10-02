package repository.remoteRepo.requestRepo.designedit;

import java.io.Serializable;
import java.util.List;

public class DgnProDevComNewRequestModel {


    /**
     * text : re
     * artBoardId : 30516
     * postPositionNo : 1
     * productId : 61280
     * postType : test
     * recipientList : [{"recipientType":"NITEX"},{"recipientType":"BUYER"}]
     */

    private String text;
    private int artBoardId;
    private int postPositionNo;
    private String productId;
    private String postType;
    private List<RecipientListBean> recipientList;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getArtBoardId() {
        return artBoardId;
    }

    public void setArtBoardId(int artBoardId) {
        this.artBoardId = artBoardId;
    }

    public int getPostPositionNo() {
        return postPositionNo;
    }

    public void setPostPositionNo(int postPositionNo) {
        this.postPositionNo = postPositionNo;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public List<RecipientListBean> getRecipientList() {
        return recipientList;
    }

    public void setRecipientList(List<RecipientListBean> recipientList) {
        this.recipientList = recipientList;
    }

    public static class RecipientListBean implements Serializable {
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
