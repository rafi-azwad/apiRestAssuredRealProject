package repository.remoteRepo.requestRepo.costing;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CostingAddRequestModel {


    /**
     * id : 29304
     * fabricUnitCost : 1
     * totalCost : 500
     * moq : 1
     * baseSize : l
     * initialCostingId : 29304
     */

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getFabricUnitCost() {
        return fabricUnitCost;
    }

    public void setFabricUnitCost(Double fabricUnitCost) {
        this.fabricUnitCost = fabricUnitCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getMoq() {
        return moq;
    }

    public void setMoq(Integer moq) {
        this.moq = moq;
    }

    public String getBaseSize() {
        return baseSize;
    }

    public void setBaseSize(String baseSize) {
        this.baseSize = baseSize;
    }

    private Double fabricUnitCost;
    private Double totalCost;
    private Integer moq;
    private String baseSize;

    public Long getInitialCostingId() {
        return initialCostingId;
    }

    public void setInitialCostingId(Long initialCostingId) {
        this.initialCostingId = initialCostingId;
    }

    private Long initialCostingId;


}
