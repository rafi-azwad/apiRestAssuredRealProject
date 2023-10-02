package dbEntity.staticcontent;

public enum ContentType {
    LOGIN_BACKGROUND(0),
    GREETING(1),
    QUOTATIONS(2),
    OTHERS(3),
    ;

    private Integer value;

    ContentType( Integer value ){
        this.value = value;
    }

}
