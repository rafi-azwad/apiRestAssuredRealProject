package dbEntity.step;

public enum TemplateVersion {
    ZERO(0, "Initial template"),
    ONE(1, ""),
    TWO(2, ""),
    THREE(3, ""),
    FOUR(4, "Introducing deliverables"),
    ;

    private Integer number;
    private String description;

    TemplateVersion(Integer number, String description) {
        this.number = number;
        this.description = description;
    }
}
