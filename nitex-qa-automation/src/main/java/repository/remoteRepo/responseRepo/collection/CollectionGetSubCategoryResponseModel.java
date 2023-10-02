package repository.remoteRepo.responseRepo.collection;

import java.io.Serializable;
import java.util.List;

public class CollectionGetSubCategoryResponseModel {


    /**
     * id : 6
     * name : JACKET
     * subCategoryResponseList : [{"id":24,"name":"JACKET","isPrimary":true},{"id":143,"name":"VARSITY JACKET","isPrimary":false},{"id":144,"name":"SLEVELESS JACKET","isPrimary":false},{"id":256,"name":"SINGLE BREASTED BLAZER","isPrimary":false},{"id":40,"name":"DOWN JACKET","isPrimary":false},{"id":39,"name":"HOODIE/ZIP-UP JACKET","isPrimary":false},{"id":38,"name":"WINDBREACKER JACKET","isPrimary":false},{"id":27,"name":"SAFARI JACKET","isPrimary":false},{"id":46,"name":"SHERPA-LINED JACKET","isPrimary":false},{"id":36,"name":"LUMBER JACKET","isPrimary":false},{"id":28,"name":"BIKER JACKET","isPrimary":false},{"id":255,"name":"SHAWL COLLAR BLAZER","isPrimary":false},{"id":258,"name":"BOYFRIEND BLAZER","isPrimary":false},{"id":266,"name":"TEDDY JACKET","isPrimary":false},{"id":37,"name":"VARSITYJACKET","isPrimary":false},{"id":45,"name":"STORMRIDER JACKET","isPrimary":false},{"id":43,"name":"OVERSIZED JACKET","isPrimary":false},{"id":44,"name":"STANDARD JACKET","isPrimary":false},{"id":35,"name":"TRUCKER JACKET","isPrimary":false},{"id":257,"name":"DOUBLE BREASTED BLAZER","isPrimary":false},{"id":31,"name":"PARKA JACKET","isPrimary":false},{"id":32,"name":"BOMBER JACKET","isPrimary":false},{"id":142,"name":"DENIM JACKET","isPrimary":false},{"id":42,"name":"WESTERN JACKET","isPrimary":false},{"id":30,"name":"M-65 FIELD JACKET","isPrimary":false},{"id":25,"name":"TAILORED JACKET","isPrimary":false},{"id":141,"name":"HOODIE JACKET","isPrimary":false},{"id":26,"name":"BLAZER","isPrimary":false},{"id":259,"name":"DAD BLAZER","isPrimary":false},{"id":33,"name":"SHACKET ","isPrimary":false},{"id":34,"name":"HARRINGTON JACKET","isPrimary":false},{"id":268,"name":"OVERSIZED TRUCKER","isPrimary":false},{"id":29,"name":"FLIGHT JACKET","isPrimary":false},{"id":140,"name":"NERHU JACKET","isPrimary":false},{"id":41,"name":"BLOUSON JACKET","isPrimary":false}]
     */

    private int id;
    private String name;
    private List<SubCategoryResponseListBean> subCategoryResponseList;

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

    public List<SubCategoryResponseListBean> getSubCategoryResponseList() {
        return subCategoryResponseList;
    }

    public void setSubCategoryResponseList(List<SubCategoryResponseListBean> subCategoryResponseList) {
        this.subCategoryResponseList = subCategoryResponseList;
    }

    public static class SubCategoryResponseListBean implements Serializable {
        /**
         * id : 24
         * name : JACKET
         * isPrimary : true
         */

        private int id;
        private String name;
        private boolean isPrimary;

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

        public boolean isIsPrimary() {
            return isPrimary;
        }

        public void setIsPrimary(boolean isPrimary) {
            this.isPrimary = isPrimary;
        }
    }
}
