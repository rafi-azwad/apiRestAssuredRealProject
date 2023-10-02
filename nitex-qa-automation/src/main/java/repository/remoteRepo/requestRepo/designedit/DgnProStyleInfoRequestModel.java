package repository.remoteRepo.requestRepo.designedit;

public class DgnProStyleInfoRequestModel {


    /**
     * id : 63560
     * name : test
     * referenceNumber : test
     * productSubCategoryId : 256
     * productGroupId : 1
     */

    private int id;
    private String name;
    private String referenceNumber;
    private int productSubCategoryId;
    private int productGroupId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public int getProductSubCategoryId() {
        return productSubCategoryId;
    }

    public void setProductSubCategoryId(int productSubCategoryId) {
        this.productSubCategoryId = productSubCategoryId;
    }

    public int getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(int productGroupId) {
        this.productGroupId = productGroupId;
    }
}
