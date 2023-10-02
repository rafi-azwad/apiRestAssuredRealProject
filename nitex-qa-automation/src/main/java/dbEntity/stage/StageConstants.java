package dbEntity.stage;

public enum StageConstants {

    ORDER_PLACED(0,true ),
    TECHNICAL_DESIGN(1,false ),
    MATERIALS(2, true ),
    SAMPLING(3, true ),
    PP_ACTIVITIES(4, true ),
    PRODUCTION(5, true ),
    INSPECTION(6, true ),
    DELIVERY(7, true );

    private Integer value;
    private Boolean isActive;

    StageConstants( Integer value, Boolean isActive ) {
        this.value = value;
        this.isActive = isActive;
    }

    public Integer getValue() {
        return value;
    }
}
