package dbEntity.color;

import dbEntity.document.Document;
import dbEntity.product.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

import java.util.Objects;

@Data
@Entity
@Table( name ="color" )
@ToString( exclude = { "product", "pantoneColor", "swatchDocument", "compositeColorJson" } )
public class Color implements Cloneable{

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "color_sequence_generator")
    @SequenceGenerator( name="color_sequence_generator", sequenceName = "color_sequence", initialValue = 1 )
    @Column( name = "id" )
    private Long id;

    @NotNull
    @Column( name = "name", length = 100 )
    private String name;

    @Column( name = "represented_by" )
    private RepresentedBy representedBy = RepresentedBy.PANTONE_OR_HEX_CODE;

    @Column( name = "type" )
    private ColorType colorType = ColorType.SOLID;

    @Column( name = "code", length = 100 )
    private String code;

    @Column( name = "quantity" )
    private Integer quantity;

    @Column( name = "hex_code", length = 10 )
    private String hexCode;

    @Column( name = "composite_color_json", length = 2500 )
    private String compositeColorJson;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "pantone_color_id", foreignKey = @ForeignKey( name = "color_pantone_color_id_fk" ) )
    private PantoneColor pantoneColor;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "color_product_id_fk" ) )
    private Product product;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "swatch_doc_id", foreignKey = @ForeignKey( name = "color_swatch_doc_id" ) )
    private Document swatchDocument;

    public enum RepresentedBy {
        PANTONE_OR_HEX_CODE( 0 ),
        SWATCH(1 );

        private Integer value;

        RepresentedBy( Integer value ){
            this.value = value;
        }
    }

    public enum ColorType {
        SOLID(0),
        MULTI(1),
        AOP(2),
        YARN_DYED(3),
        RFD( 4 );

        private Integer value;

        ColorType( Integer value ){
            this.value = value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Color that = ( Color ) o;
        return id != null && id.equals( that.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }
}
