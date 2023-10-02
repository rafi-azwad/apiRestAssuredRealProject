package dbEntity.log;

import dbEntity.enums.NamedConstant;

public enum ActivityModule implements NamedConstant {

    COMMENT(0, "Comment"),
    PROFORMA_INVOICE(1, "Invoice"),
    ORDER(2, "Order"),
    SALES_CONTRACT(3, "Sales contract"),
    PRODUCT(4, "Product"),
    TASK(5, "Task"),
    STAGE(6, "Stage")
    ;

    private Integer value;
    private String name;

    ActivityModule( Integer value, String name ){
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String getName() {
        return name;
    }
}
