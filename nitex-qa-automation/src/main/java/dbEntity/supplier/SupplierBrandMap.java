package dbEntity.supplier;


import dbEntity.audit.AuditableEntity;
import dbEntity.brand.Brand;
import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors( chain = true )
@Entity
@Table( name = "supplier_brand_map" )
public class SupplierBrandMap extends AuditableEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "supplier_brand_map_sequence_generator" )
    @SequenceGenerator( name = "supplier_brand_map_sequence_generator", sequenceName = "supplier_brand_map_sequence" )
    private Long id;

    @Column( name = "is_nominated" )
    private Boolean isNominated;

    @Column( name = "is_deletable" )
    private Boolean isDeletable;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_supplier_brand_map_supplier_id" ) )
    private Supplier supplier;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_supplier_brand_map_brand_id" ) )
    private Brand brand;

}
