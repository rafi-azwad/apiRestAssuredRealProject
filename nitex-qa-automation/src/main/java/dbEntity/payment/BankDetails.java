package dbEntity.payment;

import dbEntity.audit.AuditableEntity;
import dbEntity.brand.Brand;
import dbEntity.supplier.Supplier;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@Table( name = "bank_details" )
public class BankDetails extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "bank_details_sequence_generator" )
    @SequenceGenerator( name = "bank_details_sequence_generator", sequenceName = "bank_details_sequence" )
    private Long id;

    @Column( name = "title" )
    private String title;

    @Column( name = "account_name" )
    private String name;

    @Column( name = "account_number" )
    private String accountNumber;

    @Column( name = "bank_name" )
    private String bankName;

    @Column( name = "swift_code" )
    private String swiftCode;

    @Column( name = "bank_details", length = 2500 )
    private String bankDetails;

    @Column( name = "is_nitex_bank_details" )
    private Boolean isNitexBankDetails = false;

    @Column( name = "is_default" )
    private Boolean isDefault;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_bank_details_supplier_id" ) )
    private Supplier supplier;


    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_bank_details_brand_id" ) )
    private Brand brand;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BankDetails that = (BankDetails) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }

    public BankDetails cloneInfo() {
        BankDetails bankDetails = new BankDetails();
        BeanUtils.copyProperties( this, bankDetails );
        bankDetails.setSupplier( null );
        bankDetails.setBrand( null );
        return bankDetails;
    }
}
