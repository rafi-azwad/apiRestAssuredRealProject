package dbEntity.brand;

import dbEntity.enums.NamedConstant;

public enum BrandStatusStage implements NamedConstant {

    DOCUMENT_SUBMISSION( 0, "Document submission"),
    DOCUMENT_SUBMITTED( 1, "Document submitted"),
    AUDIT_PENDING( 2, "Audit pending"),
    AUDIT_SCHEDULED( 3, "Audit scheduled"),
    AUDIT_COMPLETE( 4, "Audit complete"),
    AUDIT_REPORT_SENT( 5, "Audit report sent")
    ;

    private Integer order;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    BrandStatusStage( Integer order, String name ) {
        this.order = order;
        this.name = name;
    }
}
