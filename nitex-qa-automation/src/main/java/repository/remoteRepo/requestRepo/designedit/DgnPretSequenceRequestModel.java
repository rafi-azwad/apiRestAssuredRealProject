package repository.remoteRepo.requestRepo.designedit;

import java.util.List;

public class DgnPretSequenceRequestModel {


    /**
     * collectionId : 30852
     * orderedProductIds : [60457,60556]
     */

    private String collectionId;
    private List<String> orderedProductIds;

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public List<String> getOrderedProductIds() {
        return orderedProductIds;
    }

    public void setOrderedProductIds(List<String> orderedProductIds) {
        this.orderedProductIds = orderedProductIds;
    }
}
