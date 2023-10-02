package dbEntity.enums;

import java.util.Arrays;
import java.util.List;

public enum GsysFlag {
    LEVEL_ZERO(0, true, true),
    LEVEL_ONE(1, false, true),
    LEVEL_TWO(2, true, false);

    private Integer value;

    GsysFlag( Integer value, Boolean forExternal, Boolean forInternal ) {
        this.value = value;
    }

    public List<GsysFlag> getAccepted() {
        if ( this.equals( LEVEL_ONE ) )
            return Arrays.asList( LEVEL_ZERO, LEVEL_ONE );
        return Arrays.asList( LEVEL_ZERO, LEVEL_TWO );
    }
}
