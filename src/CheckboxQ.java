public class CheckboxQ extends Question
{
    public CheckboxQ(String questionText, String correctAnswer){
        super(questionText + " (Enter the numbers of all correct answers, in order with no spaces.)", correctAnswer);
    }

    public boolean CheckAnswer(String userInput){
        return this.correctAnswer.equals(userInput);
    }
}
