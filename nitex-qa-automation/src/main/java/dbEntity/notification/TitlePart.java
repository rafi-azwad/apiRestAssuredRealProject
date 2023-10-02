package dbEntity.notification;

import dbEntity.user.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TitlePart {

    private Long id;
    private String text;
    private TitlePartType titlePartType;
    private EntityType entityType;

    public static TitlePart actor( User user ) {

        return TitlePart.builder()
                .id( user.getId() )
                .text( user.getNickName() == null || user.getNickName().trim().length() == 0 ? user.getName() : user.getNickName() )
                .titlePartType( TitlePartType.ACTOR )
                .build();
    }

    public static TitlePart person( User user ) {

        return TitlePart.builder()
                .id( user.getId() )
                .text( user.getNickName() == null || user.getNickName().trim().length() == 0 ? user.getName() : user.getNickName() )
                .titlePartType( TitlePartType.PERSON )
                .build();
    }

    public static TitlePart action( String action ) {

        return TitlePart.builder()
                .text( action )
                .titlePartType( TitlePartType.ACTION )
                .build();
    }

    public static TitlePart preposition( String text ) {

        return TitlePart.builder()
                .text( text )
                .titlePartType( TitlePartType.PREPOSITION )
                .build();
    }

    public static TitlePart newValue( String text ) {

        return TitlePart.builder()
                .text( text )
                .titlePartType( TitlePartType.NEW_VALUE )
                .build();
    }

    public static TitlePart actedUpon( Long id, String text, EntityType entityType ) {

        return TitlePart.builder()
                .id( id )
                .text( text )
                .entityType( entityType )
                .titlePartType( TitlePartType.ACTED_UPON )
                .build();
    }


}
