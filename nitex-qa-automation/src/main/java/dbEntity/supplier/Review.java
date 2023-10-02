package dbEntity.supplier;

import dbEntity.audit.AuditableEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table( name = "review" )
public class Review extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "review_sequence_generator" )
    @SequenceGenerator( name = "review_sequence_generator", sequenceName = "review_sequence" )
    private Long id;

    @Column( name = "text", columnDefinition = "TEXT" )
    private String text;

    @Column( name = "ratting_value" )
    private Double rattingValue;

    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "supplier_id", foreignKey = @ForeignKey( name = "fk_review_supplier_id" ) )
    private Supplier supplier;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "review" )
    private List<Rating> ratingList;
}
