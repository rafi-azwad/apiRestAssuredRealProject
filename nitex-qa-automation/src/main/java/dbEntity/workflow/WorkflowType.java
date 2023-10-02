package dbEntity.workflow;

public enum WorkflowType {

    UPLOAD_PRODUCT_WORKFLOW(0),
    INITIAL_COSTING_WORKFLOW(1),
    ORDER_PLACEMENT_WORKFLOW(2);

    private Integer value;

    WorkflowType(Integer value) {
        this.value = value;
    }
}
