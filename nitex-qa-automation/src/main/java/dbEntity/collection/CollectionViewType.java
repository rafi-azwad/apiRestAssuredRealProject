package dbEntity.collection;

public enum CollectionViewType {

    PRODUCT_LIST(0),
    BANNER(1),
    RFQ(2),
    LIKED_PRODUCTS(3),
    MY_PRODUCTS(4),
    PROJECT(5),
    REQUESTED(6),
    INITIALIZED(7);

    private Integer value;

    CollectionViewType(Integer val ){

        this.value = val;
    }
}
