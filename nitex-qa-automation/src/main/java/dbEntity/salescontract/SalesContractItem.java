package dbEntity.salescontract;

import dbEntity.audit.AuditableEntity;
import dbEntity.payment.InvoiceItemType;
import dbEntity.rfq.ProductInfoForRfq;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

@Data
@Entity
@Table( name = "sales_contract_item" )
public class SalesContractItem extends AuditableEntity implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "sales_contract_item_sequence_generator" )
    @SequenceGenerator( name = "sales_contract_item_sequence_generator", sequenceName = "sales_contract_item_sequence" )
    private Long id;

    @Column( name = "item_type" )
    private InvoiceItemType itemType;

    @Column( name = "colors", length = 1000 )
    private String colors;

    @Column( name = "sizes", length = 1000 )
    private String sizes;

    @Column( name = "item_name", length = 1000 )
    private String itemName;

    @Column( name = "unit_price" )
    private BigDecimal unitPrice;

    @Column( name = "quantity" )
    private Integer quantity;

    @Column( name = "total_price", nullable = false )
    private BigDecimal totalPrice;

    @Column( name = "merged_from_sc_id" )
    private Long mergedFromSCId;

    @Column( name = "merged_from_order_id" )
    private Long mergedFromOrderId;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "product_info_for_rfq_id", foreignKey = @ForeignKey( name = "fk_sales_contract_item_rfq_id") )
    private ProductInfoForRfq productInfoForRfq;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "supplier_quote_id", foreignKey = @ForeignKey( name = "fk_sales_contract_item_supplier_quote_id") )
    private SupplierQuote supplierQuote;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "sales_contract_id", foreignKey = @ForeignKey( name = "fk_sales_contract_item_sales_contract_id" ) )
    private SalesContract salesContract;

    public SalesContractItem clone() {
        SalesContractItem salesContractItem = new SalesContractItem();
        BeanUtils.copyProperties( this, salesContractItem );
        salesContractItem.setId( null );
        salesContractItem.setSalesContract( null );
        return salesContractItem;
    }
}
