package dbEntity.photography;

import dbEntity.audit.AuditableEntity;
import dbEntity.collection.Collection;
import dbEntity.enums.Status;
import dbEntity.product.Product;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table( name = "photography_request" )
public class PhotographyRequest extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "photography_request_sequence_generator" )
    @SequenceGenerator( name = "photography_request_sequence_generator", sequenceName = "photography_request_sequence" )
    private Long id;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @Column( name = "required_date" )
    private LocalDate requiredDate;

    @Column( name = "completed_date" )
    private LocalDateTime completedDate;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "fk_photography_request_product_id" ) )
    private Product product;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "collection_id", foreignKey = @ForeignKey( name = "fk_photography_request_collection_id" ) )
    private Collection collection;
}
