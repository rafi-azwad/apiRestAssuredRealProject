package repository.dbModel.costing;

public class CostingDbModel {


    private String variation;
    private String req_by;
    private String designation;
    private Integer moq;
    private String fabricUnitCost;
    private String ref_number;
    private int status;

    private int collection_id;
    private String name;
    private int brand_id;

    private int season;

    private String remarks;

    private Integer minimum_quantity;
    private Double price;




    public String getReq_by() {
        return req_by;
    }

    public void setReq_by(String req_by) {
        this.req_by = req_by;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;


    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getMinimum_quantity() {
        return minimum_quantity;
    }

    public void setMinimum_quantity(Integer minimum_quantity) {
        this.minimum_quantity = minimum_quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public String getRef_number() {
        return ref_number;
    }

    public void setRef_number(String ref_number) {
        this.ref_number = ref_number;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(int collection_id) {
        this.collection_id = collection_id;
    }


    public String getFabricUnitCost() {
        return fabricUnitCost;
    }

    public void setFabricUnitCost(String fabricUnitCost) {
        this.fabricUnitCost = fabricUnitCost;
    }

    public Integer getMoq() {
        return moq;
    }

    public void setMoq(Integer moq) {
        this.moq = moq;
    }


    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }
}
