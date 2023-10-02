package dbEntity.bltracking;

import dbEntity.document.Document;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table( name = "bl_payment" )
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "bl_payment_type" )
@Data
public class BLPayment {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "bl_payment_sequence_generator")
    @SequenceGenerator( name="bl_payment_sequence_generator", sequenceName = "bl_payment_sequence", initialValue = 1 )
    @Column( name = "id" )
    private Long id;

    @Column( name = "commercial_invoice_amount", nullable = false )
    private BigDecimal commercialInvoiceAmount = BigDecimal.ZERO;

    @Column( name = "actual_payment" )
    private BigDecimal actualPayment = BigDecimal.ZERO;

    @Column( name = "claim" )
    private BigDecimal claim = BigDecimal.ZERO;

    @Column( name = "actual_payment_date" )
    private LocalDate actualPaymentDate;

    @Column( name = "remarks" )
    private String remarks;

    @OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST , CascadeType.MERGE } )
    @JoinTable(
            name = "bl_payment_document_map",
            joinColumns = @JoinColumn( name = "bl_payment_id" ),
            inverseJoinColumns = @JoinColumn( name = "document_id" ),
            foreignKey = @ForeignKey( name = "fk_bl_payment_document_map_bl_payment_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_bl_payment_document_map_document_id") )
    @ToString.Exclude
    private Set<Document> documents;


}
