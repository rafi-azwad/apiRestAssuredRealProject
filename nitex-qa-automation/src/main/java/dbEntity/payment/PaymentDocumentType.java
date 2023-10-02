package dbEntity.payment;

public enum PaymentDocumentType {
    PROFORMA_INVOICE(0),
    SALES_CONTRACT(1),
    COMMERCIAL_INVOICE(2)
    ;

    private Integer value;

    PaymentDocumentType(Integer value) {
        this.value = value;
    }
}
