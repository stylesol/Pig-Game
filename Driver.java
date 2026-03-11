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
        
        //player 1
        while (choice.equals("y")){
        // create dice to flip
        PigGame myGame = new PigGame();
        
        //getting dice to flip
        myGame.roll();
    
        // gives us the numbers
        System.out.println("Dice rolled: " + myGame.getRoll()); 
        
        // Get the dice totals - add to play total

        player1 = myGame.getRoll();
        System.out.println("Player 1s total is: " + player1);        
        
        // checking number rolled
        if (player1 == 1) {
            // no points if 1 rolled
            System.out.println("You rolled a 1! ");
            System.out.println("You lose all your points");
            System.out.println(" "); // spacing beteeen code
        } else if (player1 > 1) {
            // if it doesnt roll 1, adds points to total
            System.out.println("You rolled a " + myGame.getRoll());
            player1 = player1 + myGame.getRoll();
            System.out.println(" "); // spacing beteeen code

            System.out.println("Round total: " + player1);
            System.out.println(" "); // spacing beteeen code

            //asks to play again
            System.out.print("Roll again? (y/n): ");
            choice = reader.nextLine();
        } else{
            //idk but its telling user something not right
            System.out.println("uh oh theres an error");
            System.out.println(" "); // spacing beteeen code

        }

        // player 2s turn
        
        myGame.roll();

        player2 = myGame.getRoll();
        System.out.println("Player 2s total is: " + player2);
        
        
        // ask user if they want to roll again and if no bye them
        // if yes, restart loop        
    }
    }
}