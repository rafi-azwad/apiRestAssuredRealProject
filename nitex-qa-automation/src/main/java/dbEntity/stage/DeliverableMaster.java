package dbEntity.stage;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table( name = "deliverable_master" )
public class DeliverableMaster {

    @Id
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "applicable_fabric" )
    private DeliverableApplicableFabric applicableFabric;

    @Column( name = "material_type" )
    private DeliverableMaterialTypeFlag materialType;

    @Column( name = "sequence_index" )
    private Long sequenceIndex;

    @Column( name = "is_critical" )
    private Boolean isCritical;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "stage_master_id", referencedColumnName = "id", foreignKey = @ForeignKey( name = "fk_deliverable_master_stage_master_id") )
    @ToString.Exclude
    private StageMaster stageMaster;
}
