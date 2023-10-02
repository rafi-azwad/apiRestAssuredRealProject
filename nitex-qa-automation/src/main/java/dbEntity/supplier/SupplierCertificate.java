package dbEntity.supplier;

import dbEntity.audit.AuditableEntity;
import dbEntity.document.Document;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table( name = "supplier_certificate" )
public class SupplierCertificate extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "supplier_certificate_sequence_generator" )
    @SequenceGenerator( name = "supplier_certificate_sequence_generator", sequenceName = "supplier_certificate_sequence" )
    private Long id;

    @Column( name = "type" )
    private CertificateType type;

    @Column( name = "expiry_date" )
    private LocalDate expiryDate;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_supplier_certificate_supplier_id" ) )
    private Supplier supplier;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "document_id", foreignKey = @ForeignKey( name = "fk_supplier_certificate_document_id" ) )
    private Document document;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "badge_document_id", foreignKey = @ForeignKey( name = "fk_supplier_certificate_badge_document_id" ) )
    private Document badge;
}
