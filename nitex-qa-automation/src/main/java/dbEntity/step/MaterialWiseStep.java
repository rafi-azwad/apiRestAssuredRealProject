package dbEntity.step;

public enum MaterialWiseStep {
    BOOKING("Booking"),
    BOOKING_CONFIRMATION("Booking Confirmation"),
    MATERIAL_CONFIRMATION("Material Confirmation"),
    PI_CONFIRMATION("PI confirmation"),
    DELIVERY_DATE_CONFIRMATION("Delivery Date Confirmation"),
    PRODUCTION_PROGRESS_CHECKING("Production Progress Checking"),
    PAYMENT_STATUS_CHECKING("Payment Status Checking"),
    DELIVERY("Delivery"),
    SHIPPING_DOC("Shipping Document"),
    CLEARING("Clearing"),
    INHOUSE("In-house");

    private String value;

    MaterialWiseStep( String value ){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
