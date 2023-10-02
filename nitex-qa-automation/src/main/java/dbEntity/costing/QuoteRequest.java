package dbEntity.costing;

import dbEntity.audit.AuditableEntity;
import dbEntity.collection.Collection;
import dbEntity.document.Document;
import dbEntity.enums.Status;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table( name = "quote_request" )
public class QuoteRequest extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "quote_request_sequence_generator")
    @SequenceGenerator( name="quote_request_sequence_generator", sequenceName = "quote_request_sequence", initialValue = 1 )
    @Column( name ="id" )
    private Long id;

    @Column( name = "reference_number" )
    private String referenceNumber;

    @Column( name = "title" )
    private String title;

    @Column( name = "description", columnDefinition="TEXT" )
    private String description;

    /***
     * Available Status:
     */
    @Column( name = "status" )
    private Status status = Status.PENDING;

    @Column( name = "is_quote_received" )
    private Boolean isQuoteReceived = false;

    @Column( name = "is_approval_needed" )
    private Boolean isApprovalNeeded = false;

    @Column( name = "approval_status" )
    private Status approvalStatus;

    @Column( name = "requested_at" )
    private LocalDateTime requestedAt;

    @Column( name = "approved_at" )
    private LocalDateTime approvedAt;

    @Column( name = "approved_by" )
    private Long approvedBy;

    @Column( name = "estimated_order_delivery_date" )
    private LocalDate estimatedOrderDeliveryDate;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "project_manager_id", foreignKey = @ForeignKey( name = "fk_quote_request_project_manager_id") )
    private User projectManager;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "account_manager_id", foreignKey = @ForeignKey( name = "fk_quote_request_account_manager_id") )
    private User accountManager;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "collection_id", foreignKey = @ForeignKey( name = "fk_quote_request_collection_id" ) )
    private Collection collection;

    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "quoteRequest" )
    private Set<QuoteItem> quoteItems = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(
            name = "quote_request_user_map",
            joinColumns = @JoinColumn( name = "quote_request_id"),
            inverseJoinColumns = @JoinColumn( name = "user_id" ),
            foreignKey = @ForeignKey( name = "quote_request_user_map_quote_request_id_fk" ),
            inverseForeignKey = @ForeignKey( name = "quote_request_user_map_user_id_fk" ) )
    private Set<User> members = new HashSet<>();

    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinTable(
            name = "quote_request_document_map",
            joinColumns = @JoinColumn( name = "quote_request_id"),
            inverseJoinColumns = @JoinColumn( name = "document_id" ),
            foreignKey = @ForeignKey( name = "quote_request_document_map_quote_request_id_fk" ),
            inverseForeignKey = @ForeignKey( name = "quote_request_document_map_document_id_fk" ) )
    private Set<Document> documentSet = new HashSet<>();

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuoteRequest that = (QuoteRequest) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash(id);
    }
}
