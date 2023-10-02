package dbEntity.materials;

import dbEntity.audit.AuditableEntity;
import dbEntity.color.Color;
import dbEntity.document.Document;
import dbEntity.supplier.FixedTag;
import dbEntity.supplier.FreeTextTag;
import dbEntity.supplier.SupplierMaterialMap;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Hibernate;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table( name = "material" )
@DynamicUpdate
public class Material extends AuditableEntity implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "material_id_generator" )
    @SequenceGenerator( name = "material_id_generator", sequenceName = "material_id_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "reference_number" )
    private String referenceNumber;
    
    @Column( name = "description", columnDefinition = "TEXT" )
    private String description;

    @Column( name = "composition" )
    private MaterialComposition composition;

    @Column( name = "composition_details" )
    private String compositionDetails;

    @Column( name = "type" )
    private MaterialType materialType;

    @Column( name = "season" )
    private Season season;

    @Column( name = "quantity" )
    private Double quantity;

    @Column( name = "quantity_unit" )
    private UnitType quantityUnit;

    @Column( name = "base_material_id" )
    private Long baseMaterialId;

    @Column( name = "stock_quantity", columnDefinition = "float8 default 0")
    private Double stockQuantity = 0D;

    @Column( name = "expired_stock_quantity", columnDefinition = "float8 default 0")
    private Double expiredStockQuantity = 0D;

    @Column( name = "last_received_date")
    private LocalDate lastReceivedDate;

    @Column( name = "rac_location_name")
    private String racLocationName;

    @Column( name = "is_library_material" )
    private Boolean isLibraryMaterial = false;

    @Column( name = "is_expired" )
    private Boolean isExpired = false;

    @Column( name = "is_deleted" )
    private Boolean isDeleted = false;

    @Column( name = "is_nitex_rnd", columnDefinition = "boolean default false"  )
    private Boolean isNitexRnd = false;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "fabric_id", foreignKey = @ForeignKey( name = "fk_material_fabric_id" ) )
    private FabricDetails fabricDetails;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "trims_id", foreignKey = @ForeignKey( name = "fk_material_trims_id" ) )
    private Trims trims;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "branding_id", foreignKey = @ForeignKey( name = "fk_material_branding_id" ) )
    private Branding branding;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "garments_id", foreignKey = @ForeignKey( name = "fk_material_garments_id" ) )
    private Garments garments;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "embellishment_id", foreignKey = @ForeignKey( name = "fk_material_embellishment_id" ) )
    private Embellishment embellishment;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "washing_id", foreignKey = @ForeignKey( name = "fk_material_washing_id" ) )
    private Washing washing;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "document_id", foreignKey = @ForeignKey( name = "fk_material_document_id" ) )
    private Document document;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "rac_location_id", foreignKey = @ForeignKey( name = "fk_material_rac_location_id" ) )
    private InventoryRACLocation racLocation;

    @ManyToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinTable(
            name = "material_document_map",
            joinColumns = @JoinColumn( name = "material_id"),
            inverseJoinColumns = @JoinColumn( name = "document_id" ),
            foreignKey = @ForeignKey( name = "fk_material_document_map_material_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_material_document_map_document_id" ) )
    private Set<Document> documentSet = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinTable(
            name = "material_tag_map",
            joinColumns = @JoinColumn( name = "material_id"),
            inverseJoinColumns = @JoinColumn( name = "tag_id" ),
            foreignKey = @ForeignKey( name = "fk_material_tag_map_material_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_material_tag_map_tag_id" ) )
    private Set<FreeTextTag> tagSet = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinTable(
            name = "material_fixed_tag_map",
            joinColumns = @JoinColumn( name = "material_id"),
            inverseJoinColumns = @JoinColumn( name = "fixed_tag_id" ),
            foreignKey = @ForeignKey( name = "fk_material_fixed_tag_map_material_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_material_fixed_tag_map_fixed_tag_id" ) )
    private Set<FixedTag> fixedTagSet = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinTable(
            name = "material_color_map",
            joinColumns = @JoinColumn( name = "material_id"),
            inverseJoinColumns = @JoinColumn( name = "color_id" ),
            foreignKey = @ForeignKey( name = "fk_material_color_map_material_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_material_color_map_color_id" ) )
    private Set<Color> colorSet = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "material" )
    private List<SupplierMaterialMap> supplierMaterialMapList;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "material" )
    private List<InventoryTransaction> inventoryTransactionList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Material material = (Material) o;
        return id != null && Objects.equals(id, material.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }
}
