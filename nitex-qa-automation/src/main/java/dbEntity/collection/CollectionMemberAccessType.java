package dbEntity.collection;

public enum CollectionMemberAccessType {

    OWNER_ACCESS(0),
    WRITE_ACCESS(1),
    READ_ACCESS(2);

    private Integer value;

    CollectionMemberAccessType( Integer value ) {
        this.value = value;
    }
}
