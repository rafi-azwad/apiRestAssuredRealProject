package dbEntity.brand;

import dbEntity.audit.AuditableEntity;
import dbEntity.document.Document;
import dbEntity.supplier.CertificateType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Hibernate;

import java.time.LocalDate;
import java.util.Objects;

@Data
@Entity
@Table( name = "brand_certificate" )
public class BrandCertificate extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "brand_certificate_sequence_generator" )
    @SequenceGenerator( name = "brand_certificate_sequence_generator", sequenceName = "brand_certificate_sequence" )
    private Long id;

    @Column( name = "type" )
    private CertificateType type;

    @Column( name = "expiry_date" )
    private LocalDate expiryDate;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_brand_certificate_brand_id" ) )
    private Brand brand;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "document_id", foreignKey = @ForeignKey( name = "fk_brand_certificate_document_id" ) )
    private Document document;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BrandCertificate that = (BrandCertificate) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }
}
