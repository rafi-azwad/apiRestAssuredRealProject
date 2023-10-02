package dbEntity.enums;

public enum ParentCatergory implements NamedConstant {

    TOP( 0, "Top", "T" ),
    BOTTOM( 1, "Bottom", "B"),
    ONE_PIECE(2,"One Piece", "O"),
    ACCESSORIES(3,"Accessories","A"),
    FOOTWEAR(4,"Footwear","F");


    private Integer order;
    private String name;
    private String code;

    @Override
    public String getName() {
        return name;
    }
    public String getCode(){
        return code;
    }

    public Integer getOrder() {
        return order;
    }

    ParentCatergory(Integer order, String name, String code ) {
        this.order = order;
        this.name = name;
        this.code = code;
    }
}
