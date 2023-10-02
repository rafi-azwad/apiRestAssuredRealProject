package dbEntity.stage;

import dbEntity.materials.FabricType;

public enum DeliverableApplicableFabric {
    ALL(0),
    NON_SWEATER(1),
    SWEATER(2);

    private Integer value;

    DeliverableApplicableFabric( Integer value ) {
        this.value = value;
    }

    public boolean isApplicable( FabricType fabricType ) {
        if ( fabricType.equals( FabricType.SWEATER ) )
            return this.equals( ALL ) || this.equals( SWEATER );
        return this.equals( ALL ) || this.equals( NON_SWEATER );
    }
}
