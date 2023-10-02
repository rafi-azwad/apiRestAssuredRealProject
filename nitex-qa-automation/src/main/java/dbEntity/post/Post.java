package dbEntity.post;

import dbEntity.document.Document;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@DynamicUpdate
@Table( name = "post" )
public class Post implements Cloneable{

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "post_sequence_generator")
    @SequenceGenerator( name="post_sequence_generator", sequenceName = "post_sequence", initialValue = 1 )
    @Column( name ="id" )
    private Long id;

    @Column( name = "related_entity_id_json", columnDefinition = "TEXT" )
    private String relatedEntityIdJSON;

    @Column( name = "post_type" )
    private PostType postType;

    @Column( name ="text", columnDefinition = "TEXT")
    private String text;

    @Column( name = "is_deleted" )
    private Boolean isDeleted = false;

    @Column( name = "is_seen" )
    private Boolean isSeen = false;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "added_by", foreignKey = @ForeignKey( name = "fk_post_user_id_added_by") )
    private User addedBy;

    @Column( name ="date_added" )
    private LocalDateTime dateAdded;

    @Column( name = "is_updated" )
    private Boolean isUpdated = false;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "updated_by", foreignKey = @ForeignKey( name = "fk_post_user_id_updated_by") )
    private User updatedBy;

    @Column( name ="date_updated" )
    private LocalDateTime dateUpdated;

    @Column( name ="update_history_json_arr", columnDefinition = "TEXT" )
    private String updateHistoryJSONArr;

    @Column( name = "is_approved" )
    private Boolean isApproved = true;

    @Column( name = "generated_from_email" )
    private Boolean generatedFromEmail = false;

    @Column( name = "email_message_id" )
    private String emailMessageId;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "approved_by", foreignKey = @ForeignKey( name = "fk_post_user_id_approved_by") )
    private User approvedBy;

    @Column( name ="date_approved" )
    private LocalDateTime dateApproved;

    @Column( name = "tagged_user_id_list_json" )
    private String taggedUserIdListJson;

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinColumn( name = "parent_post_id", foreignKey = @ForeignKey( name = "fk_post_post_id" ) )
    private Post parentPost;

    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "post" )
    private Set<PostRecipient> postRecipientSet = new HashSet<>();

    @OneToMany( fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
    @JoinTable(
            name = "post_document_map",
            joinColumns = @JoinColumn( name = "post_id"),
            inverseJoinColumns = @JoinColumn( name = "document_id" ),
            foreignKey = @ForeignKey( name = "post_document_map_post_id_fk" ),
            inverseForeignKey = @ForeignKey( name = "post_document_map_document_id_fk" ) )
    private Set<Document> documentSet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id.equals(post.id);
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash(id);
    }
}
