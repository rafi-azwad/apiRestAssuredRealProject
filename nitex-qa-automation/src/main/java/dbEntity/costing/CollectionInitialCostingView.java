package dbEntity.costing;

import dbEntity.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table( name = "collection_initial_costing_view" )
public class CollectionInitialCostingView {

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
}
