package dbEntity.supplier;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
@Entity
@Table( name = "rating", uniqueConstraints = { @UniqueConstraint(columnNames = { "category", "review_id" }) } )
public class Rating {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "rating_sequence_generator" )
    @SequenceGenerator( name = "rating_sequence_generator", sequenceName = "rating_sequence" )
    private Long id;

    @Column( name = "category" )
    private RatingCategory category;

    @Min( 0 )
    @Max( 5 )
    @Column( name = "rating_value" )
    private Integer ratingValue;

    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinColumn( name = "review_id", foreignKey = @ForeignKey( name = "fk_rating_review_id" ) )
    private Review review;

    public Rating( RatingCategory category, Integer ratingValue, Review review ) {
        this.category = category;
        this.ratingValue = ratingValue;
        this.review = review;
    }

    public Rating() {
    }
}
