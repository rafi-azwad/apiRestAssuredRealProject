package dbEntity.document;

public enum DocumentGroup {
    PHYSICAL_SAMPLE(0),
    FLAT_SKETCH(1),
    ART_WORK(2),
    REFERENCE_IMAGE(3),
    FEATURE_IMAGE(4),
    DEFAULT(5),
    MATERIAL_IMAGE ( 6 ),
    ;

    private Integer value;

    DocumentGroup(Integer value) {
        this.value = value;
    }
}
