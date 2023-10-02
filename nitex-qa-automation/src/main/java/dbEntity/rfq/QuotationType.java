package dbEntity.rfq;

import dbEntity.enums.NamedConstant;

public enum QuotationType implements NamedConstant {
    DESIGNWISE(0, "Designwise"),
    SIZEWISE(1, "Sizewise"),
    COLORWISE(2, "Colorwise"),
//    SIZE_COLOR_WISE(3, "Size & colorwise"),
    ;

    private Integer value;
    private String name;

    QuotationType( Integer value, String name ) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
