package dbEntity.notification;

import java.util.HashSet;
import java.util.Set;
public enum NotificationEvent {

    PROJECT_ADDED(0, false ),
    DELIVERABLE_SUBMITTED(1, false ),
    RFQ_PRICE_UPDATED(2, false, FrontEndNotificationEvent.REQUEST ),
    PRODUCT_PRICE_UPDATED(3, false ),
    DELIVERABLE_MESSAGE(4, false ),
    RFQ_PRODUCT_MESSAGE(5, false ),
    PROJECT_MANAGER_ADDED(6, false ),
    PROJECT_MEMBER_ADDED(7, false, FrontEndNotificationEvent.ORDER ),
    PROJECT_DEADLINE_UPDATED(8, false, FrontEndNotificationEvent.ORDER ),
    PROJECT_STATUS_UPDATED(9, false, FrontEndNotificationEvent.ORDER ),
    PRODUCT_ADDED_TO_PROJECT(10, false ),
    PRODUCT_REMOVED_FROM_PROJECT(11, false ),
    PROJECT_MANAGER_DELETED(12, false ),
    PROJECT_MEMBER_REMOVED(13, false ),
    RFQ_MANAGER_ADDED(14, false ),
    RFQ_MEMBER_ADDED(15, false ),
    RFQ_MANAGER_DELETED(16,false ),
    RFQ_MEMBER_REMOVED(17, false ),
    RFQ_STATUS_UPDATED(18, false ),
    PROJECT_EXECUTIVE_ADDED(19, false ),
    PROJECT_EXECUTIVE_DELETED(20, false ),
    RFQ_EXECUTIVE_ADDED(21, false ),
    RFQ_EXECUTIVE_DELETED(22, false ),
    NEW_PRODUCT_ADDED(23, false ),
    NEW_RFQ_ADDED(24, false, FrontEndNotificationEvent.REQUEST ),

    NEW_PRODUCT_ARRIVED(25, false ),
    NEW_ORDER_ADDED(26, false, FrontEndNotificationEvent.ORDER ),
    MEMBER_MENTIONED_AT_POST(27, false ),
    DELIVERABLE_STATUS_UPDATED(28, false ),
    DELIVERABLE_ALERT(29, false ),
    NEW_INVOICE_ADDED(30, false ),
    NEW_POST_ON_PROJECT(31, false ),
    PROJECT_ALERT(32, false ),
    PRODUCT_REMOVED_FROM_RFQ(33, false ),
    INVOICE_PAYMENT_ADDED (34, false, FrontEndNotificationEvent.ORDER ),

    COLLECTION_SHARED(35, false, FrontEndNotificationEvent.COLLECTION ),

    MEASUREMENT_CHART_UPDATED(36, false, FrontEndNotificationEvent.ORDER ),
    PRODUCT_COLOR_UPDATED(37, false, FrontEndNotificationEvent.ORDER ),
    RFQ_QUANTITY_UPDATED(38, false, FrontEndNotificationEvent.ORDER ),

    TASK_MEMBER_ASSIGNED(39, false, FrontEndNotificationEvent.ORDER ),
    TASK_DEADLINE_UPDATED(40, false, FrontEndNotificationEvent.ORDER ),
    TASK_APPROVED(41, true, FrontEndNotificationEvent.ORDER ),
    TASK_COMPLETED(42, true, FrontEndNotificationEvent.ORDER ),
    TASK_REVISED(43, false, FrontEndNotificationEvent.ORDER ),
    TASK_POST_ADDED(44, true, FrontEndNotificationEvent.COMMENT ),
    TASK_COMMENT_ADDED(45, true, FrontEndNotificationEvent.COMMENT ),

    INVOICE_PAYMENT_APPROVED(46, false, FrontEndNotificationEvent.ORDER ),
    INVOICE_PAYMENT_REJECTED(47, false, FrontEndNotificationEvent.ORDER ),

    COLLECTION_NEW_DESIGN_ADDED(48, true, FrontEndNotificationEvent.COLLECTION ),

    TASK_POST_MENTIONED(49, false, FrontEndNotificationEvent.COMMENT ),
    TASK_COMMENT_MENTIONED(50, false, FrontEndNotificationEvent.COMMENT ),
    STAGE_COMPLETE(51, false, FrontEndNotificationEvent.ORDER ),

    REMOVED_FROM_COLLECTION(52, false, FrontEndNotificationEvent.COLLECTION ),

    SAMPLE_DEVELOPMENT_POST(53, true, FrontEndNotificationEvent.COMMENT ),
    PRODUCT_DEVELOPMENT_POST(54, true, FrontEndNotificationEvent.COMMENT ),

    NEW_SAMPLE_REQUEST(55, false, FrontEndNotificationEvent.REQUEST ),
    SAMPLE_DEVELOPMENT_COMPLETE(56, false, FrontEndNotificationEvent.REQUEST ),
    NEW_QUOTE_REQUEST(57, false, FrontEndNotificationEvent.REQUEST ),
    QUOTE_PRICE_PROVIDED(58, true, FrontEndNotificationEvent.REQUEST ),
    NEW_COLLECTION_REQUEST(59, false, FrontEndNotificationEvent.REQUEST ),
    COLLECTION_SHARED_WITH_BUYER(60, false, FrontEndNotificationEvent.COLLECTION ),

    QUOTE_REQUEST_POST(61, true, FrontEndNotificationEvent.COMMENT ),
    COLLECTION_POST(62, true, FrontEndNotificationEvent.COMMENT ),
    PHOTOGRAPHY_REQUEST_POST(63, true, FrontEndNotificationEvent.COLLECTION ),
    QUOTE_PRICE_APPROVED(64, true, FrontEndNotificationEvent.REQUEST ),
    QUOTE_PRICE_REVISION(65, true, FrontEndNotificationEvent.REQUEST ),

    NEW_QUOTE_REQUEST_FROM_BUYER(66, false, FrontEndNotificationEvent.REQUEST ),
    NEW_SAMPLE_REQUEST_FROM_BUYER(67, false, FrontEndNotificationEvent.REQUEST ),
    NEW_ORDER_ADDED_FROM_BUYER(68, false, FrontEndNotificationEvent.REQUEST ),

    SAMPLE_REQUEST_MEMBER_ADDED(69, false, FrontEndNotificationEvent.REQUEST ),
    QUOTE_REQUEST_MEMBER_ADDED(70, false, FrontEndNotificationEvent.REQUEST ),
    QUOTE_TARGET_PRICE_UPDATE(71, true, FrontEndNotificationEvent.REQUEST ),

    NEW_PHOTOGRAPHY_REQUEST(72, false, FrontEndNotificationEvent.REQUEST ),
    NEW_PI_REQUEST(73, false, FrontEndNotificationEvent.ORDER ),
    PI_PROVIDED(74, false, FrontEndNotificationEvent.ORDER ),
    NEW_SC_REQUEST(75, false, FrontEndNotificationEvent.ORDER ),
    SC_PROVIDED(76, false, FrontEndNotificationEvent.ORDER ),
    ORDER_CANCEL_REQUEST_REJECT( 77, false, FrontEndNotificationEvent.ORDER ),
    ORDER_CANCELED( 78, false, FrontEndNotificationEvent.ORDER ),
    ORDER_CANCEL_REQUESTED( 79, false, FrontEndNotificationEvent.ORDER ),
    TNA_COMPLETED( 80, false, FrontEndNotificationEvent.ORDER ),
    BUYER_ETD_UPDATED( 81, false, FrontEndNotificationEvent.ORDER ),
    FACTORY_ETD_UPDATED( 82, false, FrontEndNotificationEvent.ORDER ),
    UPDATED_COLOR_SIZE_WISE_QTY( 83, false, FrontEndNotificationEvent.ORDER ),
    ORDER_ON_SHIPMENT( 84, false, FrontEndNotificationEvent.ORDER ),
    ORDER_PI_UPDATED( 85, false, FrontEndNotificationEvent.ORDER ),
    ORDER_SC_UPDATED( 86, false, FrontEndNotificationEvent.ORDER ),
    ORDER_PO_RECEIVE_DATE_UPDATED( 87, false, FrontEndNotificationEvent.ORDER ),
    PHOTOSHOOT_COMPLETED( 88, true, FrontEndNotificationEvent.REQUEST ),
    QUOTE_REQUEST_SUBMITTED_COSTING( 89, false, FrontEndNotificationEvent.REQUEST ),
    SAMPLE_REQUEST_APPROVED_FROM_BUYER( 90, true, FrontEndNotificationEvent.REQUEST ),
    SAMPLE_REQUEST_REVISION_FROM_BUYER( 91, true, FrontEndNotificationEvent.REQUEST ),
    COLLECTION_DESIGN_DELETED( 92, true, FrontEndNotificationEvent.COLLECTION ),
    COLLECTION_DESIGN_MOVED( 93, true, FrontEndNotificationEvent.COLLECTION ),
    BUYER_REGISTRATION( 94, false, FrontEndNotificationEvent.REQUEST ),
    PRODUCT_DEVELOPMENT_MENTIONED_AT_POST ( 95, false, FrontEndNotificationEvent.COMMENT ),
    SAMPLE_DEVELOPMENT_MENTIONED_AT_POST ( 96, false, FrontEndNotificationEvent.COMMENT ),
    QUOTE_REQUEST_MENTIONED_AT_POST ( 97, false, FrontEndNotificationEvent.COMMENT ),
    COLLECTION_MENTIONED_AT_POST ( 98, false, FrontEndNotificationEvent.COMMENT ),
    PHOTOGRAPHY_REQUEST_MENTIONED_AT_POST ( 99, false, FrontEndNotificationEvent.COMMENT ),
    NEW_COLLECTION_MOODBOARD_REQUEST(100, false, FrontEndNotificationEvent.REQUEST ),
    UPDATED_COLOR_SIZE_WISE_PRICE( 101, false, FrontEndNotificationEvent.ORDER ),
    DESIGN_STUDIO_COSTING_REQUEST( 102, false, FrontEndNotificationEvent.REQUEST ),
    CRM_PROJECTION_REQUEST( 103, false, FrontEndNotificationEvent.CRM ),
    CRM_PROJECTION_APPROVE( 104, false, FrontEndNotificationEvent.CRM ),
    CRM_PROJECTION_REVISION_REQUEST( 105, false, FrontEndNotificationEvent.CRM ),
    CRM_PROJECTION_REVISION( 106, false, FrontEndNotificationEvent.CRM ),
    CRM_PROJECTION_UPDATE( 106, false, FrontEndNotificationEvent.CRM ),

    ;

    private Integer value;

    private Boolean isGroup;
    private FrontEndNotificationEvent event;

    private static Set<Integer> importantNotificationEventSet = new HashSet<>();

    static {

        importantNotificationEventSet.add( NotificationEvent.NEW_ORDER_ADDED.value );
    }

    NotificationEvent( Integer value ){

        this.value = value;
    }
    NotificationEvent( Integer value, Boolean isGroup ){
        this.value = value;
        this.isGroup = isGroup;
    }

    NotificationEvent( Integer value, Boolean isGroup, FrontEndNotificationEvent event ){
        this.value = value;
        this.isGroup = isGroup;
        this.event = event;
    }

    public boolean isImportant() {

        if( importantNotificationEventSet.contains( this.value ) ){
            return true;
        }

        return false;
    }

    public Integer getValue() {
        return value;
    }

    public Boolean getIsGroup() {
        return isGroup;
    }
    public FrontEndNotificationEvent getEvent() {
        return event;
    }

    public enum FrontEndNotificationEvent{
        COMMENT( 0 ),
        COLLECTION( 1 ),
        REQUEST( 2 ),
        ORDER( 3 ),
        CRM( 4 );
        private Integer value;
        FrontEndNotificationEvent ( Integer value ){
            this.value = value;
        }

        public Integer getValue (){
            return this.value;
        }
    }
}
