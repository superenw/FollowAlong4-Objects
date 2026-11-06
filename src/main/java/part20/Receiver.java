package part20;

// Creates the Receiver class that stores a receiver's information and statistics
public class Receiver {
    // Stores the receiver's name and keeps it private from other classes
    private String name;
    // Stores the receiver's jersey number
    private int number;
    // Keeps track of how many passes this receiver has caught
    private int catches;
    // Keeps track of the receiver's total receiving yards
    private int yards;
    // Creates a receiver using a name and jersey number
    public Receiver(String name, int number) {
        // Saves the given name into this receiver's name
        this.name = name;
        // Saves the given jersey number into this receiver's number
        this.number = number;
    }
    // Lets other classes read the receiver's name
    public String getName() {
        return name;
    }
    // Lets other classes read the receiver's jersey number
    public int getNumber() {
        return number;
    }
    // Lets other classes see how many catches the receiver has
    public int getCatches() {
        return catches;
    }
    // Lets other classes see the receiver's total yards
    public int getYards() {
        return yards;
    }
    // Records a completed pass and the yards gained on the play
    public void catchBall(int gain) {
        // Adds one catch to this receiver's total
        catches++;
        // Adds the yards from this catch to the receiver's total yards
        yards = yards + gain;
    }
    // Gives back a readable description of this receiver and his statistics
    public String toString() {
        return "#" + number + " " + name + ": " + catches + " catches, " + yards + " yards";
    }
}