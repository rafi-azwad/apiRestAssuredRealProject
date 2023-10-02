package dbEntity.product;

import dbEntity.audit.AuditableEntity;
import dbEntity.document.Document;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@Table( name = "product_art_board" )
public class ProductArtBoard extends AuditableEntity implements Cloneable {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "product_art_board_seq_generator" )
    @SequenceGenerator( name = "product_art_board_seq_generator", sequenceName = "product_art_board_history_sequence" )
    private Long id;

    @Column( name = "name" )
    private String name;

    @Column( name = "code" )
    private String code;

    @Column( name = "serial" )
    private Integer serial;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "product_id", foreignKey = @ForeignKey( name = "fk_product_art_board_product_id" ) )
    private Product product;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "document_id", foreignKey = @ForeignKey( name = "fk_product_art_board_document_id" ) )
    private Document document;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    @JoinColumn( name = "history_document_id", foreignKey = @ForeignKey( name = "fk_product_art_board_history_document_id" ) )
    private Document historyDocument;
}
