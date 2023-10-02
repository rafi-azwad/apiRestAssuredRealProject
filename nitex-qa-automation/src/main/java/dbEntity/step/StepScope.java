package dbEntity.step;

public enum StepScope {

    ORDER_WISE(0),
    PRODUCT_WISE(1),
    MATERIAL_WISE(2);

    private Integer value;

    StepScope( Integer value ){
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
