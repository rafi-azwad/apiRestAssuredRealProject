package dbEntity.costing;

import dbEntity.audit.AuditableEntity;
import dbEntity.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "quote_item" ,
        indexes = @Index( name="index__quote_item__quote_request_id", columnList = "quote_request_id" )
)
public class QuoteItem extends AuditableEntity {

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "quote_item_sequence_generator" )
    @SequenceGenerator( name = "quote_item_sequence_generator", sequenceName = "quote_item_sequence" )
    private Long id;

    @Column( name = "required_date" )
    private LocalDate requiredDate;

    @Column( name = "variation" )
    private String variation;

    @Column( name = "is_cloned", columnDefinition = "boolean default false" )
    private Boolean isCloned = false;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "fk_quote_item_product_id" ) )
    private Product product;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "quote_request_id", foreignKey = @ForeignKey( name = "fk_quote_item_quote_request_id" ) )
    private QuoteRequest quoteRequest;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "initial_costing_id", foreignKey = @ForeignKey( name = "fk_quote_item_initial_costing_id" ) )
    private InitialCosting initialCosting;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuoteItem that = (QuoteItem) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return product.hashCode();
        return Objects.hash(id);
    }

    public QuoteItem( QuoteRequest quoteRequest , Product product ) {
        this.quoteRequest = quoteRequest;
        this.product = product;
    }

}
