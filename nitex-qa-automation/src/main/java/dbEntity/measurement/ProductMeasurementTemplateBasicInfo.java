package dbEntity.measurement;

import dbEntity.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@Table( name = "product_measurement_template_basic_info" )
public class ProductMeasurementTemplateBasicInfo {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "product_measurement_template_basic_info_sequence_generator" )
    @SequenceGenerator( name="product_measurement_template_basic_info_sequence_generator", sequenceName = "product_measurement_template_basic_info_sequence", initialValue = 200 )
    private Long id;

    @Column( name = "template_name" )
    private String templateName;

    @Column( name = "base_size" )
    private Size baseSize;

    @Column( name = "measurement_unit" )
    private MeasurementUnit measurementUnit;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinColumn( name = "size_category", foreignKey = @ForeignKey( name = "fk_product_measurement_template_basic_info_size_category_id" ) )
    private SizeCategory sizeCategory;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE } )
    @JoinColumn( name = "added_by", foreignKey = @ForeignKey( name = "fk_product_measurement_template_basic_info_user_id_fk") )
    private User user;
}
