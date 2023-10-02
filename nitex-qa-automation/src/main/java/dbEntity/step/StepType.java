package dbEntity.step;

public enum StepType {
    TASK( 0 ),
    REVIEW( 1 );

    private Integer value;

    StepType( Integer value ){

        this.value = value;
    }


}
