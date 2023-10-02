package dbEntity.salescontract;

import dbEntity.order.Order;
import dbEntity.product.Product;
import dbEntity.rfq.ProductInfoForRfq;
import dbEntity.supplier.Supplier;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table( name = "supplier_quote_supplier_map" )
public class SupplierQuoteSupplierMap {

    @Id
    private Long id;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_info_for_rfq_id", referencedColumnName = "id",
            foreignKey = @ForeignKey( name = "fk_supplier_quote_product_info_for_rfq_id" ) )
    private ProductInfoForRfq productInfoForRfq;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "fk_supplier_quote_product_id" ) )
    private Product product;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_supplier_quote_supplier_id" ) )
    private Supplier supplier;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "order_id", foreignKey = @ForeignKey( name = "fk_supplier_quote_order_id" ) )
    private Order order;
}
