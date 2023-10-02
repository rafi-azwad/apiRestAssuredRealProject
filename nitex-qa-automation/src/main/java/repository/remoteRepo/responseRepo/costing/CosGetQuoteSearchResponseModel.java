package repository.remoteRepo.responseRepo.costing;

import java.io.Serializable;
import java.util.List;

public class CosGetQuoteSearchResponseModel {


    /**
     * totalPages : 15
     * totalElements : 299
     * currentPage : 0
     * data : [{"id":39904,"name":"test","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":39903,"name":"winter 22","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":39206,"name":"Winter Formal Meetup","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":38755,"name":"Winter Collection - TNR","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":38752,"name":"Rashed Barat","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":38703,"name":"T-Summer Collection","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":38652,"name":"Big star 23 ","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":38303,"name":"New Rakibs dream","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":37952,"name":"Sports wear","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":37002,"name":"River Island Summer 23","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36602,"name":"new collec1","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36206,"name":"New 23","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36203,"name":"Techpack 2023","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36152,"name":"URVINA Collection","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36102,"name":"Test collection","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34407,"name":"Collection to check 101","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34158,"name":"tutu","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34156,"name":"Test","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34007,"name":"ARIFSUMMER23","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34004,"name":"ARIF-SUMMER23","isNew":false,"isPinned":false,"hasUnseenMention":false}]
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
         * id : 39904
         * name : test
         * isNew : false
         * isPinned : false
         * hasUnseenMention : false
         */

        private int id;
        private String name;
        private boolean isNew;
        private boolean isPinned;
        private boolean hasUnseenMention;

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
    }
}
