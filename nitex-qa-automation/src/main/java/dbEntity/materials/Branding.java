package dbEntity.materials;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "branding" )
public class Branding implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "branding_sequence_generator" )
    @SequenceGenerator( name="branding_sequence_generator", sequenceName = "branding_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "category" )
    private BrandingCategory category;

    @Column( name = "sub_category" )
    private String subCategory;

    @Column( name = "type" )
    private BrandingType brandingType;

    @Override
    public Branding clone() {

        Branding branding = new Branding();
        branding.setCategory( this.getCategory() );
        branding.setBrandingType( this.getBrandingType() );
        return branding;
    }
}
