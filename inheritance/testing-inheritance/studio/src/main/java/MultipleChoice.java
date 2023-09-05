public class MultipleChoice extends Question {
    private String[] choices;

    public MultipleChoice(String question, String[] correctAnswers, String[] choices) {
        super(question, correctAnswers);
        this.choices = choices;
    }

    @Override
    public void displayPossibleAnswers() {
        for (int i = 0; i < choices.length; i++) {
            System.out.println((char) ('A' + i) + ". " + choices[i]);
        }
    }
}