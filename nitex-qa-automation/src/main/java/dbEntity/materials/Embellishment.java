package dbEntity.materials;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "embellishment" )
public class Embellishment implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "embellishment_id_generator" )
    @SequenceGenerator( name = "embellishment_id_generator", sequenceName = "embellishment_id_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "category" )
    private EmbellishmentCategory category;

    @Column( name = "sub_category" )
    private String subCategory;

    @Override
    public Embellishment clone() {

        Embellishment embellishment = new Embellishment();
        embellishment.setCategory( this.category );
        embellishment.setSubCategory( this.subCategory );
        return embellishment;
    }
}
