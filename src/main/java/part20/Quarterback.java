package part20;

// Creates the Quarterback class that stores quarterback information and passing statistics
public class Quarterback {
    // Stores the quarterback's name
    private String name;
    // Stores the longest pass this quarterback can successfully throw
    private int armStrength;
    // Counts every pass the quarterback attempts
    private int attempts;
    // Counts how many attempted passes are completed
    private int completions;
    // Stores the total yards gained from completed passes
    private int passingYards;
    // Creates a quarterback with a name and maximum throwing distance
    public Quarterback(String name, int armStrength) {
        // Saves the given name into this quarterback's name
        this.name = name;
        // Saves the maximum throwing distance for this quarterback
        this.armStrength = armStrength;
    }
    // Lets other classes read the quarterback's name
    public String getName() {
        return name;
    }
    // Gives back the quarterback's number of pass attempts
    public int getAttempts() {
        return attempts;
    }
    // Gives back the quarterback's number of completed passes
    public int getCompletions() {
        return completions;
    }
    // Gives back the total passing yards
    public int getPassingYards() {
        return passingYards;
    }
    // Attempts a pass to a Receiver object for a certain number of yards
    public boolean throwTo(Receiver target, int yards) {
        // Every throw counts as an attempt whether it is caught or not
        attempts++;
        // Checks whether the requested throw is farther than this quarterback can throw
        if (yards > armStrength) {
            // Prints that the pass was incomplete because it was too far
            System.out.println(name + " -> " + target.getName() + ", " + yards + " yards: INCOMPLETE");
            // Reports that the pass was not completed
            return false;
        }
        // Adds one completed pass because the throw was within the quarterback's range
        completions++;
        // Adds the completed pass's yards to the quarterback's passing total
        passingYards = passingYards + yards;
        // Tells the receiver that the pass was caught so their stats also change
        target.catchBall(yards);
        // Prints the completed-pass result
        System.out.println(name + " -> " + target.getName() + ", " + yards + " yards: CAUGHT");
        // Reports that the pass was completed
        return true;
    }
    // Calculates the percentage of pass attempts that were completed
    public int completionPercentage() {
        // Prevents division by zero when the quarterback has not thrown a pass
        if (attempts == 0) {
            return 0;
        }
        // Multiplies first so integer division does not turn something like 2 / 3 into zero
        return completions * 100 / attempts;
    }
    // Gives back the quarterback's passing statistics as one String
    public String toString() {
        return name + ": " + completions + "/" + attempts + ", "
                + passingYards + " yards, " + completionPercentage() + "%";
    }
    // Overloads throwTo so a pass with only a receiver automatically uses 10 yards
    public boolean throwTo(Receiver target) {
        // Uses the original throwTo method instead of repeating all of its code
        return throwTo(target, 10);
    }
}