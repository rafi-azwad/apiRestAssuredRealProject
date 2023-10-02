package repository.remoteRepo.requestRepo.costing;

public class CostingPutUpdateRequestModel {


    /**
     * itemId : 15354
     * variant : Single jersey, 100% Viscose, 200 GSM
     */

    private int itemId;
    private String variant;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }
}
