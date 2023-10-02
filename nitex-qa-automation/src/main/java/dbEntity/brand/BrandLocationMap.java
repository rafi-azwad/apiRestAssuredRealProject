package dbEntity.brand;

import dbEntity.location.Location;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "brand_location_map" )
@IdClass( BrandLocationMapId.class )
public class BrandLocationMap {

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_brand_location_map_brand_id" ) )
    private Brand brand;

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "location_id", foreignKey = @ForeignKey( name = "fk_brand_location_map_location_id" ) )
    private Location location;

    @Column( name = "is_default" )
    private Boolean isDefault;
}
