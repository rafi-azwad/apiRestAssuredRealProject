package dbEntity.bltracking;

public enum BLPaymentType {
    BUYER(0),
    FACTORY(1);

    private Integer value;

    BLPaymentType( int value ) {
        this.value = value;
    }

    public Integer getValue(){
        return this.value;
    }
}
