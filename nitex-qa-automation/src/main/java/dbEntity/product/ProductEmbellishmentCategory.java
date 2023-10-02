package dbEntity.product;

public enum ProductEmbellishmentCategory {
    
    PRINT(0),
    WASH(1),
    EMBROIDERY(2);
    
    private Integer value;
    
    ProductEmbellishmentCategory( Integer value ) {
        this.value = value;
    }
}
