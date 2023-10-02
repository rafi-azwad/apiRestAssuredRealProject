package repository.remoteRepo.requestRepo.costing;

public class CostingProcessAllRequestModel {


    /**
     * allCostsAsString : 1,1.1,2.2,1.3,0.4,1.5,0.6,1.7,1.8
     * initialCostingId : 29304
     */

    private String allCostsAsString;
    private int initialCostingId;

    public String getAllCostsAsString() {
        return allCostsAsString;
    }

    public void setAllCostsAsString(String allCostsAsString) {
        this.allCostsAsString = allCostsAsString;
    }

    public int getInitialCostingId() {
        return initialCostingId;
    }

    public void setInitialCostingId(int initialCostingId) {
        this.initialCostingId = initialCostingId;
    }
}
