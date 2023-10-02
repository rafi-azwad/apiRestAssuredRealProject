package dbEntity.supplier;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "contact_person" )
public class ContactPerson {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "contact_person_sequence_generator" )
    @SequenceGenerator( name = "contact_person_sequence_generator", sequenceName = "contact_person_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "designation" )
    private String designation;

    @Column( name = "phone" )
    private String phone;

    @Column( name = "email" )
    private String email;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_contact_person_supplier_id" ) )
    private Supplier supplier;
}
