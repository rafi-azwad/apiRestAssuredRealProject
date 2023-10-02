package dbEntity.user;

public enum Region {

    EUROPEAN_UNION(0),
    AMERICA(1),
    AFRICA(2),
    ASIA(3),
    AUSTRALIA(4),
    OTHER(5);

    private Integer value;

    Region( Integer val) {

        this.value = val;
    }
}
