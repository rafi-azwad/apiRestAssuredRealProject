package repository.remoteRepo.requestRepo.collection;

public class CollectionPostPersonalSetRequestModel {


    /**
     * key : SYSTEM_PREFERENCES
     * value : {"collectionDetailsViewType":"LARGE_VIEW","favouritePageViewType":"LARGE_VIEW","isShowPrice":true,"COLLECTION_PAGE_TAB_VIEW":"COLLECTION_TAB","NITEX_PAGE_TAB_VIEW":"DESIGN_TAB"}
     */

    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
