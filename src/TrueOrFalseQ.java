public class TrueOrFalseQ extends Question
{
    public TrueOrFalseQ(String questionText, String correctAnswer){
        super(questionText, correctAnswer);
        this.addOption("True");
        this.addOption("False");
    }

    public boolean CheckAnswer(String userInput){
        return this.correctAnswer.equals(userInput);
    }
}
