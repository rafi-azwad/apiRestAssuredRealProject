package dbEntity.materials;

public enum TrimsType {

    TEXTILE(0, "T", "Textile"),
    NATURAL(1, "N", "Natural"),
    METAL(2, "M", "Metal"),
    POLYESTER(3, "P", "Polyester"),
    LEATHER(4,"L", "Leather"),
    PAPER(5,"PP", "Paper")
    ;

    private Integer order;
    private String code;
    private String name;

    TrimsType(Integer order, String code, String name) {
        this.order = order;
        this.code = code;
        this.name = name;
    }
    public String getName() {
        return this.name;
    }


}
