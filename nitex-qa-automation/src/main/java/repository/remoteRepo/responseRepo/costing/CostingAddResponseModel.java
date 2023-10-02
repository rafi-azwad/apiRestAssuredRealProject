package repository.remoteRepo.responseRepo.costing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CostingAddResponseModel {


    /**
     * success : true
     * message : Costing updated successfully
     * payload : {"id":29304,"baseSize":"l","incoterms":"FOB","moq":500,"fabricUnitCost":1,"trimsCost":1.1,"accessoriesCost":1.5,"washCost":1.3,"embellishmentCost":2.2,"commercialCost":1.7,"cmCost":0.4,"testingCost":0.6,"allowanceType":"AMOUNT","allowance":1.8,"totalCost":8.3859786,"remarks":"test","priceLastModifiedAt":"2023-06-14T07:16:25","priceLastModifiedBy":"Hussain Mahdi","variation":"Single jersey, 100% Viscose, 200 GSM ","isQuoted":true}
     */

    private boolean success;
    private String message;
    private PayloadBean payload;

    @Data
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
         * priceLastModifiedAt : 2023-06-14T07:16:25
         * priceLastModifiedBy : Hussain Mahdi
         * variation : Single jersey, 100% Viscose, 200 GSM
         * isQuoted : true
         */

        private int id;
        private String baseSize;
        private String incoterms;
        private Integer moq;
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
    }
}
