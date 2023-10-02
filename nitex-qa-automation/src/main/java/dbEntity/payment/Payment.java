package dbEntity.payment;

import dbEntity.document.Document;
import dbEntity.enums.Status;
import dbEntity.order.PaymentTerms;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Data
@DynamicUpdate
@Entity( name = "payment" )
@Table( name = "payment" )
@ToString( exclude = { "paidBy", "invoice", "documentSet" } )
@EqualsAndHashCode( exclude = { "paidBy", "invoice", "documentSet" } )
public class Payment {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "payment_sequence_generator")
    @SequenceGenerator( name="payment_sequence_generator", sequenceName = "payment_sequence" )
    @Column( name ="id" )
    private Long id;

    @Column( name = "paid_at" )
    private Date paidAt;

    @Column( name = "amount" )
    private BigDecimal amount;

    @Column( name = "payment_terms" )
    private PaymentTerms paymentTerms;

    @Column( name = "payment_gateway" )
    private PaymentGateway paymentGateway;

    @Column( name = "gateway_transaction_id" )
    private String gatewayTransactionId;

    @Column( name = "payment_status" )
    private Status status;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "paid_by", foreignKey = @ForeignKey( name = "fk_payment_user" ) )
    private User paidBy;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "invoice_id", foreignKey = @ForeignKey( name = "payment_invoice_fk" ) )
    private Invoice invoice;

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(
            name = "payment_document_map",
            joinColumns = @JoinColumn( name = "payment_id" ),
            inverseJoinColumns = @JoinColumn( name = "document_id" ),
            foreignKey = @ForeignKey( name = "fk_payment_document"),
            inverseForeignKey = @ForeignKey( name = "fk_document_payment" ) )
    private Set<Document> documentSet;
}
