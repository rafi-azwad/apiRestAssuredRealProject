package dbEntity.supplier;

public enum TagType {

    SUPPLIER_STRENGTH(0, false),
    SUPPLIER_CLIENTS(1, false),
    SUPPLIER_ADDITIONAL_TAG(2, false),
    MATERIAL_SUSTAINABLE_TAG(3, false),
    USER_CERTIFICATION(4, false),
    USER_TOP_THREE_SKILL_TAG(5, false),
    USER_OTHER_SKILL_TAG(6, false),
    USER_STAKEHOLDER_CUSTOMER_TAG(7, false),
    USER_STAKEHOLDER_SUPPLIER_TAG(8, false),
    USER_STAKEHOLDER_THIRD_PARTY_TAG(9, false),
    COLLECTION_TAG(10, false),
    SUPPLIER_FINISH( 11, true ),
    SUPPLIER_WASH( 12, true ),
    SUPPLIER_CHARACTERISTIC_DRAPPY( 13, true ),
    SUPPLIER_CHARACTERISTIC_HAND_FEEl( 14, true ),
    SUPPLIER_CHARACTERISTIC_FINISH_EFFECT( 15, true ),
    SUPPLIER_CHARACTERISTIC_LOOK( 16, true ),
    PRODUCT_FITTING_TYPE(17, false),
    PRODUCT_SIZE_STANDARD(18, true),
    PRODUCT_LENGTH(19, false),
    PRODUCT_RISE(20, false),
    ;

    private Integer value;
    private Boolean isFixed;

    TagType( Integer value, Boolean isFixed ) {
        this.value = value;
        this.isFixed = isFixed;
    }

    public Boolean getFixed() {
        return isFixed;
    }
}
