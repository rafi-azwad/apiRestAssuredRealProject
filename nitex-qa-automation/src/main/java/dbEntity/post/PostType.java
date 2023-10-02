package dbEntity.post;

public enum PostType {
    NOTE(0),
    QUERY(1),
    COMMENT( 2 ),
    DELIVERABLE_UPDATE(3),
    RFQ_MESSAGE(4),
    TASK_REVISION(5),
    TASK_COMPLETE(6),
    TASK_APPROVE(7),
    TASK_REGULAR_POST(8),
    PRODUCT_DEVELOPMENT_COMMENT(9),
    SAMPLE_DEVELOPMENT_COMMENT(10),
    QUOTE_REQUEST_COMMENT(11),
    COLLECTION_COMMENT(12),
    PHOTOGRAPHY_REQUEST_COMMENT(13),
    SAMPLE_AUTO_GENERATED_COMMENT(14),
    QUOTE_AUTO_GENERATED_COMMENT(15),
    TASK_PRODUCTION_QUANTITY_UPDATE(16)
    ;

    private Integer value;

    PostType( Integer val ) {

        this.value = val;
    }

    public Integer getValue(){

        return this.value;
    }
}