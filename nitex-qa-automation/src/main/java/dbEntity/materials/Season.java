package dbEntity.materials;

import dbEntity.enums.NamedConstant;

public enum Season implements NamedConstant {

    SPRING_20( 0, "SPRING", 20, "SPRING 20" ),
    SUMMER_20( 1, "SUMMER", 20, "SUMMER 20" ),
    AUTUMN_20( 2, "AUTUMN", 20, "AUTUMN 20" ),
    WINTER_20( 3, "WINTER", 20, "WINTER 20" ),
    SPRING_21( 4, "SPRING", 21, "SPRING 21" ),
    SUMMER_21( 5, "SUMMER", 21, "SUMMER 21" ),
    AUTUMN_21( 6, "AUTUMN", 21, "AUTUMN 21" ),
    WINTER_21( 7, "WINTER", 21, "WINTER 21" ),
    SPRING_22( 8, "SPRING", 22, "SPRING 22" ),
    SUMMER_22( 9, "SUMMER", 22, "SUMMER 22" ),
    AUTUMN_22( 10, "AUTUMN", 22, "AUTUMN 22" ),
    WINTER_22( 11, "WINTER", 22, "WINTER 22" ),
    SPRING_23( 12, "SPRING", 23, "SPRING 23" ),
    SUMMER_23( 13, "SUMMER", 23, "SUMMER 23" ),
    AUTUMN_23( 14, "AUTUMN", 23, "AUTUMN 23" ),
    WINTER_23( 15, "WINTER", 23, "WINTER 23" ),
    SPRING_24( 16, "SPRING", 24, "SPRING 24" ),
    SUMMER_24( 17, "SUMMER", 24, "SUMMER 24" ),
    AUTUMN_24( 18, "AUTUMN", 24, "AUTUMN 24" ),
    WINTER_24( 19, "WINTER", 24, "WINTER 24" ),
    SPRING_25( 20, "SPRING", 25, "SPRING 25" ),
    SUMMER_25( 21, "SUMMER", 25, "SUMMER 25" ),
    AUTUMN_25( 22, "AUTUMN", 25, "AUTUMN 25" ),
    WINTER_25( 23, "WINTER", 25, "WINTER 25" ),
    SPRING_26( 24, "SPRING", 26, "SPRING 26" ),
    SUMMER_26( 25, "SUMMER", 26, "SUMMER 26" ),
    AUTUMN_26( 26, "AUTUMN", 26, "AUTUMN 26" ),
    WINTER_26( 27, "WINTER", 26, "WINTER 26" ),;

    private Integer order;
    private String seasonCode;
    private Integer year;
    private String name;

    Season( Integer order, String seasonCode, Integer year, String name ) {
        this.order = order;
        this.seasonCode = seasonCode;
        this.year = year;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
