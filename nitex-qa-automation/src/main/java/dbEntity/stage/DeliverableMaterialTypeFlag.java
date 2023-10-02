package dbEntity.stage;

import dbEntity.materials.MaterialType;

public enum DeliverableMaterialTypeFlag {
    FABRIC(0),
    TRIMS(1),
    ACCESSORIES(2),
    DEFAULT(3);

    private Integer value;

    DeliverableMaterialTypeFlag( Integer value ) {
        this.value = value;
    }

    public boolean isApplicable( MaterialType materialType ) {
        switch ( materialType ) {
            case MAIN_FABRIC:
            case EXTRA_FABRIC:
                return this.equals( FABRIC );
            case TRIMS:
                return this.equals( TRIMS );
            case BRANDING:
                return this.equals( ACCESSORIES );
            default:
                return false;
        }
    }
}
