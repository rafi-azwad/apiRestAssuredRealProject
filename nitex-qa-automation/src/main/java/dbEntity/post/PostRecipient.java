package dbEntity.post;

import dbEntity.brand.Brand;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "post_recipient" )
public class PostRecipient implements Cloneable{

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "post_recipient_seq_generator" )
    private Long id;

    @Column( name = "type" )
    private RecipientType type;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_post_recipient_brand_id" ) )
    private Brand brand;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "user_id", foreignKey = @ForeignKey( name = "fk_post_recipient_user_id" ) )
    private User user;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "post_id", foreignKey = @ForeignKey( name = "fk_post_recipient_post_id" ) )
    private Post post;

    public PostRecipient( Post post, RecipientType type ){
        this.post = post;
        this.type = type;
    }

    @Override
    public PostRecipient clone() {
        PostRecipient postRecipient = new PostRecipient();
        BeanUtils.copyProperties( this, postRecipient );
        postRecipient.setId( null );
        postRecipient.setPost( null );

        return  postRecipient;
    }
}
