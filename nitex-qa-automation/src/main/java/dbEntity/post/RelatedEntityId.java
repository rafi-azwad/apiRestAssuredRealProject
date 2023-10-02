package dbEntity.post;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RelatedEntityId {

    private Long productId;
    private Long orderId;
    private Long stepId;
    private Long collectionId;
    private Long productInfoForRFQId;
    private Long costingId;
    private Long quoteRequestId;
    private Long photographyRequestId;
    private Long postId;
    private Long parentPostId;
    private Long orderMaterialId;
    private Long stageId;
    private Long invoiceId;
    private Long artBoardId;
    private Long sampleRequestId;
    private Integer postPositionNo;
    private Long moodboardId;
    private Long deliverableId;
    private Long salesContractId;
    private Long buyerId;
    private Long projectionId;
}
