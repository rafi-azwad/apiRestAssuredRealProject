package dbEntity.sample;


import java.util.List;

public enum SampleActivityType {
    DESIGN_UPLOADED(0),
    REQUESTED(1 ),
    PATTERN(2 ),
    CUTTING(3 ),
    PRINT(4 ),
    EMBROIDERY(5 ),
    SEWING(6 ),
    WASH(7 ),
    DELIVERED(8 ),
    COSTING(9 ),
    PHOTOSHOOT(10 ),
    PUBLISHED(11 ),
    SENT_TO_BD(12);

    private Integer value;

    SampleActivityType(Integer value ) {
        this.value = value;
    }

    public List<SampleActivityType> getAllActivityType() {

        return List.of( this.getDeclaringClass().getEnumConstants() );
    }
    public Integer getValue() {
        return this.value;
    }
}
