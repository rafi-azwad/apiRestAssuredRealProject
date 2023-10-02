package dbEntity.post;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "seen_post",
        indexes = {
                @Index( name="index__seen_post__user_id", columnList = "user_id" ),
                @Index( name="index__seen_post__post_id", columnList = "post_id" )
        }
)
public class SeenPost {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "seen_post_sequence_generator" )
    @SequenceGenerator( name = "seen_post_sequence_generator", sequenceName = "seen_post_sequence" )
    private Long id;

    @Column( name = "user_id" )
    private Long userId;

    @Column( name = "is_seen" )
    private Boolean isSeen = true;

    @Column( name ="seen_date" )
    private Date seenDate = new Date();

    @Column( name = "post_id" )
    private Long postId;

    /*@ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "post_id", foreignKey = @ForeignKey( name = "fk_seen_post_post_id" ) )
    private Post post;*/

    public SeenPost( Long userId, Long postId ){
        this.userId = userId;
        this.postId = postId;
    }
}
