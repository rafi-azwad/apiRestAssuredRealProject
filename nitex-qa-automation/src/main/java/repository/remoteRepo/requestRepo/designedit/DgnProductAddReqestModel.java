package repository.remoteRepo.requestRepo.designedit;

import java.util.List;

public class DgnProductAddReqestModel {


    /**
     * id : 39167
     * productIds : [60959]
     * async : false
     */

    private String id;
    private boolean async;
    private List<Integer> productIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAsync() {
        return async;
    }

    public void setAsync(boolean async) {
        this.async = async;
    }

    public List<Integer> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Integer> productIds) {
        this.productIds = productIds;
    }
}
