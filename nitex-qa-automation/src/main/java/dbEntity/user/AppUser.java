package dbEntity.user;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.util.List;

@Data
@Entity
@Table( name = "app_user" )
public class AppUser {

    @Id
    private Long id;

    @Column( name = "username" )
    private String userName;

    @Column( name = "salt" )
    private String salt;

    @Column( name = "password" )
    private String password;

    @Type( ListArrayType.class )
    @Column( name = "resource_list", columnDefinition = "varchar[]" )
    private List<String> resourceList;
}
