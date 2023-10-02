package dbEntity.notification;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class NotificationEntityIdTypeMap {

    private Long id;
    private String text;
    private String referenceNumber;
    private EntityType type;
    private List<String> docUrlList;

    public static NotificationEntityIdTypeMap build( Long id, String text, EntityType entityType ) {

        return NotificationEntityIdTypeMap.builder()
                .id( id )
                .text( text )
                .type( entityType )
                .build();
    }

    public static NotificationEntityIdTypeMap build( String text ) {

        return NotificationEntityIdTypeMap.builder()
                .text( text )
                .type( EntityType.POJO_CLASS )
                .build();
    }

    public NotificationEntityIdTypeMap docUrlList( List<String> docUrls ) {
        this.docUrlList = docUrls;
        return this ;
    }

    public NotificationEntityIdTypeMap referenceNumber( String referenceNumber ) {
        this.referenceNumber = referenceNumber;
        return this ;
    }
}
