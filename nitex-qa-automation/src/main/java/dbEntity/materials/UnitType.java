package dbEntity.materials;

import dbEntity.enums.NamedConstant;

public enum UnitType implements NamedConstant {
    PCS(0,"pcs", false,3 ),
    KG(1,"kg", false, 0),
    TON(2,"ton",true, 0),
    DOZEN(3,"dz", false,4),
    METER(4,"meter",false,2),
    MILLIMETER(5,"mm",true,0),
    CENTIMETER(6,"cm",false,7),
    DECIMETER(7,"dci",true,0),
    INCH(8,"in",false,8),
    FOOT(9,"ft",true,0),
    YARD(10,"yard",false,1),
    SQUARE_METER(11,"sqm",true,0),
    SQUARE_INCH(12,"sqi",true,0),
    LITER(13,"liter",true,0),
    MILLILITER(14,"ml",true,0),
    CENTILITER(15,"cl",true,0),
    DECILITER(16,"dl",true,0),
    GALLON(17,"gallon",true,0),
    GRAMS(18,"gm",true,0),
    GRAIN(19,"grain",true,0),
    DRAM(20,"dram",true,0),
    OUNCE(21,"ounce",false,5),
    POUND(22,"lbs",false,6),
    SLUG(23,"slug",true,0),
    POND(24,"pond",true,0),
    PAPER_BALE(25,"bale",true,0),
    CONE(26,"con",true,0),
    GAUGE(27,"gg",true,0),
    ROLL(28,"roll",true,0),
    ;

    UnitType( Integer value, String name, Boolean isDeleted, Integer ordering ){
        this.value = value;
        this.name = name;
        this.isDeleted = isDeleted;
        this.ordering = ordering;
    }

    private Integer value;
    private String name;
    private Boolean isDeleted;
    private Integer ordering;

    public Integer getValue() {
        return value;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public Integer getOrdering() {
        return ordering;
    }

    @Override
    public String getName() {
        return name;
    }
}
