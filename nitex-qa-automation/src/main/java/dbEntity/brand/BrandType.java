package dbEntity.brand;

import dbEntity.enums.NamedConstant;

public enum BrandType implements NamedConstant {

    LUXURY( 0, "Elegant fashion"),
    HIGH_STREET( 1, "High Street Fashion"),
    CONTEMPORARY( 2, "Contemporary fashion"),
    SPORTWEAR( 3, "Sportswear"),
    STREETWEAR( 4, "Streetwear"),
    SUSTAINABLE( 5, "Sustainable fashion"),
    FAST( 6, "Fast fashion"),
    ACCESSORY( 7, "Accessories")
    ;

    private Integer order;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    BrandType( Integer order, String name ) {
        this.order = order;
        this.name = name;
    }
}
