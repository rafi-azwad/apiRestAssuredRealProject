package dbEntity.notification;

public enum TitlePartType {
    ACTOR(0),
    ACTION(1),
    PREPOSITION(2),
    ACTED_UPON(3),
    PREVIOUS_VALUE(4),
    NEW_VALUE(5),
    PERSON(6);

    private Integer value;

    TitlePartType(Integer value ) {
        this.value = value;
    }
}
