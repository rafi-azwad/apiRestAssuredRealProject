package dbEntity.log;

public enum ActionType {

    DOWNLOAD_INVOICE(0,false),
    DOWNLOAD_SALES_CONTRACT(1,false),
    COMMENT(2,true),
    TASK_REVISION(3,true),
    TASK_COMPLETE(4,true),
    TASK_APPROVE(5,true),
    TASK_REGULAR_POST(6,true),

    UPDATED_MEASUREMENT_CHART(7, true),
    UPDATED_MATERIAL_LIST(8, false),

    UPDATED_COLOR_SIZEWISE_QTY(9,true),
    UPDATED_ETD(10,true),
    STARTED_ORDER(11,true),
    COMPLETED_ORDER(12,true),
    UPDATED_INCOTERM(13,true),
    UPDATED_PRICE(14,true),
    UPDATED_PO_NO(15,true),

    PI_SENT(16,true),
    PI_APPROVAL_ACKNOWLEDGEMENT(17,true),
    PI_TERMS_UPDATED(18,true),
    PI_SHIPPING_UPDATED(19,true),
    PI_BENEFICIARY_DETAILS_UPDATED(20,true),
    PI_BUYER_ADDRESS_UPDATED(21,true),
    PI_BANK_DETAILS_UPDATED(22,true),

    NEW_TASK_ADDED(23, true),
    TASK_MEMBER_ASSIGNED(24, false),
    TASK_MEMBER_REMOVED(25, false),
    TASK_DEADLINE_UPDATED(26, true),
    TASK_DESCRIPTION_UPDATED(27, true),

    STAGE_COMPLETED(28, false),
    STAGE_DUE_DATE_UPDATED(29, false),

    TASK_PRODUCTION_QUANTITY_UPDATE(30, true),
    ON_SHIPMENT_ORDER(31, true)
    ;

    private Integer value;
    private Boolean showInTimeline;

    public Integer getValue() {
        return value;
    }

    public Boolean getShowInTimeline() {
        return showInTimeline;
    }

    ActionType( Integer value, Boolean showInTimeline ) {
        this.value = value;
        this.showInTimeline = showInTimeline;
    }
}
