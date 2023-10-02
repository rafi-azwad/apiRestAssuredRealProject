package repository.remoteRepo.responseRepo.collection;

import java.io.Serializable;
import java.util.List;

public class CollectionMyResponseModel {


    /**
     * totalPages : 120
     * totalElements : 2389
     * currentPage : 0
     * data : [{"id":36052,"name":"Collection for shawon","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36152,"name":"URVINA Collection","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34602,"name":"Morning Star","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34552,"name":"ssssssss","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34458,"name":"drive","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34157,"name":"hyt","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34156,"name":"Test","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34155,"name":"Test Disabled","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34154,"name":"Test","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36153,"name":"Collection January","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34152,"name":"tyu","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":4,"name":"Test 4","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":34158,"name":"tutu","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36202,"name":"new 2023","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36203,"name":"Techpack 2023","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":5,"name":"Test 5","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":36302,"name":"Weeding collection","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":33502,"name":"Winter casual","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":33303,"name":"Simons Winter 2022","isNew":false,"isPinned":false,"hasUnseenMention":false},{"id":32953,"name":"adnan has a collection","isNew":false,"isPinned":false,"hasUnseenMention":false}]
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
         * id : 36052
         * name : Collection for shawon
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
