package repository.remoteRepo.requestRepo.designedit;

import java.io.Serializable;
import java.util.List;

public class DgnPutMaterialUpdateRequestModel {


    /**
     * id : 58357
     * libraryId : 58115
     * referenceNumber : test
     * name : tets
     * materialType : test
     * compositionDetails : test
     * tagResponseList : []
     * fixedTagResponseList : []
     * colorResponseList : [{"id":72306,"code":"17-1112 TCX","hexCode":"#9b8f7f","name":"Weathered Teak","pantoneColorId":104,"colorType":"SOLID","representedBy":"test"}]
     */

    private int id;
    private int libraryId;
    private String referenceNumber;
    private String name;
    private String materialType;
    private String compositionDetails;
    private List<?> tagResponseList;
    private List<?> fixedTagResponseList;
    private List<ColorResponseListBean> colorResponseList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getCompositionDetails() {
        return compositionDetails;
    }

    public void setCompositionDetails(String compositionDetails) {
        this.compositionDetails = compositionDetails;
    }

    public List<?> getTagResponseList() {
        return tagResponseList;
    }

    public void setTagResponseList(List<?> tagResponseList) {
        this.tagResponseList = tagResponseList;
    }

    public List<?> getFixedTagResponseList() {
        return fixedTagResponseList;
    }

    public void setFixedTagResponseList(List<?> fixedTagResponseList) {
        this.fixedTagResponseList = fixedTagResponseList;
    }

    public List<ColorResponseListBean> getColorResponseList() {
        return colorResponseList;
    }

    public void setColorResponseList(List<ColorResponseListBean> colorResponseList) {
        this.colorResponseList = colorResponseList;
    }

    public static class ColorResponseListBean implements Serializable {
        /**
         * id : 72306
         * code : 17-1112 TCX
         * hexCode : #9b8f7f
         * name : Weathered Teak
         * pantoneColorId : 104
         * colorType : SOLID
         * representedBy : test
         */

        private int id;
        private String code;
        private String hexCode;
        private String name;
        private int pantoneColorId;
        private String colorType;
        private String representedBy;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getHexCode() {
            return hexCode;
        }

        public void setHexCode(String hexCode) {
            this.hexCode = hexCode;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPantoneColorId() {
            return pantoneColorId;
        }

        public void setPantoneColorId(int pantoneColorId) {
            this.pantoneColorId = pantoneColorId;
        }

        public String getColorType() {
            return colorType;
        }

        public void setColorType(String colorType) {
            this.colorType = colorType;
        }

        public String getRepresentedBy() {
            return representedBy;
        }

        public void setRepresentedBy(String representedBy) {
            this.representedBy = representedBy;
        }
    }
}
