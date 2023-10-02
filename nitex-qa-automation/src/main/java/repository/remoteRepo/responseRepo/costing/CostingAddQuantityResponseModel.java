package repository.remoteRepo.responseRepo.costing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CostingAddQuantityResponseModel {


    /**
     * success : true
     * message : Quantity wise price updated successfully
     * payload : {"quantityWiseInitialCostingResponseList":[{"id":27055,"minQuantity":500,"price":1},{"id":27056,"minQuantity":1000,"price":8.2},{"id":27422,"minQuantity":1000,"price":8.2},{"id":27423,"minQuantity":1000,"price":8.2},{"id":27424,"minQuantity":1000,"price":8.2}]}
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
        private List<QuantityWiseInitialCostingResponseListBean> quantityWiseInitialCostingResponseList;

        public List<QuantityWiseInitialCostingResponseListBean> getQuantityWiseInitialCostingResponseList() {
            return quantityWiseInitialCostingResponseList;
        }

        public void setQuantityWiseInitialCostingResponseList(List<QuantityWiseInitialCostingResponseListBean> quantityWiseInitialCostingResponseList) {
            this.quantityWiseInitialCostingResponseList = quantityWiseInitialCostingResponseList;
        }

        public static class QuantityWiseInitialCostingResponseListBean implements Serializable {
            /**
             * id : 27055
             * minQuantity : 500
             * price : 1.0
             */

            private int id;
            private int minQuantity;
            private double price;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getMinQuantity() {
                return minQuantity;
            }

            public void setMinQuantity(int minQuantity) {
                this.minQuantity = minQuantity;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }
        }
    }
}
