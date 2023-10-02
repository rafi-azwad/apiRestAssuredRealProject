package dbEntity.photography;

import dbEntity.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table( name = "collection_photography_view" )
public class CollectionPhotographyView {

    @Id
    @Column( name = "collection_id" )
    private Long collectionId;

    @Column( name = "last_modified" )
    private LocalDate lastModified;

    @Column( name = "pending_count" )
    private Long pendingCount;

    @Column( name = "completed_count" )
    private Long completedCount;

    @Column( name = "status" )
    private Status status;

    @Column( name = "requested_by" )
    private Long requestedBy;

    @Column( name = "first_created_at" )
    private LocalDate firstCreatedAt;

    @Column( name = "last_require_date" )
    private LocalDate lastRequireDate;
}
