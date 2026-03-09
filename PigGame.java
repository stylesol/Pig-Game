/**
 * Write a description of class PigGame here.
 *
 * @author olivia
 * @version 9/03/26
 */
public class PigGame
{
    private final int MAX = 6; //number of sides of dice
    public int roll; 
        
    // this is what runs the constructor
    public dice(){
        this.roll();
        }
    public void roll() {
        roll = (int)(Math.random() * MAX + 1);
        // the +1 means that it cant roll a zero
    }
}
