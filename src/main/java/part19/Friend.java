package part19;

// Declares the Friend class used to create Friend objects
public class Friend {

    // Stores the name that belongs to each individual Friend object
    String name;

    // Keeps one shared count that belongs to the Friend class
    static int numberOfFriends;

    // Stores the name of the most recently created Friend
    static String newestFriend;

    // Runs whenever a new Friend object is created
    Friend(String name) {

        // Saves the name into this Friend object's own name field
        this.name = name;

        // Adds one to the shared friend count
        numberOfFriends++;

        // Replaces the shared newest name with this new Friend's name
        newestFriend = name;
    }

    // Defines a static method that can be called through the Friend class
    static void displayFriends() {

        // Prints the current shared number of friends
        System.out.println("You have " + numberOfFriends + " friends");
    }
}