import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String play = "yes";
        while(play.equals("yes")){
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;
            while(guess != randNum)
            {
                System.out.println("Guess a Number between 1 and 100 : ");
                guess = reader.nextInt();
                tries++;
                if(tries==10)
                {
                	System.out.println("Sorry ! You have reached the Limit to Guess the Number !!");
                    System.out.println("Would you like to Play again ?");
                    System.out.println("Yes or No : ");
                    play = reader.next().toLowerCase();
                }
                if(guess == randNum)
                {
                    System.out.println("Great ! You Guessed the Correct Number !!");
                    System.out.println("It only took you "+tries+" Guesses !!");
                    System.out.println("Your Score is "+tries+"");
                    System.out.println("Would you like to Play again ?");
                    System.out.println("Yes or No : ");
                    play = reader.next().toLowerCase();
                }
                else if(guess > randNum){
                    System.out.println("Your Guess is Too High, Try again..");
                }
                else{
                    System.out.println("Your Guess is Too Low, Try again..");
                }
            }
        }
        reader.close();
    }    
}
