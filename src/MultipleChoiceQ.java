public class MultipleChoiceQ extends Question
{
    public MultipleChoiceQ(String questionText, String correctAnswer){

        super(questionText, correctAnswer);
    }

    public boolean CheckAnswer(String userInput){
        return this.correctAnswer.equals(userInput);
    }
}
