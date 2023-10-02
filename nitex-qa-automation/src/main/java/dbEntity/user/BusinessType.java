package dbEntity.user;

public enum BusinessType {

    EVENTS(0),
    WHOLESALES(1),
    TENDERS(2),
    RETAILERS(3),
    E_COMMERCE(4),
    OTHER(5);

    private Integer value;

    BusinessType(Integer val) {

        this.value = val;
    }
}
