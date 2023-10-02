package dbEntity.order;

public enum PaymentTerms {

    CARD(0),
    WIRE_TRANSFER(1),
    LETTER_OF_CREDIT(2),
    GATEWAY(3);

    private Integer value;

    PaymentTerms(Integer val) {
        this.value = val;
    }
}
