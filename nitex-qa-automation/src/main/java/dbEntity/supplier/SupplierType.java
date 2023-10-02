package dbEntity.supplier;

import dbEntity.enums.NamedConstant;
public enum SupplierType implements NamedConstant {

    FABRIC(0, "Fabric", 1 ),
    TRIMS(1, "Trims", 2 ),
    ACCESSORIES(2, "Accessories", 3 ),
    GARMENTS(3, "Garments", 0 ),
    EMBELLISHMENT(4, "Embellishment", 4 ),
    WASHING(5, "Washing", 5 )
    ;

    @Override
    public String getName() {
        return name;
    }

    public Integer getOrder() {
        return order;
    }

    public Integer getValue() {
        return value;
    }

    private Integer value;
    private String name;
    private Integer order;

    SupplierType( Integer value, String name, Integer order ) {
        this.value = value;
        this.name = name;
        this.order = order;
    }
}
