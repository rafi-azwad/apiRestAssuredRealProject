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
@Table( name = "organizational_team" )
public class OrganizationalTeam extends AuditableEntity {

    @Id
    @GeneratedValue( strategy =  GenerationType.SEQUENCE, generator = "organizational_team_seq_generator" )
    @SequenceGenerator( name = "organizational_team_seq_generator", sequenceName = "organizational_team_seq" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "team_lead_id", foreignKey = @ForeignKey( name = "fk_organizational_team_team_lead_id" ) )
    private User teamLead;

    @ManyToMany( fetch = FetchType.LAZY )
    @JoinTable( name = "organizational_team_department_map",
            joinColumns = @JoinColumn( name = "organizational_team_id" ),
            inverseJoinColumns = @JoinColumn( name = "department_id" ),
            foreignKey = @ForeignKey( name = "fk_organizational_team_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_organizational_team_department_id" ) )
    private Set<OrganizationalDepartment> departments = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY )
    @JoinTable( name = "organizational_team_member_map",
            joinColumns = @JoinColumn( name = "organizational_team_id" ),
            inverseJoinColumns = @JoinColumn( name = "user_id" ),
            foreignKey = @ForeignKey( name = "fk_organizational_team_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_organizational_team_user_id" ) )
    private Set<User> members = new HashSet<>();


    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || Hibernate.getClass( this ) != Hibernate.getClass( o ) ) return false;
        OrganizationalTeam that = ( OrganizationalTeam ) o;
        return Objects.equals( id, that.id );
    }

    @Override
    public int hashCode() {
        if ( this.id != null )
            return Objects.hash( this.id );
        return System.identityHashCode( this );
    }
}
