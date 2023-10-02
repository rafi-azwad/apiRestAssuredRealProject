package dbEntity.order;

import dbEntity.enums.Status;
import dbEntity.notification.EntityType;
import dbEntity.rfq.ProductInfoForRfq;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table( name = "order_cancel_request" )
public class OrderCancelRequest {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "order_cancel_request_sequence_generator")
    @SequenceGenerator( name="order_cancel_request_sequence_generator", sequenceName = "order_cancel_request_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "requested_at" )
    private LocalDateTime requestedAt;

    @Column( name = "approved_at" )
    private LocalDateTime approvedAt;

    @Column( name = "requested_type" )
    private EntityType requestedType;

    @Column( name = "status" )
    private Status status = Status.REQUESTED;

    @Column( name = "requestor_remarks" )
    private String requestorRemarks;

    @Column( name = "approver_remarks" )
    private String approverRemarks;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "requested_by", foreignKey = @ForeignKey( name = "fk_order_cancel_request_requested_by" ) )
    private User requestedBy;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "approved_by", foreignKey = @ForeignKey( name = "fk_order_cancel_request_approved_by" ) )
    private User approvedBy;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "order_id", foreignKey = @ForeignKey( name = "fk_order_cancel_request_order_id" ) )
    private Order order;

    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(
            name = "order_cancel_request_product_info_for_rfq_map",
            joinColumns = @JoinColumn( name = "order_cancel_request_id"),
            inverseJoinColumns = @JoinColumn( name = "product_info_for_rfq_id" ),
            foreignKey = @ForeignKey( name = "fk_order_cancel_request_product_info_for_rfq_map_request_id" ),
            inverseForeignKey = @ForeignKey( name = "fk_order_cancel_request_product_info_for_rfq_map_rfq_id" ) )
    private Set<ProductInfoForRfq> productInfoForRfqSet = new HashSet<>();

}
