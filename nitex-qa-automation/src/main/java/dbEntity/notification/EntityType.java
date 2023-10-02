package dbEntity.notification;

public enum EntityType {

    ORDER(0),
    PRODUCT(1),
    MATERIAL(2),
    COLLECTION(3),
    STEP(4),
    POST(5),
    INVOICE(6),
    ACTIVITY(7),
    STAGE(8),
    POJO_CLASS(9),
    SAMPLE_REQUEST(10),
    QUOTE(11),
    BRAND(12),
    DELIVERABLE(13),
    SALES_CONTRACT(14),
    PHOTOGRAPHY_REQUEST(15),
    PROJECTION(15)
    ;

    private Integer value;

    EntityType(Integer value) {
        this.value = value;
    }
}
