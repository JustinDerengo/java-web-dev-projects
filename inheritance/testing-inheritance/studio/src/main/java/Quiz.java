import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        int score = 0;
        Scanner scnr = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            System.out.println("Question " + (i + 1) + ":");
            question.displayQuestion();
            question.displayPossibleAnswers();

            System.out.print("Your answer(s) (e.g., 'A' or 'A B'): ");
            String userAnswerInput = scnr.nextLine();
            String[] userAnswers = userAnswerInput.split(" ");

            boolean isCorrect = question.isCorrect(userAnswers);
            if (isCorrect) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
        }
        scnr.close();
        System.out.println("Quiz completed. Your score: " + score + " out of " + questions.size());
    }

    public static void main(String[] args) {
        // Example usage
        Quiz quiz = new Quiz();

        // Add questions to the quiz
        quiz.addQuestion(new MultipleChoice("What is the capital of France?",
                new String[]{"A"}, new String[]{"Paris", "London", "Berlin"}));
        quiz.addQuestion(new Checkbox("Which of the following are fruits?",
                new String[]{"A", "C"}, new String[]{"Apple", "Carrot", "Banana", "Cucumber"}));
        quiz.addQuestion(new TrueFalse("Is Java a programming language?", "A"));

        // Run the quiz
        quiz.runQuiz();
    }
}
