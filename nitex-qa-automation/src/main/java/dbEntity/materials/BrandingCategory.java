package dbEntity.materials;

public enum BrandingCategory {
    MAIN_LABEL(0, "Main label", "ML",true),
    SIZE_LABEL(1, "Size label", "SL",true),
    CARE_LABEL(2, "Care label", "CL",true),
    COMPOSITE_LABEL(3, "Composite label", "CL",true),
    PATCH(4, "Patch", "P",true),
    HAND_TAG(5, "Hand tag", "HT",false),
    HAND_TAG_STRING(6, "Hand tag string", "HTS",false),
    STICKER(7, "Sticker", "ST",false),
    POLY_BAG(8, "Ploy bag", "PB",false),
    CARTON(9, "Carton", "CT",false),
    BAG_BOARD(10, "Bag board", "BB",false),
    MAIN_AND_SIZE_LABEL(11,"Main & size label","MSL",true),
    SHADE_LABEL(12,"Shade label","SL",true),
    TAG(13,"Tag","T",false),
    JOCKER_TAG(14,"Jocker tag","JT",false),
    DISCLAIMER_TAG(15,"Disclaimer tag","DT",false),
    PRICE_TICKET(16,"Price ticket","PT",false),
    POCKET_FLASHER(17,"Pocket flasher","PF",false),
    WAISTBAND_FLASHER(18,"Waistband flasher","WF",false),
    SINGLE_POLYBAG(19,"Single polybag","SP",false),
    BLISTER_POLYBAG(20,"Blister polybag","BP",false),
    POLY_STICKER(21,"Poly sticker","PS",false),
    CARTON_STICKER(22,"Carton sticker","CS",false),
    GUM_TAPE(23,"Gum tape","GT",false),
    TAG_PIN(24,"Tag pin","TP",false),
    ;

    private Integer order;
    private String name;
    private String code;
    private Boolean isDeleted;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    BrandingCategory(Integer order, String name, String code, Boolean isDeleted) {
        this.order = order;
        this.name = name;
        this.code = code;
        this.isDeleted = isDeleted;
    }
}
