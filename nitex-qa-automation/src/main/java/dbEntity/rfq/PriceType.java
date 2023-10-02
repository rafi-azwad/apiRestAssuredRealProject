package dbEntity.rfq;

import dbEntity.enums.NamedConstant;

import java.util.HashMap;
import java.util.Map;

///todo rename incoterms
public enum PriceType implements NamedConstant {

    CIF(0, "Cif"),
    FOB(1, "Fob"),
    FAS(2, "Fas"),
    CFR(3, "Cfr");

    private Integer value;
    private String name;
    private static Map<PriceType, String> priceTypeStringMap;

    static {

        priceTypeStringMap = new HashMap<>();

        priceTypeStringMap.put( CIF, "CIF, cost, insurance and freight" );
        priceTypeStringMap.put( FOB, "FOB, Freighy on board" );
    }

    public String getInfoTextForPrictType(){

        return PriceType.priceTypeStringMap.getOrDefault( this, "FOB, Freighy on board" );
    }

    PriceType( Integer val, String name ){

        this.value = val;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
