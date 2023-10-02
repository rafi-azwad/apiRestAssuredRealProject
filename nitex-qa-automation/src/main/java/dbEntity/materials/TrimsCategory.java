package dbEntity.materials;

public enum TrimsCategory {
    BUTTONS(0, "Buttons", "B"),
    SNAP_BUTTONS(1, "Snap buttons", "SB"),
    EYELETS(2, "Eyelets", "E"),
    SHOULDER_PAD(3, "Shoulder pad", "SP"),
    HOOKS(4, "Hooks", "H"),
    ADJUSTER_RING_SLIDERS(5, "Adjuster/ring sliders", "AR"),
    STOPPERS(6, "Stoppers", "ST"),
    DRAWSTRING(7, "Drawstring", "DS"),
    TIPPING(8, "Tipping", "TP"),
    TAPE(9, "Tape", "TA"),
    BUCKLE(10, "Buckle", "BK"),
    RING(11, "Ring", "R"),
    D_RING(12, "D-ring", "DR"),
    MOVILON(13, "MOVILON", "M"),
    ELASTIC(14, "Elastic", "EL"),
    ZIPPER(15, "Zipper", "ZI"),
    PULLER(16, "Puller", "PL"),
    VELCRO_TAPE(17, "Velcro tape", "VT"),
    RIVETS(18, "Rivets", "RV"),
    SEWING_THREAD(19,"Sewing thread","ST"),
    INTERLINING(20,"Interlining","I"),
    BADGE(21,"Badge","BG"),
    MAIN_LABEL  (22, "Main label", "ML"),
    SIZE_LABEL  (23, "Size label", "SL"),
    CARE_LABEL  (24, "Care label", "CL"),
    COMPOSITE_LABEL  (25, "Composite label", "CL"),
    PATCH  (26, "Patch", "P"),
    MAIN_AND_SIZE_LABEL  (27, "Main & size label", "MSL"),
    SHADE_LABEL  (28, "Shade label", "SL"),
    ;

    private Integer order;
    private String name;
    private String code;

    TrimsCategory( Integer order, String name, String code ) {
        this.order = order;
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
