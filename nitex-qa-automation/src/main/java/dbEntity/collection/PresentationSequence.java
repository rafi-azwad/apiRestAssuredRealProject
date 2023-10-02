package dbEntity.collection;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import dbEntity.audit.AuditableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.util.List;

@Data
@Entity
@Table( name = "collection_presentation_sequence" )
public class PresentationSequence extends AuditableEntity {

    @Id
    @Column( name = "collection_id" )
    private Long collectionId;

    @Column( name = "presentation_name" )
    private String presentationName;

    @Column( name = "season" )
    private String season;

    @Column( name = "market" )
    private String market;

    @Column( name = "with_moodboard" )
    private Boolean withMoodboard;

    @Type( ListArrayType.class )
    @Column( name = "ordered_product_ids", columnDefinition = "bigint[]" )
    private List<Long> orderedProductIds;
}
