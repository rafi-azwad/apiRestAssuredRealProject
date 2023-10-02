package dbEntity.user;

import dbEntity.enums.NamedConstant;

public enum ManagementLevel implements NamedConstant {
    CXO(0, "CXO"),
    DIRECTOR(1, "Director"),
    COUNTRY_HEAD(2, "Country head"),
    HOD(3, "Head of department");


    private Integer value;
    private String name;

    ManagementLevel( Integer value, String name ) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
