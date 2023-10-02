package dbEntity.rfq;

import dbEntity.color.Color;
import dbEntity.measurement.Size;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table( name = "quotations" )
@IdClass( QuotationsId.class )
public class Quotations {

    @Id
    @Column( name = "size" )
    private Size size;

    @Column( name = "quantity" )
    private Integer quantity;

    @Column( name = "buyer_price" )
    private BigDecimal buyerPrice;

    @Column( name = "factory_price" )
    private BigDecimal factoryPrice;

    @Transient
    private Long colorId;

    @Id
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "color_id", foreignKey = @ForeignKey( name = "fk_rfq_color_size_quantity_price_color_id" ) )
    private Color color;

    @Id
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn( name = "product_info_for_rfq_id", foreignKey = @ForeignKey( name = "fk_rfq_color_size_quantity_price_rfq_id" ) )
    private ProductInfoForRfq productInfoForRfq;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quotations that = (Quotations) o;
        return Objects.equals( size, that.size ) && Objects.equals( color.getId(), that.color.getId() )
                && Objects.equals( productInfoForRfq.getId(), that.productInfoForRfq.getId() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( size, color.getId(), productInfoForRfq.getId() );
    }
}
