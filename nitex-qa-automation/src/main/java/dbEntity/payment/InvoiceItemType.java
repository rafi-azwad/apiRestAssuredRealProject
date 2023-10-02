package dbEntity.payment;

public enum InvoiceItemType {
    PRODUCT(0),
    OTHERS(1);

    private Integer value;

    InvoiceItemType(Integer value) {
        this.value = value;
    }
}
