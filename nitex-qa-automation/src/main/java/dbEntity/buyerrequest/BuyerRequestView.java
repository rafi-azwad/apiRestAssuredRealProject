package dbEntity.buyerrequest;

import dbEntity.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table( name = "buyer_request_view" )
@IdClass( BuyerRequestViewId.class )
public class BuyerRequestView {

    @Id
    private Long id;

    @Id
    @Column( name = "request_type" )
    private BuyerRequestType requestType;

    @Column( name = "is_approval_needed" )
    private Boolean isApprovalNeeded;

    @Column( name = "approval_status" )
    private Status approvalStatus;

    @Column( name = "requested_at" )
    private LocalDateTime requestedAt;

    @Column( name = "requested_date" )
    private LocalDate requestedDate;

    @Column( name = "approved_at" )
    private LocalDateTime approvedAt;

    @Column( name = "approved_by" )
    private Long approvedBy;

    @Column( name = "buyer_id" )
    private Long buyerId;

    @Column( name = "project_manager_id" )
    private Long projectManagerId;

    @Column( name = "account_manager_id" )
    private Long accountManagerId;
}

