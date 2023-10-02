package dbEntity.payment;

import dbEntity.salescontract.SalesContract;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table( name = "terms_and_conditions" )
public class TermsAndConditions implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "term_and_condition_sequence_generator" )
    @SequenceGenerator( name = "term_and_condition_sequence_generator", sequenceName = "term_and_condition_sequence", initialValue = 51 )
    private Long id;

    @Column( name = "term", length = 500 )
    private String term;

    @Column( name = "term_details", length = 2500 )
    private String termDetails;

    @Column( name = "sequence" )
    private Integer sequence;

    @Column( name = "payment_document_type" )
    private PaymentDocumentType paymentDocumentType;

    @Column( name = "is_library_term" )
    private Boolean isLibraryTerm = false;

    @Column( name = "is_deleted" )
    private Boolean isDeleted = false;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "invoice_id", foreignKey = @ForeignKey( name = "fk_invoice_item_invoice_id" ) )
    private Invoice invoice;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "sales_contract_id", foreignKey = @ForeignKey( name = "fk_terms_and_conditions_sales_contract_id" ) )
    private SalesContract salesContract;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TermsAndConditions that = (TermsAndConditions) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash( id );
    }

    @Override
    protected TermsAndConditions clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException( "Do not use this method to clone this class" );
    }

    private TermsAndConditions clone( String shippingCountry, String deliveryDate, String expiryDate ) {

        if ( shippingCountry == null )
            shippingCountry = "";

        String termDetailsWithValue = this.termDetails.replace( "__SHIPMENT_COUNTRY__", shippingCountry );

        if ( deliveryDate != null )
            termDetailsWithValue = termDetailsWithValue.replace( "__SHIPMENT_DATE__", deliveryDate );

        if ( expiryDate != null )
            termDetailsWithValue = termDetailsWithValue.replace( "__EXPIRY_DATE__", expiryDate );


        TermsAndConditions termsAndConditions = new TermsAndConditions();
        termsAndConditions.setTerm( this.term );

        termsAndConditions.setTermDetails( termDetailsWithValue );
        termsAndConditions.setIsLibraryTerm( false );
        termsAndConditions.setIsDeleted( false );
        termsAndConditions.setId( null );
        return termsAndConditions;
    }

    public TermsAndConditions clone( Invoice invoice, String deliveryDate, String shippingCountry ) {
        TermsAndConditions clonedObject = this.clone( shippingCountry, deliveryDate,  null );
        clonedObject.setPaymentDocumentType( PaymentDocumentType.PROFORMA_INVOICE );
        clonedObject.setInvoice( invoice );
        return clonedObject;
    }

    public TermsAndConditions clone( SalesContract salesContract, String shippingCountry, String expiryDate ) {
        TermsAndConditions clonedObject = this.clone( shippingCountry, null, expiryDate );
        clonedObject.setPaymentDocumentType( PaymentDocumentType.SALES_CONTRACT );
        clonedObject.setSalesContract( salesContract );
        return clonedObject;
    }
}
