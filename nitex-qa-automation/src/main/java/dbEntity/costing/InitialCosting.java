package dbEntity.costing;

import dbEntity.rfq.PriceType;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table( name = "initial_costing" )
public class InitialCosting implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "initial_costing_id_generator" )
    @SequenceGenerator( name = "initial_costing_id_generator", sequenceName = "initial_costing_id_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "all_costs_as_string" )
    private String allCostsAsString;

    @Column( name = "base_size" )
    private String baseSize;

    @Column( name = "base_size_name" )
    private String baseSizeName;

    @Column( name = "incoterms" )
    private PriceType incoterms;

    @Column( name = "moq" )
    private Integer moq;

    @Column( name = "turn_around_time" )
    private Integer turnAroundTime;

    @Column( name = "fabric_unit_cost" )
    private Double fabricUnitCost;

    @Column( name = "trim_cost" )
    private Double trimsCost;

    @Column( name = "accessories_cost" )
    private Double accessoriesCost;

    @Column( name = "wash_cost" )
    private Double washCost;

    @Column( name = "embellishment_cost" )
    private Double embellishmentCost;

    @Column( name = "commercial_cost" )
    private Double commercialCost;

    @Column( name = "cm_cost" )
    private Double cmCost;

    @Column( name = "testing_cost" )
    private Double testingCost;

    @Column( name = "allowance_type" )
    private AllowanceType allowanceType;

    @Column( name = "allowance" )
    private Double allowance;

    @Column( name = "quantity_wise_price_allowance_type" )
    private AllowanceType quantityWisePriceAllowanceType;

    @Column( name = "quantity_wise_price_allowance" )
    private Double quantityWisePriceAllowance;

    @Column( name = "total_price" )
    private Double totalPrice;

    @Column( name = "remarks", columnDefinition = "TEXT" )
    private String remarks;

    @Column( name = "price_last_modified_at" )
    private LocalDateTime priceLastModifiedAt;

    @Column( name = "isQuoted", columnDefinition = "boolean default false")
    private Boolean isQuoted = false;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "price_last_modified_by", foreignKey = @ForeignKey( name = "price_last_modified_by_fk") )
    private User priceLastModifiedBy;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, mappedBy = "initialCosting", cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    private Set<QuantityWiseInitialCosting> quantityWiseInitialCostings = new HashSet<>();

    @Override
    public InitialCosting clone() {

        InitialCosting initialCosting = new InitialCosting();
        BeanUtils.copyProperties( this, initialCosting );
        initialCosting.setId( null );
        initialCosting.setQuantityWiseInitialCostings( new HashSet<>() );
        return initialCosting;
    }

    public boolean isQuoted() {
        boolean isQuoted = ( this.fabricUnitCost != null && this.trimsCost != null && this.cmCost != null && this.commercialCost != null ) ||
                ( this.totalPrice != null && this.totalPrice > 0.0 &&   this.fabricUnitCost == null &&  this.trimsCost == null
                && this.cmCost == null && commercialCost == null ) ;
        this.isQuoted = isQuoted;
        return isQuoted;
    }

    public boolean checkIsPriceBreakdownGiven() {
        Double totalCost = Arrays.asList( this.getCmCost(), this.getAccessoriesCost() , this.getEmbellishmentCost(),
                        this.getFabricUnitCost(), this.getWashCost(), this.getTrimsCost(), this.getTestingCost() )
                .stream()
                .filter( Objects::nonNull )
                .mapToDouble( ob -> ob )
                .sum();

        return totalCost > 0;
    }
}
