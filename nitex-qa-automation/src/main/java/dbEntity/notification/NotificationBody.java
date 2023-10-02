package dbEntity.notification;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class NotificationBody {

    private List<TitlePart> titlePartList;
    private String text;
    private List<NotificationEntityIdTypeMap> entityIdTypeMapList;
}
