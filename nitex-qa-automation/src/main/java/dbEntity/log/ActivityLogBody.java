package dbEntity.log;

import dbEntity.notification.NotificationEntityIdTypeMap;
import dbEntity.notification.TitlePart;
import lombok.Data;

import java.util.List;

@Data
public class ActivityLogBody {

    private List<TitlePart> titlePartList;
    private List<NotificationEntityIdTypeMap> entityIdTypeMapList;

    private ActivityLogBody(){}

    public static ActivityLogBody build( List<TitlePart> titlePartList ) {

        ActivityLogBody activityLogBody = new ActivityLogBody();
        activityLogBody.setTitlePartList( titlePartList );
        return activityLogBody;
    }

    public static ActivityLogBody build( List<TitlePart> titlePartList, List<NotificationEntityIdTypeMap> entityIdTypeMapList ) {

        ActivityLogBody activityLogBody = build( titlePartList );
        activityLogBody.setEntityIdTypeMapList( entityIdTypeMapList );
        return activityLogBody;
    }
}
