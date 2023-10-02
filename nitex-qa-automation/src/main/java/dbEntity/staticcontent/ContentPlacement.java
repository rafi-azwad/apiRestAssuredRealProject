package dbEntity.staticcontent;

public enum ContentPlacement {
    LOGIN_PAGE(0 ),
    BUYER_HOME_PAGE(1 ),
    ;
    private Integer value;

    ContentPlacement( Integer value ){
        this.value = value;
    }
}
