package dbEntity.materials;

public enum FabricBase {
    PREMIUM(0),
    SEASONAL(1),
    CORE(2),
    REGULAR(3)
    ;
    FabricBase( Integer value ){
        this.value = value;
    }

    private Integer value;
}
