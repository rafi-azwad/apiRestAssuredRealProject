package dbEntity.costing;

public enum CostingRequestType {
    INITIAL_COSTING(0),
    RE_COSTING(1);

    private Integer value;

    CostingRequestType(Integer value) {
        this.value = value;
    }
}
