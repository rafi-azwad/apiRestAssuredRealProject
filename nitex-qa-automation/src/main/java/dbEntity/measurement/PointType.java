package dbEntity.measurement;

public enum PointType {
    MAIN(0,0),
    OPTIONAL(1,1);

    private Integer order;
    private Integer value;

    PointType( Integer order, Integer value ){
        this.order = order;
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
