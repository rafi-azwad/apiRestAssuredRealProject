package dbEntity.sample;

import dbEntity.color.Color;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "sample_item_details",
        indexes = @Index( name="index__sample_item_details__sample_item_id", columnList = "sample_item_id" )
)
public class SampleItemDetails {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "sample_item_activity_sequence_generator" )
    @SequenceGenerator( name = "sample_item_activity_sequence_generator", sequenceName = "sample_item_activity_sequence" )
    private Long id;

    @Column( name = "size" )
    private String size;

    @Column( name = "quantity" )
    private Integer quantity;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "color_id", foreignKey = @ForeignKey( name = "fk_sample_item_activity_color_id" ) )
    private Color color;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "sample_item_id", foreignKey = @ForeignKey( name = "fk_sample_item_activity_sample_item_id" ) )
    private SampleItem sampleItem;

    public SampleItemDetails( SampleItem sampleItem ){
        this.sampleItem = sampleItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleItemDetails that = (SampleItemDetails) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return Objects.hash( size, quantity, color );
        return Objects.hash(id);
    }

    public SampleItemDetails clone( SampleItem sampleItem ) {
        SampleItemDetails sampleItemDetails = new SampleItemDetails();
        BeanUtils.copyProperties( this, sampleItemDetails );
        sampleItemDetails.setId( null );
        sampleItemDetails.setSampleItem( sampleItem );
        return sampleItemDetails;
    }
}
