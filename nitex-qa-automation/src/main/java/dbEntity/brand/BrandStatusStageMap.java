package dbEntity.brand;


import dbEntity.enums.Status;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "brand_status_stage_map" )
public class BrandStatusStageMap {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "brand_status_stage_map_sequence_generator" )
    @SequenceGenerator( name = "brand_status_stage_map_sequence_generator", sequenceName = "brand_status_stage_map_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name ="status" )
    private Status status;

    @Column( name ="brand_status_stage" )
    private BrandStatusStage statusStage;

    @Column( name ="added_at" )
    private LocalDateTime addedAt = LocalDateTime.now();

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_brand_status_stage_map_brand_id" ) )
    private Brand brand;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "added_by", foreignKey = @ForeignKey( name = "fk_brand_status_stage_map_user_id" ) )
    private User user;

    public BrandStatusStageMap( Brand brand, Status status,  BrandStatusStage stage, User addedBy ) {
        this.brand = brand;
        this.status = status;
        this.statusStage = stage;
        this.user = addedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BrandStatusStageMap that = (BrandStatusStageMap) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( this.id == null )
            return System.identityHashCode( this );
        return Objects.hash( this.id );
    }


}
