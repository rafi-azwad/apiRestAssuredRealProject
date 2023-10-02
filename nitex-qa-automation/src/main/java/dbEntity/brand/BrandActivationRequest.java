package dbEntity.brand;

import dbEntity.enums.Status;
import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "brand_activation_request")
@NoArgsConstructor
public class BrandActivationRequest {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "brand_activation_request_sequence_generator")
    @SequenceGenerator( name="brand_activation_request_sequence_generator", sequenceName = "brand_activation_request_sequence", initialValue = 1 )
    @Column( name ="id" )
    private Long id;

    @Column( name ="remarks" )
    private String remarks;

    @Column( name = "requested_at" )
    private LocalDateTime requestedAt;

    @Column( name ="status" )
    private Status status = Status.REQUESTED;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "requested_by", foreignKey = @ForeignKey( name = "fk_brand_activation_request_requested_by") )
    private User requestedBy;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn( name = "brand_id", foreignKey = @ForeignKey( name = "fk_brand_activation_request_brand_id" ) )
    private Brand brand;
}
