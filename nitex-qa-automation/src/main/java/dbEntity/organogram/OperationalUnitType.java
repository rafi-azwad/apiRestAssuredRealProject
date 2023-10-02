package dbEntity.organogram;

public enum OperationalUnitType {
    SAMPLE_HOUSE(0),
    OFFICE_LOCATION(1)
    ;

    private Integer value;

    OperationalUnitType(Integer value) {
        this.value = value;
    }
}
