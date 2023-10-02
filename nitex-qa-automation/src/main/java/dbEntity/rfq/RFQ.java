package dbEntity.rfq;

import dbEntity.enums.Status;
import dbEntity.product.Product;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Date;
import java.util.Set;

@Data
@Entity
@DynamicUpdate
@Table( name ="rfq" )
@ToString( exclude = { "user", "rfqMembers", "productSet" } )
@EqualsAndHashCode( exclude = { "user", "rfqMembers", "productSet" } )
public class RFQ {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "rfq_sequence_generator")
    @SequenceGenerator( name="rfq_sequence_generator", sequenceName = "rfq_sequence", initialValue = 1 )
    @Column( name = "id" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "date_added" )
    private Date dateAdded;

    @Column( name = "last_response_time" )
    private Date lastResponseTime;

    @Column( name = "status" )
    private Status status;

    @Column( name = "num_of_styles" )
    private Integer numOfStyles;

    @Column( name = "is_deleted" )
    private Boolean isDeleted = false;
    
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "added_by", foreignKey = @ForeignKey( name = "rfq_user_id_fk") )
    private User user;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "rfq_executive_id", foreignKey = @ForeignKey( name = "rfq_rfq_executive_id_fk") )
    private User rfqExecutive;

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(
            name = "rfq_members_map",
            joinColumns = @JoinColumn( name = "rfq_id"),
            inverseJoinColumns = @JoinColumn( name = "user_id" ),
            foreignKey = @ForeignKey( name = "product_members_map_rfq_id_fk" ),
            inverseForeignKey = @ForeignKey( name = "product_members_map_user_id_fk" ) )
    private Set<User> rfqMembers;

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(
            name = "rfq_product_map",
            joinColumns = @JoinColumn( name = "rfq_id"),
            inverseJoinColumns = @JoinColumn( name = "product_id" ),
            foreignKey = @ForeignKey( name = "rfq_product_map_rfq_id_fk" ),
            inverseForeignKey = @ForeignKey( name = "rfq_product_map_product_id_fk" ) )
    private Set<Product> productSet;
}
