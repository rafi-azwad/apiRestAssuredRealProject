package repository.remoteRepo.requestRepo.collection;

import java.util.List;

public class CollectionPostShareRequestModel {


    /**
     * collectionId : 39167
     * userIds : [17452]
     */

    private String collectionId;
    private List<Integer> userIds;

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }
}
