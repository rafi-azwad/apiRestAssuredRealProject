package dbEntity.payment;

public enum AddressType {

    BILLING(0),
    SHIPPING(1);

    private Integer value;

    AddressType( Integer val ){

        this.value = val;
    }
}
