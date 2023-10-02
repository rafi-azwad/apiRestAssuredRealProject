package dbEntity.post;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table( name = "post_email_message_id_map", indexes = {
        @Index( name = "idx_post_email_message_id", columnList = "message_id" )
} )
public class PostEmailMessageIdMap {

    @Id
    @Column( name = "post_id" )
    private Long postId;

    @Column( name = "parent_post_id" )
    private Long parentPostId;

    @Column( name = "message_id" )
    private String messageId;
}
