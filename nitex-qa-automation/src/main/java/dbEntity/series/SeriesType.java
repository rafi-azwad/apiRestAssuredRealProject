package dbEntity.series;

public enum SeriesType {
    STYLE_NUMBER(0),
    FABRIC_NUMBER(1),
    TRIMS_NUMBER(2),
    BRANDING_NUMBER(3),
    INVOICE_NUMBER(4),
    SALES_CONTRACT_NUMBER(5),
    ART_BOARD_POSITION_NUMBER(6),
    SAMPLE_REQUEST_NUMBER(7),
    QUOTE_REQUEST_NUMBER(8),
    MATERIAL_NUMBER(9)
    ;

    private Integer value;

    SeriesType(Integer value) {
        this.value = value;
    }
}
