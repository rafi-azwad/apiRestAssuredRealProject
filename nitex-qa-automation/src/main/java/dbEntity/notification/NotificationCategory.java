package dbEntity.notification;

public enum NotificationCategory {

    ORDER(0),
    STEP(1),
    POST(2),
    RFQ(3),
    PRODUCT(4),
    COLLECTION(5),
    INVOICE(6),
    SAMPLE(7),
    QUOTE(8),
    PHOTOGRAPHY(9),
    USER(10),
    CRM( 11 )
    ;

    private Integer value;

    NotificationCategory( Integer value ){

        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
