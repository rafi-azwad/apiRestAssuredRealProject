package dbEntity.brand;

import dbEntity.enums.NamedConstant;

public enum BrandGroup implements NamedConstant {

    HIGH_END( 0, "High end"),
    LUXURY( 1, "Luxury" ),
    MID_RANGE(2, "Mid Range" ),
    ENTRY_PRICE_POINT(3, "Entry Price Point")
    ;

    private Integer order;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    BrandGroup( Integer order, String name ) {
        this.order = order;
        this.name = name;
    }
}
