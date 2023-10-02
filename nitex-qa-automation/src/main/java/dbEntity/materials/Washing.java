package dbEntity.materials;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "washing" )
public class Washing implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "washing_id_generator" )
    @SequenceGenerator( name = "washing_id_generator", sequenceName = "washing_id_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "process" )
    private WashProcess process;

    @Override
    public Washing clone() {

        Washing washing = new Washing();
        washing.setProcess( this.process );
        return washing;
    }
}
