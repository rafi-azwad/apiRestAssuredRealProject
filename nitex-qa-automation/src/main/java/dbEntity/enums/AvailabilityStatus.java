package dbEntity.enums;

/**
 * Indicates design lifecycle. We are thinking of following lifecycle steps : <br/>
 * Techpack, Development, Complete, Published, Presentation, Sold
 * <p>
 * In Development step, there can be several status of the process, which is not defined here.
 * We will define it in separate column in product table.
 */
public enum AvailabilityStatus implements NamedConstant {

    COMPLETE(0, "Complete"),
    SOLD(1, "Sold"),
    TECHPACK( 2, "Techpack" ),
    DEVELOPMENT(3, "Development" ),
    PUBLISHED(4, "Published"),
    PRESENTATION(5, "Presentation");

    private Integer value;
    private String name;

    AvailabilityStatus( Integer val, String name ){

        this.value = val;
        this.name = name;
    }

    public Integer getValue(){

        return this.value;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
