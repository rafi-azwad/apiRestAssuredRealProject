package dbEntity.order;

import dbEntity.audit.AuditableEntity;
import dbEntity.enums.Status;
import dbEntity.payment.PaymentDocumentType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.Objects;

@Data
@Entity
@Table( name = "order_payment_document_request" )
public class OrderPaymentDocumentRequest extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "order_payment_document_request_id_generator" )
    @SequenceGenerator( name = "order_payment_document_request_id_generator", sequenceName = "order_payment_document_request_id_sequence" )
    private Long id;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @Column( name = "document_type" )
    private PaymentDocumentType documentType;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "order_id", foreignKey = @ForeignKey( name = "fk_order_document_request_order_id" ) )
    private Order order;


    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || Hibernate.getClass( this ) != Hibernate.getClass( o ) ) return false;
        OrderPaymentDocumentRequest that = ( OrderPaymentDocumentRequest ) o;
        return Objects.equals( id, that.id );
    }

    @Override
    public int hashCode() {
        if ( this.id != null )
            return Objects.hash( this.id );
        return System.identityHashCode( this );
    }
}
