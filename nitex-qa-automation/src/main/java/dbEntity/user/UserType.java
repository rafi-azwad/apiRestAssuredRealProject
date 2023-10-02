package dbEntity.user;

import java.util.Arrays;

public enum UserType {

    DELETED(0,"Deleted"),
    ADMIN(1, "Admin"),
    BUYER(2,"Buyer"),
    ACCOUNT_MANAGER( 3, "Account Manager"),
    PROJECT_MANAGER( 4,"Project Manager"),
    FASHION_DESIGNER(5,"Design R&D"),
    MERCHANDISER(6,"Merchandiser"),
    QA(7,"QA"),
    SYSTEM_USER(8,"System User"),
    MATERIAL_MANAGEMENT(9,"Material Management"),
    COSTING_MANAGER(10,"Costing Manager"),
    COMMERCIAL(11,"Commercial"),
    SUPPLY_CHAIN(12,"Supply Chain"),
    PRODUCT_DEVELOPMENT(13,"Product Development"),
    SAMPLE_DEVELOPMENT(14,"Sample Development"),
    PATTERN_MASTER(15,"Pattern Master"),
    CUTTING_MAN(16,"Cutting Man"),
    SEWING_MAN(17,"Sewing Man"),
    PHOTOGRAPHY(18,"Photography"),
    INVENTORY_MANAGEMENT(19,"Inventory Management"),
    GARMENTS_TECH(20,"Garments Tech"),
    PEOPLE_MANAGEMENT(21,"People Management"),
    GRAPHICS_DESIGNER(22,"Graphics Designer"),
    FINANCE_AND_ACCOUNTS(23,"Finance & Accounts"),
    ;

    private Integer value;
    private String name;

    UserType( Integer value, String name ){
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static UserType[] getAllAdminUserType() {

        UserType[] adminUserTypes = new UserType[] {
                UserType.ADMIN,
                UserType.ACCOUNT_MANAGER,
                UserType.PROJECT_MANAGER,
                UserType.FASHION_DESIGNER,
                UserType.MERCHANDISER,
                UserType.QA,
                UserType.COSTING_MANAGER,
                UserType.COMMERCIAL,
                UserType.SUPPLY_CHAIN,
                UserType.PRODUCT_DEVELOPMENT,
                UserType.SAMPLE_DEVELOPMENT,
                UserType.PATTERN_MASTER,
                UserType.CUTTING_MAN,
                UserType.SEWING_MAN,
                UserType.PHOTOGRAPHY,
                UserType.MATERIAL_MANAGEMENT,
                UserType.INVENTORY_MANAGEMENT,
                UserType.GARMENTS_TECH,
                UserType.PEOPLE_MANAGEMENT,
                UserType.GRAPHICS_DESIGNER,
                UserType.FINANCE_AND_ACCOUNTS,
        };
        return adminUserTypes;
    }

    public Boolean isNitexUser() {
        return Arrays.asList( getAllAdminUserType() ).contains( this );
    }
}
