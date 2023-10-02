package dbEntity.materials;

import dbEntity.category.Category;
import dbEntity.product.ProductGroup;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "garments" )
public class Garments implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "garments_id_generator" )
    @SequenceGenerator( name = "garments_id_generator", sequenceName = "garments_id_sequence" )
    @Column( name = "id" )
    private Long id;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "market_id", foreignKey = @ForeignKey( name = "fk_garments_market_id" ) )
    private ProductGroup market;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "category_id", foreignKey = @ForeignKey( name = "fk_garments_category_id" ) )
    private Category category;

    @Override
    public Garments clone() {

        Garments garments = new Garments();
        garments.setMarket( this.market );
        garments.setCategory( this.category );
        return garments;
    }
}
