package dbEntity.category;

import dbEntity.enums.ParentCatergory;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@Table( name = "category" )
@DynamicUpdate
public class Category {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "category_sequence_generator" )
    @SequenceGenerator( name = "category_sequence_generator", sequenceName = "category_sequence" )
    @Column( name = "id" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "code" )
    private String code;

    @Column( name = "presentation_order" )
    private Integer presentationOrder;

    @Column( name = "is_deleted" )
    private Boolean isDeleted;

    @Column( name = "parent_category" )
    private ParentCatergory parentCatergory;
}
