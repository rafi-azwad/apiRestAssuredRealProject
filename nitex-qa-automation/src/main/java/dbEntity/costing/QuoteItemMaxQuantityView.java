package dbEntity.costing;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "quote_item_max_quantity_view" )
public class QuoteItemMaxQuantityView {
    @Id
    @Column( name = "id" )
    private Long quoteItemId;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "quote_item_id" )
    private QuoteItem quoteItem;

    @Column( name = "min_quantity" )
    private Long minQuantity;

    @Column( name = "price" )
    private Double price;
}
