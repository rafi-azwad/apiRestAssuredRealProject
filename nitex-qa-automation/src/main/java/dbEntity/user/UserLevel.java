package dbEntity.user;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import dbEntity.location.Country;
import dbEntity.role.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.*;

@Data
@Entity
@Table( name = "user_level")
@ToString(exclude={"roles", "createdBy"})
public class UserLevel {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "user_level_sequence")
    @SequenceGenerator( name="user_level_sequence", sequenceName = "user_level_sequence" )
    @Column( name = "id" )
    private Integer id;

    @Column( name = "name")
    private String name;

    @Column( name = "description", columnDefinition = "TEXT" )
    private String description;

    @Column( name = "is_management" )
    private Boolean isManagement = false;

    @Column( name = "management_level" )
    private ManagementLevel managementLevel;

    @UpdateTimestamp
    @Column( name = "last_update_time" )
    private LocalDateTime lastUpdatedTime;

    @CreationTimestamp
    @Column( name = "added_time" )
    private LocalDateTime addedTime;

    @Column( name ="primary_user_type" )
    private UserType primaryUserType;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "created_by", foreignKey = @ForeignKey( name = "user_level_user_id_fk" ) )
    private User createdBy;

    @Type( ListArrayType.class )
    @Column( name = "main_menus", columnDefinition = "int[]" )
    private List<Integer> mainMenus = new ArrayList<>();

    @Type( ListArrayType.class )
    @Column( name = "more_menus", columnDefinition = "int[]" )
    private List<Integer> moreMenus = new ArrayList<>();

    @Enumerated
    @ElementCollection( targetClass = UserType.class, fetch = FetchType.LAZY )
    @JoinTable( name = "user_level_user_type_map",
            joinColumns = @JoinColumn( name = "user_id" ),
            foreignKey = @ForeignKey( name = "fk_user_level_user_type_map_user_id" )
    )
    private Set<UserType> userTypeSet = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY )
    @JoinTable( name = "user_level_department_map",
            joinColumns = @JoinColumn( name = "user_level_id" ),
            inverseJoinColumns = @JoinColumn( name = "department_id" ),
            foreignKey = @ForeignKey( name = "fk_user_level_department_map_user_level_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_user_level_department_map_department_id" )
    )
    private Set<OrganizationalDepartment> departmentSet = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY )
    @JoinTable( name = "user_level_country_map",
            joinColumns = @JoinColumn( name = "user_level_id" ),
            inverseJoinColumns = @JoinColumn( name = "country_id" ),
            foreignKey = @ForeignKey( name = "fk_user_level_country_map_user_level_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_user_level_country_map_country_id" )
    )
    private Set<Country> countrySet = new HashSet<>();

    @ManyToMany( fetch=FetchType.LAZY )
    @JoinTable(
            name = "user_level_role",
            joinColumns = @JoinColumn( name = "user_level_id" ),
            inverseJoinColumns = @JoinColumn( name = "role_id" ),
            foreignKey = @ForeignKey( name = "user_level_role_fk" ),
            inverseForeignKey = @ForeignKey( name = "role_user_level_fk" ) )
    private Set<Role> roles = new HashSet<>();

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || Hibernate.getClass( this ) != Hibernate.getClass( o ) ) return false;
        UserLevel that = ( UserLevel ) o;
        return Objects.equals( id, that.id );
    }

    @Override
    public int hashCode() {
        if ( this.id != null )
            return Objects.hash( this.id );
        return System.identityHashCode( this );
    }
}
