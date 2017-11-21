package AnswerStrategy;

/**
 * Created by StasMaster on 21.11.17.
 */
public class DefaultAnswer implements AnswerStrategy {

    private String code = "Default Answer";

    @Override
    public String formAnswer() {
        return "Вибач, та я поки вмію тільки показувати наявні події, оголошення, тощо, але скоро я зможу дещо більше!\n" +
                "А поки, тисни /schedule";
    }
}
