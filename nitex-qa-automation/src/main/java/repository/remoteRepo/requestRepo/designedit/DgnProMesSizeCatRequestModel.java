package repository.remoteRepo.requestRepo.designedit;

import java.io.Serializable;
import java.util.List;

public class DgnProMesSizeCatRequestModel {


    /**
     * name : test
     * sizeMappingList : [{"standardSize":"XXXS","standardSizeLabel":"3XS","mappingSize":"4XS"}]
     * productId : 61280
     */

    private String name;
    private String productId;
    private List<SizeMappingListBean> sizeMappingList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public List<SizeMappingListBean> getSizeMappingList() {
        return sizeMappingList;
    }

    public void setSizeMappingList(List<SizeMappingListBean> sizeMappingList) {
        this.sizeMappingList = sizeMappingList;
    }

    public static class SizeMappingListBean implements Serializable {
        /**
         * standardSize : XXXS
         * standardSizeLabel : 3XS
         * mappingSize : 4XS
         */

        private String standardSize;
        private String standardSizeLabel;
        private String mappingSize;

        public String getStandardSize() {
            return standardSize;
        }

        public void setStandardSize(String standardSize) {
            this.standardSize = standardSize;
        }

        public String getStandardSizeLabel() {
            return standardSizeLabel;
        }

        public void setStandardSizeLabel(String standardSizeLabel) {
            this.standardSizeLabel = standardSizeLabel;
        }

        public String getMappingSize() {
            return mappingSize;
        }

        public void setMappingSize(String mappingSize) {
            this.mappingSize = mappingSize;
        }
    }
}
