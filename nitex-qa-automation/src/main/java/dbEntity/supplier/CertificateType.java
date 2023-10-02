package dbEntity.supplier;

import dbEntity.enums.NamedConstant;

public enum CertificateType implements NamedConstant {
    ISO(0, "ISO"),
    BSCI(1, "BSCI"),
    GOTS(2, "GOTS"),
    CCS(3, "CCS"),
    SFA(4, "SFA"),
    RWS(5, "RWS"),
    RDS(6, "RDS"),
    RCC_BLENDED(7, "RCC blended"),
    SEDEX(8, "SEDEX"),
    OCS(9, "OCS"),
    GRS(10, "GRS"),
    OEKOTEX(11, "OEKOTEX"),
    WRAP(12, "WRAP"),
    RCS_ACCORD(13, "RCS"),
    HIGG(14, "HIGG"),
    RSC_ACCORD(15, "RSC/ACCORD")
    ;

    private Integer value;
    private String name;

    CertificateType( Integer value, String name ) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
