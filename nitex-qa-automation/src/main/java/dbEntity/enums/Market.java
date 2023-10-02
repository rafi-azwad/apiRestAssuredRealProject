package dbEntity.enums;

public enum Market implements NamedConstant {

    MEN( 0, "Men"),
    Women( 1, "Women");

    private Integer order;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    Market(Integer order, String name ) {
        this.order = order;
        this.name = name;
    }
}
