package dbEntity.brand;

import dbEntity.user.User;
import dbEntity.user.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table( name = "brand_user_map" )
@IdClass( BrandUserId.class )
public class BrandUserMap {

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_brand_user_map_brand_id" ) )
    private Brand brand;

    @Id
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "user_id", foreignKey = @ForeignKey( name = "fk_brand_user_map_user_id" ) )
    private User user;

    @Column( name = "brand_user_type" )
    private UserType userType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrandUserMap that = (BrandUserMap) o;
        return Objects.equals( brand.getId(), that.brand.getId() ) && Objects.equals( user.getId(), that.user.getId() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( brand.getId(), user.getId() );
    }
}
