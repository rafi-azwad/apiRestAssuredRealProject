package repository.dbModel.collection;

public class CollectionDbModel {
    private String name;
    private String ownerName;
    private int brand_id;
    private int season;

    private int id;

    private String email;


    private String ref;
    private String construction;


    private String designation;


    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }
    public int getBrand_id() {

        return brand_id;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
