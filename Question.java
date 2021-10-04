
public class Question{
    private String question;
    private String[] answers;
    private int correctAnswer;


    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
    
    }
    public String toString(){
        return  question + '\n' + "1 " +answers+ '\n' + "2" + answers+ '\n' + "3" +answers+ '\n' + "4" +answers;   
    }
    public boolean isCorrect(int userAnswer){
        if(userAnswer == correctAnswer){
            return true;
        }else {
            return false;
        }
    }
    public String getCorrectAnswer(){
        return "YAY! You got it right ";

        
    }
}