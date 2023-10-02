package dbEntity.supplier;

import dbEntity.enums.NamedConstant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public enum SupplierCategory implements NamedConstant {
    KNIT(0, "Knit", Arrays.asList( SupplierType.FABRIC, SupplierType.GARMENTS ) ),
    WOVEN(1, "Woven", Arrays.asList( SupplierType.FABRIC, SupplierType.GARMENTS ) ),
    KNITWEAR(2, "Knitwear", Arrays.asList( SupplierType.FABRIC, SupplierType.GARMENTS ) ),
    DENIM(3, "Denim", Arrays.asList( SupplierType.FABRIC, SupplierType.GARMENTS ) ),
    ACTIVE(4, "Active", Arrays.asList( SupplierType.FABRIC, SupplierType.GARMENTS ) ),
    PRINT(5, "Print", Arrays.asList( SupplierType.EMBELLISHMENT ) ),
    EMBROIDERY(6, "Embroidery", Arrays.asList( SupplierType.EMBELLISHMENT ) );


    private Integer value;
    private String name;
    private List<SupplierType> supplierTypes;

    SupplierCategory( Integer value, String name, List<SupplierType> supplierTypes ) {
        this.value = value;
        this.name = name;
        this.supplierTypes = supplierTypes;
    }

    @Override
    public String getName() {
        return name;
    }
    public Integer getValue() {
        return value;
    }

    public static List<SupplierCategory> filterBySupplierType(SupplierType supplierType ) {

        return Arrays.stream( SupplierCategory.values() )
                .filter( supplierCategory -> supplierCategory.supplierTypes.contains( supplierType ) )
                .collect( Collectors.toList() );

    }

    public static Set<SupplierType> getDistinctSupplierType() {

        Set<SupplierType> supplierTypeSet = new HashSet<>();
        for ( SupplierCategory supplierCategory : SupplierCategory.values() )
            supplierTypeSet.addAll( supplierCategory.supplierTypes );

        return supplierTypeSet;
    }



}
