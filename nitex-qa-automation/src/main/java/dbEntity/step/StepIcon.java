package dbEntity.step;

public enum StepIcon {
    SUBMISSION(0),
    APPROVAL(1),
    CUTTING(2),
    SEWING(3),
    WASHING(4),
    FINISHING(5),
    PRE_FINAL(6),
    EMBELLISHMENT(7),
    KNITTING(8),
    WINDING(9),
    LINKING(10),
    ;

    private Integer value;

    StepIcon(Integer value) {
        this.value = value;
    }
}
