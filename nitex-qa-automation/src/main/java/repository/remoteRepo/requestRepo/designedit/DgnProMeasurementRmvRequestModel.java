package repository.remoteRepo.requestRepo.designedit;

public class DgnProMeasurementRmvRequestModel {


    /**
     * measurementUnit : CM
     * pointOfMeasurementId : 12903
     * productId : 61280
     */

    private String measurementUnit;
    private int pointOfMeasurementId;
    private String productId;

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public int getPointOfMeasurementId() {
        return pointOfMeasurementId;
    }

    public void setPointOfMeasurementId(int pointOfMeasurementId) {
        this.pointOfMeasurementId = pointOfMeasurementId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
