package dbEntity.enums;

public enum PriceRange implements NamedConstant{

    LOW(0, "Low Range"),
    MID(1, "Mid Range"),
    HIGH(2, "High Range")
    ;

    @Override
    public String getName() {
        return name;
    }

    private Integer value;
    private String name;

    PriceRange( Integer value, String name ) {
        this.value = value;
        this.name = name;
    }
}
