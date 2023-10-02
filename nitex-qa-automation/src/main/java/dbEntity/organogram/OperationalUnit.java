package dbEntity.organogram;

import dbEntity.location.Country;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
@Table( name = "operational_unit" )
public class OperationalUnit {

    @Id
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "type" )
    private OperationalUnitType type;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "country_id", foreignKey = @ForeignKey( name = "fk_operational_unit_country_id" ) )
    private Country country;

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        OperationalUnit that = ( OperationalUnit ) o;
        return id != null && id.equals( that.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }
}
