package repository.remoteRepo.requestRepo.collection;

import java.io.Serializable;
import java.util.List;

public class CollectionPostSampleReqRequestModel {

    /**
     * developmentSample : false
     * addSampleRequestList : [{"productId":42460,"requiredDate":"2023-05-16","operationalUnitId":1}]
     */

    private boolean developmentSample;
    private List<AddSampleRequestListBean> addSampleRequestList;

    public boolean isDevelopmentSample() {
        return developmentSample;
    }

    public void setDevelopmentSample(boolean developmentSample) {
        this.developmentSample = developmentSample;
    }

    public List<AddSampleRequestListBean> getAddSampleRequestList() {
        return addSampleRequestList;
    }

    public void setAddSampleRequestList(List<AddSampleRequestListBean> addSampleRequestList) {
        this.addSampleRequestList = addSampleRequestList;
    }

    public static class AddSampleRequestListBean implements Serializable {
        /**
         * productId : 42460
         * requiredDate : 2023-05-16
         * operationalUnitId : 1
         */

        private int productId;
        private String requiredDate;
        private int operationalUnitId;

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public String getRequiredDate() {
            return requiredDate;
        }

        public void setRequiredDate(String requiredDate) {
            this.requiredDate = requiredDate;
        }

        public int getOperationalUnitId() {
            return operationalUnitId;
        }

        public void setOperationalUnitId(int operationalUnitId) {
            this.operationalUnitId = operationalUnitId;
        }
    }
}
