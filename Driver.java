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
        int player1 = 0; // person
        int player2 = 0 ; // computer
        int round = 0;

        
        System.out.println("Welcome to the pig game");
        System.out.println("");
        System.out.println("Round " + round);
        
        
        // create dice to flip
        dice myDice = new dice();
        
        //getting dice to flip
        myDice.roll();
        
        // gives us the numbers
        System.out.println("Dice rolled: " + myDice.getRoll()); 
        
        
        // Get the dice totals - add to play total

        player1 = myDice.getRoll();
        System.out.println("The players total is: " + player1);        
        
        player2 = myDice.getRoll();
        System.out.println("The computers total is: " + player2);

        
        if (player1 == 1) {
            System.out.println("You rolled a 1! ");
            System.out.println("You lose all your points");
        } else if (player1 < 1) {
            System.out.println(" You rolled a " + myDice.getRoll());
            // ask user if they want to roll again and if no bye them
            // if yes, restaet loop
        }

        // add number to user roll
        
        // computer one. stips once it hits 20.
    }
}