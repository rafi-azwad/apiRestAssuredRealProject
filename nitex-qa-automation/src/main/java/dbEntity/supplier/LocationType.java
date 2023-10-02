package dbEntity.supplier;

public enum LocationType {
    OFFICE(0),
    FACTORY(1);

    private Integer value;

    LocationType(Integer value) {
        this.value = value;
    }
}
