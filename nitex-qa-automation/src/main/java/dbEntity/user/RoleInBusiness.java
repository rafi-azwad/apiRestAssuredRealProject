package dbEntity.user;

public enum RoleInBusiness {

    OWNER(0),
    DIRECTOR(1),
    DESIGNER(2),
    MANAGER(3),
    BUYER(4),
    OTHER(5);

    private Integer value;

    RoleInBusiness( Integer val ){

        this.value = val;
    }
}
