package dbEntity.workflow;

public enum WorkflowStep {

    STYLE_INFO(0, 0, WorkflowType.UPLOAD_PRODUCT_WORKFLOW, "Design" ),
    PHYSICAL_SAMPLE(1, 1,  WorkflowType.UPLOAD_PRODUCT_WORKFLOW, "Physical sample" ),
    FLAT_SKETCH(2, 2, WorkflowType.UPLOAD_PRODUCT_WORKFLOW, "Flat sketches" ),
    ART_WORK(3, 4, WorkflowType.UPLOAD_PRODUCT_WORKFLOW, "Artworks" ),
    REFERENCE_IMAGE(4, 3, WorkflowType.UPLOAD_PRODUCT_WORKFLOW, "References" ),
    MATERIALS(5, 6, WorkflowType.UPLOAD_PRODUCT_WORKFLOW, "Materials" ),
    MEASUREMENTS(6, 5,  WorkflowType.UPLOAD_PRODUCT_WORKFLOW, "Measurements" ),
    COSTING(7, 7, WorkflowType.UPLOAD_PRODUCT_WORKFLOW, "Initial costing" ),

    PRICE_BREAKDOWN(8, 1, WorkflowType.INITIAL_COSTING_WORKFLOW, "Price breakdown" ),
    QUANTITY_WISE_PRICE(9, 2, WorkflowType.INITIAL_COSTING_WORKFLOW, "Quantitywise price" ),

    ORDER_INFO(10, 1, WorkflowType.ORDER_PLACEMENT_WORKFLOW, "Order info" ),
    PROFORMA_INVOICE(11, 2, WorkflowType.ORDER_PLACEMENT_WORKFLOW, "PI" ),
    SUPPLIER(12, 3, WorkflowType.ORDER_PLACEMENT_WORKFLOW, "Supplier" ),
    SALES_CONTRACT(13, 4, WorkflowType.ORDER_PLACEMENT_WORKFLOW, "Sales contract" ),
    MATERIAL_LIST(14, 5, WorkflowType.ORDER_PLACEMENT_WORKFLOW, "Material list" ),
    TEAM(15, 6, WorkflowType.ORDER_PLACEMENT_WORKFLOW, "Team" ),
    TNA(16, 7, WorkflowType.ORDER_PLACEMENT_WORKFLOW, "TNA" ),
    COMMERCIAL_INVOICE(17, 8, WorkflowType.ORDER_PLACEMENT_WORKFLOW, "CI" ),
    PAYMENT_TRACKER( 18, 8, WorkflowType.ORDER_PLACEMENT_WORKFLOW, "Payment" ),
    ;

    private Integer order;
    private Integer value;
    private WorkflowType workflowType;
    private String name;

    public WorkflowType getWorkflowType() {
        return workflowType;
    }

    WorkflowStep(Integer value, Integer order, WorkflowType workflowType, String name ) {
        this.value = value;
        this.order = order;
        this.workflowType = workflowType;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public Integer getOrder() {
        return order;
    }
}
