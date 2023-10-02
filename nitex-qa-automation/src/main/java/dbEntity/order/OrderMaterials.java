package dbEntity.order;

import dbEntity.materials.Material;
import dbEntity.materials.MaterialType;
import dbEntity.materials.UnitType;
import dbEntity.rfq.ProductInfoForRfq;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.DynamicUpdate;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table( name = "order_materials" )
@DynamicUpdate
public class OrderMaterials {
    
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "order_materials_id_generator" )
    @SequenceGenerator( name = "order_materials_id_generator", sequenceName = "order_materials_id_sequence" )
    @Column( name = "id" )
    private Long id;
    
    @Column( name = "unit_type" )
    private UnitType unitType;
    
    @Column( name = "unit_value" )
    private BigDecimal unitValue;

    @Column( name = "lead_time_in_day" )
    private Long leadTimeInDay;

    @Transient
    private MaterialType materialTypeTransient;

    @Column( name = "is_imported" )
    private Boolean isImported = false;

    @Column( name = "is_deleted" )
    private Boolean isDeleted = false;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "order_id", foreignKey = @ForeignKey( name = "fk_order_materials_order_id" ) )
    private Order order;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "material_id", nullable = false, foreignKey = @ForeignKey( name = "fk_order_materials_material_id" ) )
    private Material material;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "product_info_for_rfq_id", foreignKey = @ForeignKey( name = "fk_order_materials_product_info_for_rfq_id" ) )
    private ProductInfoForRfq productInfoForRfq;


    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OrderMaterials that = (OrderMaterials) o;
        return id != null && Objects.equals( id, that.id );
    }

    @Override
    public int hashCode() {
        if ( this.id != null )
            return Objects.hash( this.id );
        return System.identityHashCode( this );
    }
}
