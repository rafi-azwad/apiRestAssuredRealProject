package dbEntity.enums;

public enum Status {

    REQUESTED_FOR_QUOTATION(0),
    OFFER_PENDING( 1),
    QUOTED(2),
    RUNNING(3),
    COMPLETED(4),
    INITIALIZED(5),
    SUBMITTED(6),
    REJECTED(7),
    SUBMIT(8),
    APPROVED(9),
    RE_SUBMIT(10),
    PENDING(11),
    UNDER_REVIEW(12),
    PAID(13),
    PARTIALLY_PAID(14),
    ACTIVE(15),
    DISABLED(16),
    REQUESTED(17),
    PRODUCT_SOLD(18),
    ORDER_PLACED(19),
    SCOPE_OFF(20),
    CANCELLED(21),
    DOWNLOADED(22),
    DELIVERED(23),
    OFFER_SENT(24),
    REQUEST_FOR_REVISION(25),
    ARCHIVE(26),
    ON_SHIPMENT(27),
    REVISION_PROCESSED( 28 ),
    ON_BOARDED( 29 ),
    ON_BOARDING( 30 ),
    PIPELINE( 31 ),
    TODAY( 32 ),
    ;

    private Integer value;

    Status( Integer value ){

        this.value = value;
    }
}
