package dbEntity.materials;

import dbEntity.enums.PriceRange;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table( name = "fabric_details" )
public class FabricDetails implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "fabric_id_generator" )
    @SequenceGenerator( name = "fabric_id_generator", sequenceName = "fabric_id_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "fabric_type" )
    private FabricType fabricType;

    @Column( name = "gsm" )
    private Double gsm;

    @Column( name = "cuttable_width" )
    private String cuttableWidth;

    @Column( name = "construction" )
    private String construction;

    @Column( name = "construction_details" )
    private String constructionDetails;

    @Column( name = "yarn_count" )
    private String yarnCount;

    @Column( name = "gauge" )
    private String gauge;

    @Column( name = "ounce" )
    private String ounce;

    @Column( name = "fabric_base" )
    private FabricBase fabricBase;

    @Column( name = "price_point" )
    private PriceRange pricePoint;

    @Column( name = "fabric_formula" )
    private String fabricFormula;

    @Column( name = "fabric_composition_part_id_json" )
    private String fabricCompositionPartIdJson;

    @ManyToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinTable(
            name = "material_fiber_composition_part_map",
            joinColumns = @JoinColumn( name = "fabric_details_id"),
            inverseJoinColumns = @JoinColumn( name = "fiber_composition_part_id" ),
            foreignKey = @ForeignKey( name = "fk_material_fiber_composition_part_map_fabric_details_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_material_fiber_composition_part_map_fiber_composition_part_id" ) )
    private List<FabricCompositionPart> fabricCompositionParts = new ArrayList<>();

    @Override
    public FabricDetails clone() {

        FabricDetails fabricDetails = new FabricDetails();
        BeanUtils.copyProperties( this, fabricDetails );
        fabricDetails.setId( null );
        fabricDetails.setFabricCompositionParts( new ArrayList<>( this.fabricCompositionParts ) );
        return fabricDetails;
    }
}
