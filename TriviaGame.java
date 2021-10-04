import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TriviaGame{
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    private TriviaGame(){
        ArrayList<Question> questions = new ArrayList<Question>();
        int numQuestions = Integer.parseInt(reader.nextLine());
        for(int i = 0; i < numQuestions; i++) { 
        }


    
    }
    public static TriviaGame getInstance(){
        return triviaGame;
        
    }
    public void play(){

    }
    private boolean playRound(){
        return true;

    }

}