package dbEntity.collection;

import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "collection_user_map" )
@IdClass( CollectionUserId.class )
public class CollectionUserMap {

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "collection_id", foreignKey = @ForeignKey( name = "collection_user_map_collection_id_fk" ) )
    private Collection collection;

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST} )
    @JoinColumn( name = "user_id", foreignKey = @ForeignKey( name = "collection_user_map_user_id_fk") )
    private User user;

    @Column( name = "access_type" )
    private CollectionMemberAccessType accessType = CollectionMemberAccessType.WRITE_ACCESS;

    @Column( name = "shared_at" )
    private LocalDateTime sharedAt = LocalDateTime.now();

    public CollectionUserMap( Collection collection, User user ){
        this.collection = collection;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionUserMap that = (CollectionUserMap) o;
        return Objects.equals(collection.getId(), that.collection.getId()) && Objects.equals(user.getId(), that.user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash( collection.getId(), user.getId() );
    }

}
