package dbEntity.role;

import dbEntity.user.UserLevel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "role")
@ToString( exclude = { "userLevels" } )
public class Role implements Comparable<Role>{
    
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "role_sequence_generator")
	@SequenceGenerator( name="role_sequence_generator", sequenceName = "role_sequence", initialValue = 1 )
	@Column( name = "id" )
	private Integer id;
	
	@Column( name = "name" )
    private String name;
	
	@Column( name = "role_text" )
	private String roleText;
	
	@Column( name = "role_group")
	private String roleGroup;

	@ManyToMany( mappedBy = "roles", fetch=FetchType.LAZY )
	private Set<UserLevel> userLevels;

	@Override
	public int compareTo( Role o ) {

		return this.id.compareTo( o.getId() );
	}

	@Override
	public boolean equals( Object o ) {
		if ( this == o ) return true;
		if ( o == null || Hibernate.getClass( this ) != Hibernate.getClass( o ) ) return false;
		Role that = ( Role ) o;
		return Objects.equals( id, that.id );
	}

	@Override
	public int hashCode() {
		if ( this.id != null )
			return Objects.hash( this.id );
		return System.identityHashCode( this );
	}

}
