package dbEntity.commercialinvoice;

import dbEntity.document.Document;
import dbEntity.enums.Status;
import dbEntity.order.Order;
import dbEntity.salescontract.SalesContract;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "commercial_invoice" )
public class CommercialInvoice {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "commercial_invoice_sequence_generator" )
    @SequenceGenerator( name = "commercial_invoice_sequence_generator", sequenceName = "commercial_invoice_sequence", initialValue = 1 )
    @Column( name = "id" )
    private Long id;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST , CascadeType.MERGE } )
    @JoinColumn( name = "order_id", foreignKey = @ForeignKey( name = "fk_commercial_invoice_order_id" ) )
    @ToString.Exclude
    private Order order;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST , CascadeType.MERGE } )
    @JoinColumn( name = "sales_contract_id", foreignKey = @ForeignKey(name = "fk_commercial_invoice_sales_contract_id") )
    @ToString.Exclude
    private SalesContract salesContract;

    @OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL , orphanRemoval = true )
    @JoinTable(
            name = "commercial_invoice_document_map",
            joinColumns = @JoinColumn( name = "commercial_invoice_id" ),
            inverseJoinColumns = @JoinColumn( name = "document_id" ),
            foreignKey = @ForeignKey( name = "fk_commercial_invoice_document_map_commercial_invoice_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_commercial_invoice_document_map_document_id") )
    @ToString.Exclude
    private Set<Document> documents;

    @OneToMany( fetch = FetchType.LAZY ,mappedBy = "commercialInvoice" , cascade = CascadeType.ALL , orphanRemoval = true)
    @ToString.Exclude
    private Set<CommercialInvoiceProduct>  commercialInvoiceProducts = new HashSet<>();


}
