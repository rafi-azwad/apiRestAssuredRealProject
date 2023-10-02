package dbEntity.enums;

public enum TNAStatus implements NamedConstant {
    SHIPPED(0, "Shipped"),
    SAFE(1, "Safe"),
    DUE_SOON(2, "Due soon"),
    RED_ALERT(3, "Red Alert"),
    UNSAFE(4, "Unsafe"),
    ;

    private Integer value;
    private String name;

    TNAStatus( Integer value, String name ){

        this.value = value;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Integer getValue() {
        return value;
    }
}
