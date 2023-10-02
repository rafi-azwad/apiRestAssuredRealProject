package dbEntity.user;

public enum Profession {

    STUDENT(0),
    BUYER(1),
    PRODUCT_MANAGER(2),
    DESIGNER(3),
    SOURCING_MANAGER(4),
    OWNER(5),
    OTHER(6);

    private Integer value;

    Profession( Integer val ){

        this.value = val;
    }
}
