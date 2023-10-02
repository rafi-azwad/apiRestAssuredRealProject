package repository.remoteRepo.requestRepo.designedit;

import java.util.List;

public class DgnPresentationLinkRequestModel {


    /**
     * collectionId : 30852
     * presentationTemplate : TEMPLATE_ONE
     * productIdList : [60456]
     */

    private String collectionId;
    private String presentationTemplate;
    private List<Integer> productIdList;

    public String getCollectionId(String arg0) {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public String getPresentationTemplate() {
        return presentationTemplate;
    }

    public void setPresentationTemplate(String presentationTemplate) {
        this.presentationTemplate = presentationTemplate;
    }

    public List<Integer> getProductIdList() {
        return productIdList;
    }

    public void setProductIdList(List<Integer> productIdList) {
        this.productIdList = productIdList;
    }
}
