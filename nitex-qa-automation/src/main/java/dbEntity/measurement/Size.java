package dbEntity.measurement;

import dbEntity.enums.NamedConstant;

public enum Size implements NamedConstant  {
    XXS(0, 1, 1, "2XS"),
    XS(1, 1, 2, "XS"),
    S(2, 1, 3, "S"),
    M(3, 1,4, "M"),
    L(4, 1,5, "L"),
    XL(5,1,6, "XL"),
    TWO_XL(6, 1,7, "2XL"),
    THREE_XL(7, 1,8, "3XL"),
    FOUR_XL(8, 1,9, "4XL"),
    FIVE_XL(9, 1,10, "5XL"),
    SIX_XL(10, 1,11, "6XL"),
    XXXS(11, 1,0, "3XS"),
    SEVEN_XL(12, 1,12, "7XL"),
    EIGHT_XL(13, 1,13, "8XL"),
    NINE_XL(14, 1,14, "9XL"),
    TEN_XL(15, 1,15, "10XL"),
    ;

    private Integer order;
    private Integer typeCode;
    private Integer value;
    private String name;

    Size( Integer order, Integer typeCode, Integer value, String name ) {
        this.order = order;
        this.typeCode = typeCode;
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public Integer getOrder() {
        return order;
    }
}
