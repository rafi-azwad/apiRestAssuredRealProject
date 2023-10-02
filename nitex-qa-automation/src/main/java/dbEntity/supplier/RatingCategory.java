package dbEntity.supplier;

public enum RatingCategory {
    COMMITMENT(0, "Commitment"),
    COMMUNICATION(1, "Communication"),
    QUALITY(2, "Quality"),
    ON_TIME_DELIVERY(3, "On-time delivery"),
    PRICE(4, "Price"),
    EXPERIENCE(5, "Experience")
    ;

    private String name;
    private Integer value;

    RatingCategory( Integer value, String name ) {
        this.name = name;
        this.value = value;
    }
}
