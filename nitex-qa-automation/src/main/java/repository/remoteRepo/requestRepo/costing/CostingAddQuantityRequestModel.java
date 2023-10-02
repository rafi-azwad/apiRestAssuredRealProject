package repository.remoteRepo.requestRepo.costing;

public class CostingAddQuantityRequestModel {


    /**
     * id : null
     * minQuantity : 1000
     * price : 8.20
     * initialCostingId : 29304
     */

    private String id;
    private String minQuantity;
    private String price;
    private int initialCostingId;

    public String getId(String id) {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(String minQuantity) {
        this.minQuantity = minQuantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getInitialCostingId() {
        return initialCostingId;
    }

    public void setInitialCostingId(int initialCostingId) {
        this.initialCostingId = initialCostingId;
    }
}
