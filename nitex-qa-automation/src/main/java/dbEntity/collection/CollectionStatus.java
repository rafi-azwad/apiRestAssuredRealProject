package dbEntity.collection;

import dbEntity.enums.AvailabilityStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Objects;

@Data
@Entity
@Table( name = "collection_status" )
@IdClass( CollectionStatusId.class )
public class CollectionStatus {

    @Id
    @Column( name = "collection_id" )
    private Long collectionId;

    @Id
    @Column( name = "status" )
    private AvailabilityStatus status;

    @Column( name = "status_count" )
    private Long statusCount;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "collection", foreignKey = @ForeignKey( name = "fk_collection_status_collection" ) )
    private Collection collection;

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        CollectionStatus that = ( CollectionStatus ) o;
        return Objects.equals( this.collectionId, that.collectionId ) && Objects.equals( this.status, that.status );
    }

    @Override
    public int hashCode() {
        if ( collectionId == null )
            return System.identityHashCode( this );
        return Objects.hash( collectionId, status );
    }
}
