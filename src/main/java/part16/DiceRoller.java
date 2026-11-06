package part16;
// Imports the Random class so the program can generate random numbers
import java.util.Random;
// Declares the DiceRoller class
public class DiceRoller {
    // Declares a Random variable that every method in this object can access
    Random random;
    // Declares an int variable that every method in this object can access
    int number;
    // Defines the constructor that runs when a DiceRoller object is created
    DiceRoller() {
        // Creates a Random object and stores it in the global random variable
        random = new Random();
        // Calls the roll method when the DiceRoller object is created
        roll();
    }
    // Defines a method that rolls a random number from 1 through 6
    void roll() {
        // Generates a random number from 1 to 6 and stores it in number
        number = random.nextInt(6) + 1;
        // Prints the number that was rolled
        System.out.println(number);
    }
}