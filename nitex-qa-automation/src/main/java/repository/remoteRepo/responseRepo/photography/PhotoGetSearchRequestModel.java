package repository.remoteRepo.responseRepo.photography;

import java.io.Serializable;
import java.util.List;

public class PhotoGetSearchRequestModel {


    /**
     * totalPages : 4
     * totalElements : 71
     * currentPage : 0
     * data : [{"id":41854,"name":"Women Long Dress Autumn","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":41352,"name":"Test Rashed Dev","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":40657,"name":"Craft Club","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":40653,"name":"Tie Dye","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":40602,"name":"New Graphics","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":39457,"name":"Test Collection V2","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":39167,"name":"Popy 25th apr style","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":38903,"name":"Farabi collection","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":38752,"name":"Rashed Barat","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":38602,"name":"Summer 23/24","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":38502,"name":"Summer collection","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":38352,"name":"Presentation check","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":38302,"name":"Boys casual ","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":38252,"name":"Epic 2024","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36702,"name":"Shacket collection","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36302,"name":"Weeding collection","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36252,"name":"summer collection","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36153,"name":"Collection January","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34552,"name":"ssssssss","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34458,"name":"drive","isNew":false,"isPinned":false,"hasUnseenMention":false}]
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
         * id : 41854
         * name : Women Long Dress Autumn
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
