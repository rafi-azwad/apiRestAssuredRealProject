package dbEntity.commercialinvoice;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SalesContractWithSupplierQuoteId {
    private Long salesContractId;
    private Long quoteId;

    public SalesContractWithSupplierQuoteId( Long salesContractId, Long quoteId ){
        this.salesContractId = salesContractId;
        this.quoteId = quoteId;
    }
}
