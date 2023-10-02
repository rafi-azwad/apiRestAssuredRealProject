package dbEntity.setting;

public enum MailPreference {

    ALL(0),
    NONE(1),
    LIMITED(2);

    private Integer val;

    MailPreference( Integer val ){

        this.val = val;
    }
}
