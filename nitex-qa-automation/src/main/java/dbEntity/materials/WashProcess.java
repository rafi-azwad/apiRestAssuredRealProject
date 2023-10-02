package dbEntity.materials;

import dbEntity.enums.NamedConstant;

public enum WashProcess implements NamedConstant {
    ACID_WASH(0, "Acid wash"),
    NORMAL_WASH(1, "Normal wash"),
    PIGMENT_WASH(2, "Pigment wash"),
    BLEACH_WASH(3, "Bleach wash"),
    STONE_WASH_WITH_BLEACH(4, "Stone wash with bleach"),
    STONE_WASH_WITHOUT_BLEACH(5, "Stone wash without bleach"),
    ENZYME_WASH(6, "Enzyme wash"),
    CAUSTIC_WASH(7, "Caustic wash"),
    GARMENT_WASH(8, "Garment wash and over-due"),
    WHITENING_WASH(9, "Whitening wash"),
    ;

    private Integer order;
    private String name;

    WashProcess(Integer order, String name) {
        this.order = order;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
