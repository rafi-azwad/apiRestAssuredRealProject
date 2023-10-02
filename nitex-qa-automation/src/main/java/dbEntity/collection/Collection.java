package dbEntity.collection;

import dbEntity.brand.Brand;
import dbEntity.enums.Status;
import dbEntity.materials.Material;
import dbEntity.materials.Season;
import dbEntity.moodboard.MoodBoard;
import dbEntity.notification.EntityType;
import dbEntity.supplier.FreeTextTag;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@DynamicUpdate
@Table( name = "collection" )
public class Collection {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "collection_sequence_generator")
    @SequenceGenerator( name="collection_sequence_generator", sequenceName = "collection_sequence", initialValue = 1 )
    @Column( name = "id" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "description", columnDefinition="TEXT" )
    private String description;

    @CreationTimestamp
    @Column( name = "creation_date" )
    private Date creationDate;

    @UpdateTimestamp
    @Column( name = "modified_date" )
    private Date modifiedDate;

    @Column( name = "collection_type" )
    private CollectionViewType collectionViewType = CollectionViewType.PRODUCT_LIST;

    @Column( name = "last_design_updated_at" )
    private LocalDateTime lastDesignUpdatedAt = LocalDateTime.now();

    @Column( name = "season" )
    private Season season;

    @Column( name = "is_nitex_collection" )
    private Boolean isNitexCollection = false;

    @Column( name = "is_approval_needed" )
    private Boolean isApprovalNeeded = false;

    @Column( name = "approval_status" )
    private Status approvalStatus;

    @Column( name = "requested_at" )
    private LocalDateTime requestedAt;

    @Column( name = "requested_type" )
    private EntityType requestedType;

    @Column( name = "approved_at" )
    private LocalDateTime approvedAt;

    @Column( name = "approved_by" )
    private Long approvedBy;

    @Column( name = "is_deleted" )
    private Boolean isDeleted = false;

    @Column( name = "is_designer_collection", columnDefinition = "boolean default false" )
    private Boolean isDesignerCollection = false;

    @Column( name = "is_completed", columnDefinition = "boolean default false" )
    private Boolean isCompleted = false;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_collection_brand_id" ) )
    private Brand brand;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "owner", foreignKey = @ForeignKey( name = "collection_user_id_fk" ) )
    private User owner;

    @OneToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "moodboard_id", foreignKey = @ForeignKey( name = "fk_collection_moodboard_id" ) )
    private MoodBoard moodBoard;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "project_manager_id", foreignKey = @ForeignKey( name = "fk_collection_project_manager_id") )
    private User projectManager;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "account_manager_id", foreignKey = @ForeignKey( name = "fk_collection_account_manager_id") )
    private User accountManager;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "collection", cascade = {CascadeType.MERGE, CascadeType.PERSIST} )
    private Set<CollectionUserMap> members = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(
            name = "collection_material_pinned_map",
            joinColumns = @JoinColumn( name = "collection_id"),
            inverseJoinColumns = @JoinColumn( name = "material_id" ),
            foreignKey = @ForeignKey( name = "collection_material_pinned_map_collection_id_fk" ),
            inverseForeignKey = @ForeignKey( name = "collection_material_pinned_map_material_id_fk" ) )
    private Set<Material> pinnedMaterial = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinTable( name = "collection_tag_map",
            joinColumns = @JoinColumn( name = "collection_id" ),
            inverseJoinColumns = @JoinColumn( name = "tag_id" ),
            foreignKey = @ForeignKey( name = "collection_tag_map_collection_id" ),
            inverseForeignKey = @ForeignKey( name = "collection_tag_map_tag_id" ) )
    private Set<FreeTextTag> freeTextTagSet = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "collection" )
    private Set<CollectionDocumentMap> documentSet = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "collection" )
    private Set<CollectionProductMap> collectionProductMapSet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collection that = (Collection) o;
        return id != null && id.equals( that.id );
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( id );
        return Objects.hash( id );
    }
}
