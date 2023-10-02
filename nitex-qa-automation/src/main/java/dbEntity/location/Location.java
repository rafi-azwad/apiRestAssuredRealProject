package dbEntity.location;

import dbEntity.supplier.LocationType;
import dbEntity.supplier.Supplier;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table( name = "location" )
public class Location {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "location_sequence_generator" )
    @SequenceGenerator( name = "location_sequence_generator", sequenceName = "location_sequence" )
    private Long id;

    @Column( name = "type" )
    private LocationType type;

    @Column( name = "title" )
    private String title;

    @Column( name = "address_line_1", length = 1000 )
    private String addressLine1;

    @Column( name = "address_line_2", length = 1000 )
    private String addressLine2;

    @Column( name = "land_mark", length = 1000 )
    private String landMark;

    @Column( name = "map_url", length = 400 )
    private String mapUrl;

    @Column( name = "zip" )
    private String zip;

    @Column( name = "state" )
    private String state;

    @Column( name = "city" )
    private String city;

    @Transient
    private Long countryId;

    @Transient
    private String countryName;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "country_id", foreignKey = @ForeignKey( name = "fk_location_country_id" ) )
    private Country country;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_location_supplier_id" ) )
    private Supplier supplier;


    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Location location = ( Location ) o;
        return Objects.equals( id, location.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }
}
