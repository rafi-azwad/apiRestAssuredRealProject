package repository.remoteRepo.responseRepo.designedit;

import java.io.Serializable;
import java.util.List;

public class DgnGetProMeasureUnitResponseModel {


    /**
     * sizeList : [{"code":"S","order":3,"value":"S"},{"code":"M","order":4,"value":"M"},{"code":"L","order":5,"value":"L"},{"code":"XL","order":6,"value":"XL"},{"code":"TWO_XL","order":7,"value":"2XL"},{"code":"THREE_XL","order":8,"value":"3XL"},{"code":"FOUR_XL","order":9,"value":"4XL"}]
     * data : [{"pomResponse":{"id":12905,"name":"Chest","categoryResponse":{"id":1,"name":"TOP BODY"}},"minUnitId":4429003,"grading":3,"ordering":0,"sizeValueList":[15,18,21,24,27,30,33]},{"pomResponse":{"id":12906,"name":"Length","categoryResponse":{"id":2,"name":"COLLAR"}},"minUnitId":4429004,"grading":2,"ordering":1,"sizeValueList":[18,20,22,24,26,28,30]},{"pomResponse":{"id":12908,"name":"Zipper","docPath":"https://d2939dhdpmjcbe.cloudfront.net/product/accessories_design/2023/5/1684142339134_string","categoryResponse":{"id":1,"name":"TOP BODY"}},"minUnitId":4429009,"grading":1,"ordering":2,"sizeValueList":[21,22,23,24,25,26,27]},{"pomResponse":{"id":12909,"name":"TDS","categoryResponse":{"id":1,"name":"TOP BODY"}},"minUnitId":4429013,"grading":0,"ordering":3,"sizeValueList":[24,24,24,24,24,24,24]},{"pomResponse":{"id":12910,"name":"ARK","categoryResponse":{"id":2,"name":"COLLAR"}},"minUnitId":4429014,"grading":1,"ordering":4,"sizeValueList":[23,24,25,26,27,28,29]},{"pomResponse":{"id":12911,"name":"Test","categoryResponse":{"id":1,"name":"TOP BODY"}},"minUnitId":4429015,"grading":2,"ordering":5,"sizeValueList":[22,24,26,28,30,32,34]}]
     * extraFlag : {"isArtBoardCreated":true,"isMeasurementCompleted":false,"isSupplierDeveloped":false,"photographyUpdated":["FRONT_IMAGE"]}
     */

    private ExtraFlagBean extraFlag;
    private List<SizeListBean> sizeList;
    private List<DataBean> data;

    public ExtraFlagBean getExtraFlag() {
        return extraFlag;
    }

    public void setExtraFlag(ExtraFlagBean extraFlag) {
        this.extraFlag = extraFlag;
    }

    public List<SizeListBean> getSizeList() {
        return sizeList;
    }

    public void setSizeList(List<SizeListBean> sizeList) {
        this.sizeList = sizeList;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class ExtraFlagBean implements Serializable {
        /**
         * isArtBoardCreated : true
         * isMeasurementCompleted : false
         * isSupplierDeveloped : false
         * photographyUpdated : ["FRONT_IMAGE"]
         */

        private boolean isArtBoardCreated;
        private boolean isMeasurementCompleted;
        private boolean isSupplierDeveloped;
        private List<String> photographyUpdated;

        public boolean isIsArtBoardCreated() {
            return isArtBoardCreated;
        }

        public void setIsArtBoardCreated(boolean isArtBoardCreated) {
            this.isArtBoardCreated = isArtBoardCreated;
        }

        public boolean isIsMeasurementCompleted() {
            return isMeasurementCompleted;
        }

        public void setIsMeasurementCompleted(boolean isMeasurementCompleted) {
            this.isMeasurementCompleted = isMeasurementCompleted;
        }

        public boolean isIsSupplierDeveloped() {
            return isSupplierDeveloped;
        }

        public void setIsSupplierDeveloped(boolean isSupplierDeveloped) {
            this.isSupplierDeveloped = isSupplierDeveloped;
        }

        public List<String> getPhotographyUpdated() {
            return photographyUpdated;
        }

        public void setPhotographyUpdated(List<String> photographyUpdated) {
            this.photographyUpdated = photographyUpdated;
        }
    }

    public static class SizeListBean implements Serializable {
        /**
         * code : S
         * order : 3
         * value : S
         */

        private String code;
        private int order;
        private String value;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class DataBean implements Serializable {
        /**
         * pomResponse : {"id":12905,"name":"Chest","categoryResponse":{"id":1,"name":"TOP BODY"}}
         * minUnitId : 4429003
         * grading : 3.0
         * ordering : 0
         * sizeValueList : [15,18,21,24,27,30,33]
         */

        private PomResponseBean pomResponse;
        private int minUnitId;
        private double grading;
        private int ordering;
        private List<Double> sizeValueList;

        public PomResponseBean getPomResponse() {
            return pomResponse;
        }

        public void setPomResponse(PomResponseBean pomResponse) {
            this.pomResponse = pomResponse;
        }

        public int getMinUnitId() {
            return minUnitId;
        }

        public void setMinUnitId(int minUnitId) {
            this.minUnitId = minUnitId;
        }

        public double getGrading() {
            return grading;
        }

        public void setGrading(double grading) {
            this.grading = grading;
        }

        public int getOrdering() {
            return ordering;
        }

        public void setOrdering(int ordering) {
            this.ordering = ordering;
        }

        public List<Double> getSizeValueList() {
            return sizeValueList;
        }

        public void setSizeValueList(List<Double> sizeValueList) {
            this.sizeValueList = sizeValueList;
        }

        public static class PomResponseBean implements Serializable {
            /**
             * id : 12905
             * name : Chest
             * categoryResponse : {"id":1,"name":"TOP BODY"}
             */

            private int id;
            private String name;
            private CategoryResponseBean categoryResponse;

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

            public CategoryResponseBean getCategoryResponse() {
                return categoryResponse;
            }

            public void setCategoryResponse(CategoryResponseBean categoryResponse) {
                this.categoryResponse = categoryResponse;
            }

            public static class CategoryResponseBean implements Serializable {
                /**
                 * id : 1
                 * name : TOP BODY
                 */

                private int id;
                private String name;

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
            }
        }
    }
}
