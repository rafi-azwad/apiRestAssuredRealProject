package dbEntity.supplier;

import dbEntity.brand.Brand;
import dbEntity.materials.Material;
import dbEntity.materials.UnitType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table( name = "supplier_material_map" )
@IdClass( SupplierMaterialMapId.class )
public class SupplierMaterialMap {

    @Column( name = "price" )
    private Double price;

    @Column( name = "last_price_modified_at" )
    private LocalDateTime lastPriceModifiedAt;

    @Column( name = "price_per_unit" )
    private UnitType pricePerUnit;

    @Column( name = "moq" )
    private String moq;

    @Column( name = "moq_unit" )
    private UnitType moqUnit;

    @Column( name = "lead_time_in_days" )
    private Integer leadTimeInDays;

    @Column( name = "capacity" )
    private Double capacity;

    @Column( name = "capacity_unit" )
    private UnitType capacityUnit;

    @Min( 0 )
    @Max( 5 )
    @Column( name = "item_rating" )
    private Integer itemRating;

    @Column( name = "description" )
    private String description;

    @Column( name = "supplier_material_reference_number" )
    private String supplierMaterialReferenceNumber;

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_supplier_material_map_supplier_id" ) )
    private Supplier supplier;

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "material_id", foreignKey = @ForeignKey( name = "fk_supplier_material_map_material_id" ) )
    private Material material;

    @ToString.Exclude
    @ManyToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinTable(
            name = "supplier_material_brand_map",
            joinColumns =  {
                    @JoinColumn( name = "supplier_id", referencedColumnName = "supplier_id" ),
                    @JoinColumn( name = "material_id", referencedColumnName = "material_id" )
            },
            inverseJoinColumns = @JoinColumn( name = "brand_id" ),
            foreignKey = @ForeignKey( name = "fk_supplier_material_brand_map_supplier_id_material_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_supplier_material_brand_map_brand_id" ) )
    private Set<Brand> brandSet = new HashSet<>();

    @Override
    public int hashCode() {
        return Objects.hash( supplier.getId(), material.getId() );
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        SupplierMaterialMap that = ( SupplierMaterialMap ) o;
        return Objects.equals( supplier.getId(), that.supplier.getId() ) && Objects.equals( material.getId(), that.material.getId() );
    }
}
