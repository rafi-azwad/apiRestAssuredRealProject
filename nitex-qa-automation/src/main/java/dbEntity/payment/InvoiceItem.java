package dbEntity.payment;

import dbEntity.audit.AuditableEntity;
import dbEntity.rfq.ProductInfoForRfq;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

@Data
@Entity
@Table( name = "invoice_item" )
public class InvoiceItem extends AuditableEntity implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "invoice_item_id_sequence_generator" )
    @SequenceGenerator( name = "invoice_item_id_sequence_generator", sequenceName = "invoice_item_id_sequence" )
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

    @Column( name = "merged_from_invoice_id" )
    private Long mergedFromInvoiceId;

    @Column( name = "merged_from_order_id" )
    private Long mergedFromOrderId;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "rfq_id", foreignKey = @ForeignKey( name = "fk_invoice_item_rfq_id") )
    private ProductInfoForRfq productInfoForRfq;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "invoice_id", foreignKey = @ForeignKey( name = "fk_invoice_item_invoice_id" ) )
    private Invoice invoice;

    public InvoiceItem clone() {
        InvoiceItem invoiceItem = new InvoiceItem();
        BeanUtils.copyProperties( this, invoiceItem );
        invoiceItem.setId( null );
        invoiceItem.setInvoice( null );
        return invoiceItem;
    }
}
