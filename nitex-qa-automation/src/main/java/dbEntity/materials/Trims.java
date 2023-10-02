package dbEntity.materials;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "trims" )
public class Trims implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "trims_id_generator" )
    @SequenceGenerator( name = "trims_id_generator", sequenceName = "trims_id_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "category" )
    private TrimsCategory category;

    @Column( name = "sub_category" )
    private String subCategory;

    @Column( name = "type" )
    private TrimsType trimsType;

    @Override
    public Trims clone() {

        Trims trims = new Trims();
        trims.setCategory( this.getCategory() );
        trims.setTrimsType( this.getTrimsType() );
        return trims;
    }
}
