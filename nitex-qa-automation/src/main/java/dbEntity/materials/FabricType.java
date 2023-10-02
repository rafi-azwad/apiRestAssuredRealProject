package dbEntity.materials;

import dbEntity.enums.NamedConstant;

public enum FabricType implements NamedConstant {
    WOVEN(0, "Woven", "W", "Yard" ),
    KNIT(1, "Knit", "K", "Kg" ),
    SWEATER(2, "Sweater", "S", "LBS" ),
    DENIM(3, "Denim", "D", "Yard" ),
    FUNCTIONAL(4, "Functional", "F", "Kg" ),
    NON_WOVEN(5, "Non-Woven", "N", "Yard" ),
    ;

    private Integer order;
    private String name;
    private String code;
    private String unit;

    @Override
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
    public String getUnit() {
        return unit;
    }

    FabricType(Integer order, String name, String code, String unit) {
        this.order = order;
        this.name = name;
        this.code = code;
        this.unit = unit;
    }

}
