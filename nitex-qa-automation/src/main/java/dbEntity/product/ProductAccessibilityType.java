package dbEntity.product;

public enum ProductAccessibilityType {

    CREATED_BY_BUYER(0),
    CREATED_BY_NITEX(1),
    ORDER_MEMBER(2);

    ProductAccessibilityType( Integer value ) {
        this.value = value;
    }

    private Integer value;
}
