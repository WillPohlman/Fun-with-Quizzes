public class QuizRunner
{
    public static void main(String[] args){

        Quiz quiz1 = new Quiz();
        TrueOrFalseQ sunQ = new TrueOrFalseQ("Is the sun hot?", "1");
        quiz1.addQuestion(sunQ);

        MultipleChoiceQ mathQ = new MultipleChoiceQ("What does 2+2=?", "4");
        mathQ.addOption("5");
        mathQ.addOption("2");
        mathQ.addOption("3");
        mathQ.addOption("4");
        quiz1.addQuestion(mathQ);

        CheckboxQ flagQ = new CheckboxQ("What are the colors of the American Flag?", "124");
        flagQ.addOption("Red");
        flagQ.addOption("White");
        flagQ.addOption("Green");
        flagQ.addOption("Blue");
        quiz1.addQuestion(flagQ);



        quiz1.runQuiz();
    }
}
