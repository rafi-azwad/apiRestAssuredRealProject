package dbEntity.materials;

import java.util.List;

public enum MaterialType {
    MAIN_FABRIC(0, "F", "Main fabric" ),
    EXTRA_FABRIC(1, "F", "Extra fabric" ),
    TRIMS(2, "T", "Trims" ),
    BRANDING(3, "A", "Branding" ),
    LIBRARY_FABRIC(4, "F", "Library fabric" ),
    WASHING_PROCESS(5, "W", "Washing process" ),
    EMBELLISHMENT(6, "E", "Embellishment" ),
    GARMENT(6, "G", "Garment" ),
    DESIGN_FABRIC(7, "F", "Design Fabric" );



    private Integer value;
    private String code;
    private String name;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Boolean isFabric(){
        return List.of( LIBRARY_FABRIC, MAIN_FABRIC, EXTRA_FABRIC ).contains( this );
    }

    MaterialType(Integer value, String code, String name ) {
        this.value = value;
        this.code = code;
        this.name = name;
    }
}
