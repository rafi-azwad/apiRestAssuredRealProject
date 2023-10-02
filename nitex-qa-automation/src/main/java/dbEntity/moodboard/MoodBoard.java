package dbEntity.moodboard;

import dbEntity.audit.AuditableEntity;
import dbEntity.collection.Collection;
import dbEntity.color.Color;
import dbEntity.document.Document;
import dbEntity.enums.Status;
import dbEntity.materials.Material;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table( name = "moodboard" )
public class MoodBoard extends AuditableEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "moodboard_sequence_generator")
    @SequenceGenerator( name="moodboard_sequence_generator", sequenceName = "moodboard_sequence", initialValue = 1 )
    @Column( name = "id" )
    private Long id;

    /***
     * Available status: INITIALIZED, REQUESTED, APPROVED, CANCELLED, COMPLETED
     */
    @Column( name ="status" )
    private Status status;

    @Column( name ="requested_date_time" )
    private LocalDateTime requestedDateTime;

    @Column( name ="is_product_image_generating" )
    private Boolean isProductImageGenerating = false;

    @Column( name ="is_color_generating" )
    private Boolean isColorGenerating = false;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinTable(
            name = "moodboard_document_map",
            joinColumns = @JoinColumn( name = "moodboard_id"),
            inverseJoinColumns = @JoinColumn( name = "document_id" ),
            foreignKey = @ForeignKey( name = "moodboard_document_map_moodboard_id_fk" ),
            inverseForeignKey = @ForeignKey( name = "moodboard_document_map_document_id_fk" ) )
    private Set<Document> documentSet = new HashSet<>();

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinTable( name = "moodboard_color_map",
            joinColumns = @JoinColumn( name = "moodboard_id" ),
            inverseJoinColumns = @JoinColumn( name = "color_id" ),
            foreignKey = @ForeignKey( name = "fk_moodboard_color_map_moodboard_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_moodboard_color_map_color_id" ) )
    private Set<Color> colorSet = new HashSet<>();

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinTable( name = "moodboard_material_map",
            joinColumns = @JoinColumn( name = "moodboard_id" ),
            inverseJoinColumns = @JoinColumn( name = "material_id" ),
            foreignKey = @ForeignKey( name = "fk_moodboard_material_map_moodboard_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_moodboard_material_map_material_id" ) )
    private Set<Material> materialSet = new HashSet<>();


    @OneToOne( mappedBy = "moodBoard", fetch = FetchType.LAZY )
    private Collection collection;

    @OneToMany( mappedBy = "moodBoard", fetch = FetchType.LAZY )
    List<UserMoodBoardFavoriteMap>  moodBoardFavoriteMapList;

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        MoodBoard that = ( MoodBoard ) o;
        return id != null && id.equals( that.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash( id );
    }
}
