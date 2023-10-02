package repository.remoteRepo.requestRepo.designedit;

import java.util.List;

public class DgnProductRemoveRequestModel {


    /**
     * id : 39167
     * productIds : [61279]
     */

    private String id;
    private List<Integer> productIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Integer> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Integer> productIds) {
        this.productIds = productIds;
    }
}
