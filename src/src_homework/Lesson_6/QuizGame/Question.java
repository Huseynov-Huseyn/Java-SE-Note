package src_homework.Lesson_6.QuizGame;

public class Question {

    private final String questionText;
    private final String variantA;
    private final String variantB;
    private final String variantC;
    private final String correctVariant;
    private final int questionPoint;

    public Question(String questionText, String variantA, String variantB, String variantC, String correctVariant, int questionPoint) {
        this.questionText = questionText;
        this.variantA = variantA;
        this.variantB = variantB;
        this.variantC = variantC;
        this.correctVariant = correctVariant;
        this.questionPoint = questionPoint;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectVariant() {
        return correctVariant;
    }

    public String getVariantA() {
        return variantA;
    }

    public String getVariantB() {
        return variantB;
    }

    public String getVariantC() {
        return variantC;
    }

    public int getQuestionPoint() {
        return questionPoint;
    }

    @Override
    public String toString() {
        return "Question{" +
                "correctVariant='" + correctVariant + '\'' +
                ", questionText='" + questionText + '\'' +
                ", variantA='" + variantA + '\'' +
                ", variantB='" + variantB + '\'' +
                ", variantC='" + variantC + '\'' +
                ", questionPoint=" + questionPoint +
                '}';
    }
}