package dbEntity.costing;

import dbEntity.audit.AuditableEntity;
import dbEntity.collection.Collection;
import dbEntity.product.Product;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table( name = "costing_sheet" )
public class CostingSheet extends AuditableEntity implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "costing_sheet_sequence_generator" )
    @SequenceGenerator( name = "costing_sheet_sequence_generator", sequenceName = "costing_sheet_sequence" )
    private Long id;

    @Column( name = "lead_time" )
    private Integer leadTime;

    @Column( name = "fabric_details", length = 2000 )
    private String fabricDetails;

    @Column( name = "remarks", length = 2000 )
    private String remarks;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "fk_costing_sheet_product_id" ) )
    private Product product;

    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "collection_id", foreignKey = @ForeignKey( name = "fk_costing_sheet_collection_id" ) )
    private Collection collection;

    @EqualsAndHashCode.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "costingSheet", cascade = CascadeType.ALL )
    private List<QuantityWiseCostingSheetPrice> quantityWiseCostingSheetPriceList = new ArrayList<>();

    public CostingSheet clone() {

        CostingSheet costingSheet = new CostingSheet();
        BeanUtils.copyProperties( this, costingSheet );
        costingSheet.setId( null );
        costingSheet.setQuantityWiseCostingSheetPriceList( new ArrayList<>() );
        return costingSheet;
    }
}
