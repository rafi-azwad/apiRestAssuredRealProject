package repository.dbModel.designedit;

public class DesignDbModel {

    String name;
    String ref_Num;
    String construction;
    String artBoardName;

    int product_Id;

    int brand_Id;

    String artBoardName_2;

    int cat_id;

    String tags;

    String text;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public int getBrand_Id() {
        return brand_Id;
    }

    public void setBrand_Id(int brand_Id) {
        this.brand_Id = brand_Id;
    }

    public String getArtBoardName_2() {
        return artBoardName_2;
    }

    public void setArtBoardName_2(String artBoardName_2) {
        this.artBoardName_2 = artBoardName_2;
    }

    public int getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(int product_Id) {
        this.product_Id = product_Id;
    }

    public String getArtBoardName() {
        return artBoardName;
    }

    public void setArtBoardName(String artBoardName) {
        this.artBoardName = artBoardName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef_Num() {
        return ref_Num;
    }

    public void setRef_Num(String ref_Num) {
        this.ref_Num = ref_Num;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }


}
