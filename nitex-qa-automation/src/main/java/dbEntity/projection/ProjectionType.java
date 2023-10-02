package dbEntity.projection;

import dbEntity.enums.NamedConstant;

public enum ProjectionType implements NamedConstant {

    SEASON(0,"Season"),
    MONTHLY( 1, "Monthly"),
    FORTNIGHTLY( 2, "Fortnightly"),
    WEEKLY( 3, "Weekly");

    private Integer order;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    ProjectionType(Integer order, String name ) {
        this.order = order;
        this.name = name;
    }
}
