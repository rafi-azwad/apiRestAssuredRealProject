package dbEntity.brand;

import dbEntity.enums.Status;
import dbEntity.notification.EntityType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table( name = "brand_activity" )
public class BrandActivity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "brand_activity_sequence_generator" )
    @SequenceGenerator( name = "brand_activity_sequence_generator", sequenceName = "brand_activity_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "type" )
    private EntityType entityType;

    @Column( name = "entity_id" )
    private Long entityId;

    @Column( name ="status" )
    private Status status;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_brand_activity_brand_id" ) )
    private Brand brand;

    public BrandActivity( Brand brand, EntityType type, Long entityId ) {
        this.brand = brand;
        this.entityType = type;
        this.entityId = entityId;
    }
}
