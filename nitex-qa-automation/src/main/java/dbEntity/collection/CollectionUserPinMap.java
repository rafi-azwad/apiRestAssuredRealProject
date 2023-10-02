package dbEntity.collection;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table( name = "collection_user_pin_map" )
@IdClass( CollectionUserPinMapId.class )
@NoArgsConstructor
@AllArgsConstructor
public class CollectionUserPinMap {

    @Id
    @Column( name = "collection_id" )
    private Long collectionId;

    @Id
    @Column( name = "user_id" )
    private Long userId;
}
