package dbEntity.company;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table( name = "company", uniqueConstraints = @UniqueConstraint( columnNames = { "name" }, name = "uk_company_name" ) )
public class Company {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "company_sequence_generator")
    @SequenceGenerator( name="company_sequence_generator", sequenceName = "company_sequence", initialValue = 1 )
    @Column( name ="id" )
    private Long id;

    @NotNull
    @Column( name = "name", length = 250 )
    private String name;

    @Column( name = "address", length = 1500 )
    private String address;
}
