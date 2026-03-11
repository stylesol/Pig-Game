import java.util.Scanner;
/**
 * Write a description of class driver here.
 *
 * @author Olivia
 * @version 4/03/26
 */
public class Driver
{
    public static void main(String[] args) {
        
        // A lot of variables here, you prob doin't need them all
        int player1 = 0; // person 1
        int player2 = 0 ; // person 2
        int round = 0; 

        //  welcoming statement
        System.out.println("Welcome to the pig game");
        System.out.println("");
        System.out.println("Round " + round);
        
        Scanner reader = new Scanner(System.in);
        String choice = "y"; // this is for while loop
        

        PigGame myGame = new PigGame();
        //player 1
        while (choice.equals("y")){
        // create dice to flip
        
        //getting dice to flip
        myGame.roll();
    
        // gives us the numbers
        //System.out.println("Dice rolled: " + myGame.getRoll()); 
        
        // Get the dice totals - add to play total

        int currentRoll = myGame.getRoll();
        
        // checking number rolled
        if (currentRoll == 1) {
            // no points if 1 rolled
            System.out.println("You rolled a 1! ");
            System.out.println("You lose all your points");
            System.out.println(" "); // spacing beteeen code
        } else {
            player1 += currentRoll; // Just add it once!
            System.out.println(" "); // spacing beteeen code
            
            //asks to play again
            System.out.print("Roll again? (y/n): ");
            choice = reader.nextLine();
        }

        // player 2s turn
        
        myGame.roll();

        player2 = myGame.getRoll();
        System.out.println("Player 2s total is: " + player2);
        

        System.out.println("Player 2's Turn ");
        choice = "y"; // Reset so Player 2 can start 
        
        while (choice.equals("y")) {
            myGame.roll();
            int currentRoll2 = myGame.getRoll();
            if (currentRoll2 == 1) {
                System.out.println("You rolled a 1! ");
                System.out.println("You lose all your points");
                System.out.println(" "); // spacing beteeen code                choice = "n"; 
            } else {
                player2 += currentRoll2;
                System.out.println("Player 2 rolled: " + currentRoll2);
                System.out.println("Player 2 Total: " + player2);
                System.out.print("Roll again? (y/n): ");
                choice = reader.nextLine();
            }
        }
        
        System.out.println("Game Over!");
        System.out.println("Final Scores");
        System.out.println("  ");
        ///System.out ---- players scores and who wom
    }
}
}