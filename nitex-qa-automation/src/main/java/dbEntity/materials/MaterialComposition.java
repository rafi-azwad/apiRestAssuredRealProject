package dbEntity.materials;

import dbEntity.enums.NamedConstant;

public enum MaterialComposition implements NamedConstant {
    NORMAL(0, "Normal", "N"),
    ORGANIC(1, "Organic", "O"),
    RECYCLED(2, "Recycled", "R"),
    MIX(3, "Mix", "M");

    private Integer order;
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    MaterialComposition(Integer order, String name, String code) {
        this.order = order;
        this.name = name;
        this.code = code;
    }
}
