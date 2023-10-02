package repository.remoteRepo.requestRepo.designedit;

public class DesignDocgroupAddRequestModel {


    /**
     * name : 4-D.png
     * docMimeType : image/png
     * documentGroup : PHYSICAL_SAMPLE
     * documentType : FRONT_IMAGE
     * base64Str : data:image/png;base64
     * productId : 61280
     * size : 399830
     */

    private String name;
    private String docMimeType;
    private String documentGroup;
    private String documentType;
    private String base64Str;
    private String productId;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocMimeType() {
        return docMimeType;
    }

    public void setDocMimeType(String docMimeType) {
        this.docMimeType = docMimeType;
    }

    public String getDocumentGroup() {
        return documentGroup;
    }

    public void setDocumentGroup(String documentGroup) {
        this.documentGroup = documentGroup;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getBase64Str() {
        return base64Str;
    }

    public void setBase64Str(String base64Str) {
        this.base64Str = base64Str;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
