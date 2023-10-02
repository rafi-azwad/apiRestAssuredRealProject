package dbEntity.step;

public enum MandatoryFlag {
    MANDATORY_FOR_SWEATER(0),
    MANDATORY_FOR_NON_SWEATER(1),
    DEFAULT(2)
    ;

    private Integer value;

    MandatoryFlag(Integer value) {
        this.value = value;
    }
}
