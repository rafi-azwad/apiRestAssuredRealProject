package repository.remoteRepo.responseRepo.collection;

import java.io.Serializable;
import java.util.List;

public class CollectionGetAllBrandResponseModel {


    /**
     * totalPages : 7
     * totalElements : 127
     * currentPage : 0
     * data : [{"id":302,"name":"Tally Weijl","noOfChild":0,"status":"PENDING"},{"id":3804,"name":"ENRAGÉ","noOfChild":0,"status":"ON_BOARDING"},{"id":3352,"name":"SONAE","noOfChild":0,"status":"ACTIVE"},{"id":3602,"name":"PEACOCK","noOfChild":0,"status":"ACTIVE"},{"id":1803,"name":"La Redoute","noOfChild":0,"status":"ACTIVE"},{"id":1804,"name":"Daniel Hechter","noOfChild":0,"status":"ACTIVE"},{"id":5852,"name":"Zara","noOfChild":0,"status":"PIPELINE"},{"id":203,"name":"Ted Baker","noOfChild":0,"status":"ACTIVE"},{"id":3102,"name":"Brand BQ","noOfChild":0,"status":"ACTIVE"},{"id":3202,"name":"SCALPERS","noOfChild":0,"status":"PENDING"},{"id":8902,"name":"Test Brand","type":"Elegant fashion","status":"PIPELINE"},{"id":8903,"name":"Jackets","type":"Elegant fashion","status":"ON_BOARDING"},{"id":3203,"name":"Adore Me","noOfChild":0,"status":"PIPELINE"},{"id":3204,"name":"STRADIVARIUS","noOfChild":0,"status":"PIPELINE"},{"id":3205,"name":"Eseoese","noOfChild":0,"status":"PIPELINE"},{"id":3552,"name":"Quiz","noOfChild":0,"status":"PIPELINE"},{"id":3206,"name":"Walmart","noOfChild":0,"status":"PIPELINE"},{"id":3208,"name":"Etos","noOfChild":0,"status":"PIPELINE"},{"id":3306,"name":"CROPP","noOfChild":0,"status":"PIPELINE"},{"id":3307,"name":"Disney","noOfChild":0,"status":"PIPELINE"}]
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
         * id : 302
         * name : Tally Weijl
         * noOfChild : 0
         * status : PENDING
         * type : Elegant fashion
         */

        private int id;
        private String name;
        private int noOfChild;
        private String status;
        private String type;

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

        public int getNoOfChild() {
            return noOfChild;
        }

        public void setNoOfChild(int noOfChild) {
            this.noOfChild = noOfChild;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
