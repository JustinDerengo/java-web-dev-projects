public class TrueFalse extends Question {
    public TrueFalse(String question, String correctAnswer) {
        super(question, new String[]{correctAnswer});
    }

    @Override
    public void displayPossibleAnswers() {
        System.out.println("A. True");
        System.out.println("B. False");
    }
}