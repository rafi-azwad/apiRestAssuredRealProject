package dbEntity.product;

public enum ProductCreationType {

    FROM_TECH_PACK(0),
    FROM_CATALOG(1),
    CUSTOM(2);

    private Integer value;

    ProductCreationType( Integer value ){

        this.value = value;
    }
}
