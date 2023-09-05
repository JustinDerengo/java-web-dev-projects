abstract class Question {
    private String question;
    private String[] correctAnswers;

    public Question(String question, String[] correctAnswers) {
        this.question = question;
        this.correctAnswers = correctAnswers;
    }

    public void displayQuestion() {
        System.out.println(question);
    }

    abstract void displayPossibleAnswers()
            ;
    public boolean isCorrect(String[] userAnswers) {
        if (correctAnswers.length != userAnswers.length) {
            return false;
        }
        for (String userAnswer : userAnswers) {
            boolean isCorrect = false;
            for (String correctAnswer : correctAnswers) {
                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                    isCorrect = true;
                    break;
                }
            }
            if (!isCorrect) {
                return false;
            }
        }
        return true;
    }

}
