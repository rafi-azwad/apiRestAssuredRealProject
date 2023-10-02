package repository.remoteRepo.requestRepo.collection;

import java.io.Serializable;
import java.util.List;

public class CollectionPostQuoteReqRequestModel {


    private List<QuoteItemRequestBean> quoteItemRequest;

    public List<QuoteItemRequestBean> getQuoteItemRequest() {
        return quoteItemRequest;
    }

    public void setQuoteItemRequest(List<QuoteItemRequestBean> quoteItemRequest) {
        this.quoteItemRequest = quoteItemRequest;
    }

    public static class QuoteItemRequestBean implements Serializable {
        /**
         * productId : 42460
         * requiredDate : 2023-05-16
         * quantity : 500,1000
         */

        private int productId;
        private String requiredDate;
        private String quantity;

        public int getProductId(int productID) {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public String getRequiredDate() {
            return requiredDate;
        }

        public void setRequiredDate(String requiredDate) {
            this.requiredDate = requiredDate;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }
    }
}
