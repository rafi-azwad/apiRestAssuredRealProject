package dbEntity.post;

public enum RecipientType {
    BUYER(0),
    NITEX(1),
    INDIVIDUAL(2),
    ;

    RecipientType( Integer value ) {
        this.value = value;
    }

    private Integer value;
}
