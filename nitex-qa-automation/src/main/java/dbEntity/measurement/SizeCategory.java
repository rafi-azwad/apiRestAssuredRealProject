package dbEntity.measurement;

import dbEntity.audit.AuditableEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "size_category" )
public class SizeCategory extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "size_category_sequence_generator")
    @SequenceGenerator( name = "size_category_sequence_generator", sequenceName = "size_category_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "size_mapping_json", length = 4000 )
    private String sizeMappingJson;

    @Column( name = "brand_id" )
    private Long brandId;
}
