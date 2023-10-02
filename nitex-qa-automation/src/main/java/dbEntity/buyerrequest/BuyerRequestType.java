package dbEntity.buyerrequest;

public enum BuyerRequestType {
    SAMPLE(0),
    QUOTES(1),
    ORDER(2),
    COLLECTION(3)
    ;
    private Integer value;

    BuyerRequestType( Integer value ){
        this.value = value;
    }
}
