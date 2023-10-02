package repository.remoteRepo.responseRepo.designedit;

import java.io.Serializable;
import java.util.List;

public class DgnGetPresentPhotoResponseModel {


    private List<ProductInfoForPresentationListBean> productInfoForPresentationList;

    public List<ProductInfoForPresentationListBean> getProductInfoForPresentationList() {
        return productInfoForPresentationList;
    }

    public void setProductInfoForPresentationList(List<ProductInfoForPresentationListBean> productInfoForPresentationList) {
        this.productInfoForPresentationList = productInfoForPresentationList;
    }

    public static class ProductInfoForPresentationListBean implements Serializable {
        /**
         * id : 60457
         * styleName : Sweatshirts
         * referenceNumber : STYLE: WT22-A0036/7
         * frontImageUrl : https://d2939dhdpmjcbe.cloudfront.net/product/front_image/2023/4/1682495121317_1651204092063_N-018____F.png
         * backImageUrl : https://d2939dhdpmjcbe.cloudfront.net/product/back_image/2023/4/1682495120441_1651204092063_N-018____F.png
         * fabricImageUrl : https://d2939dhdpmjcbe.cloudfront.net/product/fabric_image/2023/4/1682495119412_1651204092063_N-018____F.png
         * keyDetailsImageUrl : https://d2939dhdpmjcbe.cloudfront.net/2023/4/1682495118795_1651204092063_N-018____F.png
         * fabric1 : 50% Acetate 50% Rayon, Diagonal Fleece, 100% Organic
         * fabric1Available : true
         * fabric2 : 50% Acetate 50% Rayon, Diagonal Fleece, 100% Organic
         * fabric2Available : true
         * weight1 : 250 GSM
         * weight2 : 250 GSM
         */

        private int id;
        private String styleName;
        private String referenceNumber;
        private String frontImageUrl;
        private String backImageUrl;
        private String fabricImageUrl;
        private String keyDetailsImageUrl;
        private String fabric1;
        private boolean fabric1Available;
        private String fabric2;
        private boolean fabric2Available;
        private String weight1;
        private String weight2;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getStyleName() {
            return styleName;
        }

        public void setStyleName(String styleName) {
            this.styleName = styleName;
        }

        public String getReferenceNumber() {
            return referenceNumber;
        }

        public void setReferenceNumber(String referenceNumber) {
            this.referenceNumber = referenceNumber;
        }

        public String getFrontImageUrl() {
            return frontImageUrl;
        }

        public void setFrontImageUrl(String frontImageUrl) {
            this.frontImageUrl = frontImageUrl;
        }

        public String getBackImageUrl() {
            return backImageUrl;
        }

        public void setBackImageUrl(String backImageUrl) {
            this.backImageUrl = backImageUrl;
        }

        public String getFabricImageUrl() {
            return fabricImageUrl;
        }

        public void setFabricImageUrl(String fabricImageUrl) {
            this.fabricImageUrl = fabricImageUrl;
        }

        public String getKeyDetailsImageUrl() {
            return keyDetailsImageUrl;
        }

        public void setKeyDetailsImageUrl(String keyDetailsImageUrl) {
            this.keyDetailsImageUrl = keyDetailsImageUrl;
        }

        public String getFabric1() {
            return fabric1;
        }

        public void setFabric1(String fabric1) {
            this.fabric1 = fabric1;
        }

        public boolean isFabric1Available() {
            return fabric1Available;
        }

        public void setFabric1Available(boolean fabric1Available) {
            this.fabric1Available = fabric1Available;
        }

        public String getFabric2() {
            return fabric2;
        }

        public void setFabric2(String fabric2) {
            this.fabric2 = fabric2;
        }

        public boolean isFabric2Available() {
            return fabric2Available;
        }

        public void setFabric2Available(boolean fabric2Available) {
            this.fabric2Available = fabric2Available;
        }

        public String getWeight1() {
            return weight1;
        }

        public void setWeight1(String weight1) {
            this.weight1 = weight1;
        }

        public String getWeight2() {
            return weight2;
        }

        public void setWeight2(String weight2) {
            this.weight2 = weight2;
        }
    }
}
