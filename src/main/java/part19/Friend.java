package part19;

// Declares the Friend class used to create Friend objects
public class Friend {
    // Stores the name that belongs to each individual Friend object
    String name;
    // Keeps one shared count that belongs to the Friend class
    static int numberOfFriends;
    // Runs whenever a new Friend object is created
    Friend(String name) {
        // Saves the name passed in into this Friend object's own name field
        this.name = name;
        // Adds one to the shared total every time a Friend is created
        numberOfFriends++;
    }
    // Defines a static method that can be called directly through the Friend class
    static void displayFriends() {
        // Prints the current shared number of Friend objects
        System.out.println("You have " + numberOfFriends + " friends");
    }
}