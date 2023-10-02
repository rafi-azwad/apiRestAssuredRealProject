package dbEntity.user;

import dbEntity.audit.AuditableEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table( name = "organizational_department" )
public class OrganizationalDepartment extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "organizational_department_id_generator" )
    @SequenceGenerator( name = "organizational_department_id_generator", sequenceName = "organizational_department_id_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "description" )
    private String description;

    @Enumerated
    @ElementCollection( targetClass = UserType.class, fetch = FetchType.LAZY )
    @JoinTable( name = "organizational_department_user_type_map",
            joinColumns = @JoinColumn( name = "organizational_department_id" )
    )
    private Set<UserType> userTypeSet = new HashSet<>();

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || Hibernate.getClass( this ) != Hibernate.getClass( o ) ) return false;
        OrganizationalDepartment that = ( OrganizationalDepartment ) o;
        return Objects.equals( id, that.id );
    }

    @Override
    public int hashCode() {
        if ( this.id != null )
            return Objects.hash( this.id );
        return System.identityHashCode( this );
    }
}
