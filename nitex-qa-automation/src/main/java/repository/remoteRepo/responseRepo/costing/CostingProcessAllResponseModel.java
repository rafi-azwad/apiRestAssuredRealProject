package repository.remoteRepo.responseRepo.costing;

import java.io.Serializable;

public class CostingProcessAllResponseModel {


    /**
     * success : true
     * message : Costing updated successfully
     * payload : {"id":29304,"baseSize":"l","incoterms":"FOB","moq":500,"fabricUnitCost":1,"trimsCost":1.1,"accessoriesCost":1.5,"washCost":1.3,"embellishmentCost":2.2,"commercialCost":1.7,"cmCost":0.4,"testingCost":0.6,"allowanceType":"AMOUNT","allowance":1.8,"totalCost":8.3859786,"remarks":"test","priceLastModifiedAt":"2023-06-12T06:20:45","priceLastModifiedBy":"Richard Shackleton","variation":"Single jersey, 100% Viscose, 200 GSM ","isQuoted":true}
     */

    private boolean success;
    private String message;
    private PayloadBean payload;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PayloadBean getPayload() {
        return payload;
    }

    public void setPayload(PayloadBean payload) {
        this.payload = payload;
    }

    public static class PayloadBean implements Serializable {
        /**
         * id : 29304
         * baseSize : l
         * incoterms : FOB
         * moq : 500
         * fabricUnitCost : 1.0
         * trimsCost : 1.1
         * accessoriesCost : 1.5
         * washCost : 1.3
         * embellishmentCost : 2.2
         * commercialCost : 1.7
         * cmCost : 0.4
         * testingCost : 0.6
         * allowanceType : AMOUNT
         * allowance : 1.8
         * totalCost : 8.3859786
         * remarks : test
         * priceLastModifiedAt : 2023-06-12T06:20:45
         * priceLastModifiedBy : Richard Shackleton
         * variation : Single jersey, 100% Viscose, 200 GSM
         * isQuoted : true
         */

        private int id;
        private String baseSize;
        private String incoterms;
        private int moq;
        private double fabricUnitCost;
        private double trimsCost;
        private double accessoriesCost;
        private double washCost;
        private double embellishmentCost;
        private double commercialCost;
        private double cmCost;
        private double testingCost;
        private String allowanceType;
        private double allowance;
        private double totalCost;
        private String remarks;
        private String priceLastModifiedAt;
        private String priceLastModifiedBy;
        private String variation;
        private boolean isQuoted;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getBaseSize() {
            return baseSize;
        }

        public void setBaseSize(String baseSize) {
            this.baseSize = baseSize;
        }

        public String getIncoterms() {
            return incoterms;
        }

        public void setIncoterms(String incoterms) {
            this.incoterms = incoterms;
        }

        public int getMoq() {
            return moq;
        }

        public void setMoq(int moq) {
            this.moq = moq;
        }

        public double getFabricUnitCost() {
            return fabricUnitCost;
        }

        public void setFabricUnitCost(double fabricUnitCost) {
            this.fabricUnitCost = fabricUnitCost;
        }

        public double getTrimsCost() {
            return trimsCost;
        }

        public void setTrimsCost(double trimsCost) {
            this.trimsCost = trimsCost;
        }

        public double getAccessoriesCost() {
            return accessoriesCost;
        }

        public void setAccessoriesCost(double accessoriesCost) {
            this.accessoriesCost = accessoriesCost;
        }

        public double getWashCost() {
            return washCost;
        }

        public void setWashCost(double washCost) {
            this.washCost = washCost;
        }

        public double getEmbellishmentCost() {
            return embellishmentCost;
        }

        public void setEmbellishmentCost(double embellishmentCost) {
            this.embellishmentCost = embellishmentCost;
        }

        public double getCommercialCost() {
            return commercialCost;
        }

        public void setCommercialCost(double commercialCost) {
            this.commercialCost = commercialCost;
        }

        public double getCmCost() {
            return cmCost;
        }

        public void setCmCost(double cmCost) {
            this.cmCost = cmCost;
        }

        public double getTestingCost() {
            return testingCost;
        }

        public void setTestingCost(double testingCost) {
            this.testingCost = testingCost;
        }

        public String getAllowanceType() {
            return allowanceType;
        }

        public void setAllowanceType(String allowanceType) {
            this.allowanceType = allowanceType;
        }

        public double getAllowance() {
            return allowance;
        }

        public void setAllowance(double allowance) {
            this.allowance = allowance;
        }

        public double getTotalCost() {
            return totalCost;
        }

        public void setTotalCost(double totalCost) {
            this.totalCost = totalCost;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public String getPriceLastModifiedAt() {
            return priceLastModifiedAt;
        }

        public void setPriceLastModifiedAt(String priceLastModifiedAt) {
            this.priceLastModifiedAt = priceLastModifiedAt;
        }

        public String getPriceLastModifiedBy() {
            return priceLastModifiedBy;
        }

        public void setPriceLastModifiedBy(String priceLastModifiedBy) {
            this.priceLastModifiedBy = priceLastModifiedBy;
        }

        public String getVariation() {
            return variation;
        }

        public void setVariation(String variation) {
            this.variation = variation;
        }

        public boolean isIsQuoted() {
            return isQuoted;
        }

        public void setIsQuoted(boolean isQuoted) {
            this.isQuoted = isQuoted;
        }
    }
}
