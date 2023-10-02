package dbEntity.enums;

public enum RelativePeriod implements NamedConstant {
    LAST_1_YEAR(0, "Last 1 Year"),
    LAST_6_MONTH(1, "Last 6 Month"),
    LAST_4_MONTH(2, "Last 4 Month"),
    LAST_MONTH(3, "Last Month"),
    CUSTOM(4, "Custom"),
    ;
    private Integer value;
    private String name;
    RelativePeriod(int value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }
}
