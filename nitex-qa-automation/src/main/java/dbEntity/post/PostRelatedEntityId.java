package dbEntity.post;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table( name = "post_related_entity_id" )
public class PostRelatedEntityId implements Cloneable{

    @Id
    private Long id;

    @Column( name = "post_type" )
    private PostType postType;

    @Column( name = "parent_post_id" )
    private Long parentPostId;

    @Column( name = "created_by" )
    private Long createdBy;

    @Column( name = "created_at" )
    private LocalDateTime createdAt;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Type( JsonBinaryType.class )
    @Column( name = "related_entity_id_json", columnDefinition = "jsonb" )
    private RelatedEntityId relatedEntityId;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Type( ListArrayType.class )
    @Column( name = "tagged_user_id_list", columnDefinition = "bigint[]" )
    private List<Long> taggedUserIdList = new ArrayList<>();

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Type( ListArrayType.class )
    @Column( name = "comment_id_list", columnDefinition = "bigint[]" )
    private List<Long> commentIdList = new ArrayList<>();

    @Override
    public PostRelatedEntityId clone() {
        PostRelatedEntityId postRelatedEntityId = new PostRelatedEntityId();
        BeanUtils.copyProperties(this, postRelatedEntityId );
        RelatedEntityId relatedEntityId = RelatedEntityId.builder().build();
        postRelatedEntityId.setRelatedEntityId( relatedEntityId );
        postRelatedEntityId.setId( null );
        return postRelatedEntityId;
    }
}
