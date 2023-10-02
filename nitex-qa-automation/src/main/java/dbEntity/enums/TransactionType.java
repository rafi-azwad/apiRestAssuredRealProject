package dbEntity.enums;

public enum TransactionType {

    RECEIVE ( 0 ),
    ISSUE ( 1 ),
    ;
    private Integer value;

    TransactionType ( Integer value ) {
        this.value = value;
    }
}
