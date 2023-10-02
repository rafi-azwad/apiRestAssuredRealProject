package dbEntity.payment;

public enum Currency {

    USD(0),
    EUR(1),
    GBP(2);

    final Integer value;

    Currency( Integer val ){

        this.value = val;
    }
}
