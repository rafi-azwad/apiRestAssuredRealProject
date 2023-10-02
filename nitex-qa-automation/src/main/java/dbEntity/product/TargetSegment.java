package dbEntity.product;

public enum TargetSegment {
    HIGH_END(0),
    MID_RANGE(1);

    private Integer value;

    TargetSegment(Integer value) {
        this.value = value;
    }
}
