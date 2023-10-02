package dbEntity.payment;

public enum PaymentGateway {

    STRIPE(0),
    PAYPAL(1);

    private Integer value;

    PaymentGateway(Integer val ){

        this.value = val;
    }
}
