package dbEntity.measurement;

public enum MeasurementUnit {
    CM(0),
    INCH(1);

    private Integer value;

    MeasurementUnit(Integer value) {
        this.value = value;
    }
}
