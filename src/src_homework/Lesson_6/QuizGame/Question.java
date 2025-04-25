    package src_homework.Lesson_6.QuizGame;

    public class Question {

        String questionText;
        String variantA;
        String variantB;
        String variantC;
        String correctVariant;

        public Question(String questionText, String variantA, String variantB, String variantC, String correctVariant) {
            this.questionText = questionText;
            this.variantA = variantA;
            this.variantB = variantB;
            this.variantC = variantC;
            this.correctVariant = correctVariant;
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

        @Override
        public String toString() {
            return "Question{" +
                    "correctVariant='" + correctVariant + '\'' +
                    ", questionText='" + questionText + '\'' +
                    ", variantA='" + variantA + '\'' +
                    ", variantB='" + variantB + '\'' +
                    ", variantC='" + variantC + '\'' +
                    '}';
        }

    }