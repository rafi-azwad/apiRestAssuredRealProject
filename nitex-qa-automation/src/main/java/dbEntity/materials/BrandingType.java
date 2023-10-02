package dbEntity.materials;

public enum BrandingType {
    TEXTILE(0, "T", "Textile"),
    LEATHER(1, "L", "Leather"),
    METAL(2, "M", "Metal"),
    PAPER(3, "P", "Paper"),
    POLYESTER(4, "PL", "Polyester");

    private Integer order;
    private String code;
    private String name;

    BrandingType( Integer order, String code, String name ) {
        this.order = order;
        this.code = code;
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
