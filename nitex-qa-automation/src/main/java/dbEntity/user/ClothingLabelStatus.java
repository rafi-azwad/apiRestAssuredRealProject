package dbEntity.user;

public enum ClothingLabelStatus {

    DONT_HAVE_LABEL_YET(0),
    DO_DROPSHIP_ONLY(1),
    DROPSHIP_NOW_WILL_BUILD_LABEL(2),
    SELL_WHOLESALE_TO_RETAILERS(3),
    MAKE_PROMOTIONAL_GOODS(4),
    WE_HAVE_A_PRIVATE_CLOTHING_LABEL(5);

    private Integer value;

    ClothingLabelStatus(Integer val ){

        this.value = val;
    }
}
