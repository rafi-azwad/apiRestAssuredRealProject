package dbEntity.sample;

import dbEntity.audit.AuditableEntity;
import dbEntity.collection.Collection;
import dbEntity.document.Document;
import dbEntity.enums.Status;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table( name = "sample_request" )
public class SampleRequest extends AuditableEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "sample_request_sequence_generator" )
    @SequenceGenerator( name = "sample_request_sequence_generator", sequenceName = "sample_request_sequence" )
    private Long id;

    @Column( name = "reference_number" )
    private String referenceNumber;

    @Column( name = "title" )
    private String title;

    @Column( name = "description", columnDefinition="TEXT" )
    private String description;

    @Column( name = "status" )
    private Status status = Status.PENDING;

    @Column( name = "initial_sample" )
    private Boolean initialSample = false;

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

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "project_manager_id", foreignKey = @ForeignKey( name = "fk_quote_request_project_manager_id") )
    private User projectManager;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "account_manager_id", foreignKey = @ForeignKey( name = "fk_quote_request_account_manager_id") )
    private User accountManager;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "collection_id", foreignKey = @ForeignKey( name = "fk_sample_request_collection_id" ) )
    private Collection collection;

    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "sampleRequest" )
    private Set<SampleItem> sampleItems = new HashSet<>();

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(
            name = "sample_request_user_map",
            joinColumns = @JoinColumn( name = "sample_request_id"),
            inverseJoinColumns = @JoinColumn( name = "user_id" ),
            foreignKey = @ForeignKey( name = "sample_request_user_map_sample_request_id_fk" ),
            inverseForeignKey = @ForeignKey( name = "sample_request_user_map_user_id_fk" ) )
    private Set<User> members = new HashSet<>();

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinTable(
            name = "sample_request_document_map",
            joinColumns = @JoinColumn( name = "sample_request_id"),
            inverseJoinColumns = @JoinColumn( name = "document_id" ),
            foreignKey = @ForeignKey( name = "sample_request_document_map_sample_request_id_fk" ),
            inverseForeignKey = @ForeignKey( name = "sample_request_document_map_document_id_fk" ) )
    private Set<Document> documentSet = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleRequest that = (SampleRequest) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        if ( id == null )
            return System.identityHashCode( this );
        return Objects.hash(id);
    }
}
