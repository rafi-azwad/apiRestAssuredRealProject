package repository.remoteRepo.responseRepo.designedit;

public class DgnGetProMeasureResponseModel {


    /**
     * id : 1
     * name : Standard
     * isDeleted : false
     * brandId : 1
     */

    private int id;
    private String name;
    private boolean isDeleted;
    private int brandId;

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

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }
}
