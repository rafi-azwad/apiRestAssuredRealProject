package repository.remoteRepo.requestRepo.designedit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesignFabricAddRequestModel {


    /**
     * materialType : MAIN_FABRIC
     * productId : 61280
     * fabricType : DENIM
     * gsm : 200
     * construction : 407
     * fabricCompositionPartIdList : [3804,3798]
     * deleteExistingId : 58356
     */

    private String materialType;
    private int productId;
    private String fabricType;
    private String gsm;
    private int construction;
    private int deleteExistingId;
/*    private List<String> fabricCompositionPartIdList;*/

    private List<String> fabricCompositionPartIdList;

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public int getConstruction() {
        return construction;
    }

    public void setConstruction(int construction) {
        this.construction = construction;
    }

    public int getDeleteExistingId() {
        return deleteExistingId;
    }

    public void setDeleteExistingId(int deleteExistingId) {
        this.deleteExistingId = deleteExistingId;
    }

/*    public List<String> getFabricCompositionPartIdList() {
        return fabricCompositionPartIdList;
    }

    public void setFabricCompositionPartIdList(List<String> fabricCompositionPartIdList) {
        this.fabricCompositionPartIdList = fabricCompositionPartIdList;
    }*/


    public void setFabricCompositionPartIdList(String fabricCompositionPartIdStringList) {

            String[] stringsList = fabricCompositionPartIdStringList.split(",");
            this.fabricCompositionPartIdList = Arrays.asList(stringsList);

}
    public List<String> getFabricCompositionPartIdList() {
        return fabricCompositionPartIdList;
    }


}

