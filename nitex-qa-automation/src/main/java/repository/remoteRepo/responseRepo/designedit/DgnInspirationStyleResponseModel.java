package repository.remoteRepo.responseRepo.designedit;

import java.io.Serializable;
import java.util.List;

public class DgnInspirationStyleResponseModel {


    /**
     * productDesignDocResponse : {"id":168721,"docType":"PRODUCT_DESIGN","docUrl":"https://d2939dhdpmjcbe.cloudfront.net/product/design/2023/7/1690694158134_1677241112527_BT22-A2467_--F.png","name":"1677241112527_BT22-A2467_--F.png","isGeneratedFromPDF":false,"dateAdded":"2023-07-30"}
     * otherDocResponseList : []
     */

    private ProductDesignDocResponseBean productDesignDocResponse;
    private List<?> otherDocResponseList;

    public ProductDesignDocResponseBean getProductDesignDocResponse() {
        return productDesignDocResponse;
    }

    public void setProductDesignDocResponse(ProductDesignDocResponseBean productDesignDocResponse) {
        this.productDesignDocResponse = productDesignDocResponse;
    }

    public List<?> getOtherDocResponseList() {
        return otherDocResponseList;
    }

    public void setOtherDocResponseList(List<?> otherDocResponseList) {
        this.otherDocResponseList = otherDocResponseList;
    }

    public static class ProductDesignDocResponseBean implements Serializable {
        /**
         * id : 168721
         * docType : PRODUCT_DESIGN
         * docUrl : https://d2939dhdpmjcbe.cloudfront.net/product/design/2023/7/1690694158134_1677241112527_BT22-A2467_--F.png
         * name : 1677241112527_BT22-A2467_--F.png
         * isGeneratedFromPDF : false
         * dateAdded : 2023-07-30
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
