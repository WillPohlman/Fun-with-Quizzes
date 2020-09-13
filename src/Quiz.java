import java.util.ArrayList;
import java.util.Scanner;

public class Quiz
{
    private ArrayList<Question> questions;
    private double correctAnswers;
    private double score;

    public Quiz(){
        this.questions = new ArrayList<>();
        this.correctAnswers = 0;
    }

    public void addQuestion(Question q){
        questions.add(q);
    }

    public void runQuiz(){
        Scanner input = new Scanner(System.in);
        String userAnswer;

        for(Question currentQuest :questions){
            ArrayList<String> optionsArray = currentQuest.getOptions();
            int i = 1;

            System.out.println(currentQuest.getQuestionText());
            for(String option: optionsArray){
                System.out.println(i + ") " + option);
                i++;
            }
            System.out.print("Enter the number next to the correct answer: ");
            userAnswer = input.nextLine();
            if(currentQuest.CheckAnswer(userAnswer)){
                System.out.println("Correct!");
                this.correctAnswers++;
            }else{
                System.out.println("Incorrect.");
            }
        }
        this.score = (this.correctAnswers/this.questions.size())*100;
        System.out.println("Your score was " + this.score + "%");

    }
}
