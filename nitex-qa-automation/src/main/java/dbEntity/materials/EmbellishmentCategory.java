package dbEntity.materials;

import dbEntity.enums.NamedConstant;

public enum EmbellishmentCategory implements NamedConstant {

    PRINT(0, "P", "Print"),
    EMBROIDERY(1, "E", "Embroidery");

    private Integer order;
    private String code;
    private String name;

    EmbellishmentCategory( Integer order, String code, String name ) {
        this.order = order;
        this.code = code;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
