package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        starts at about 3:50:00 — stop at about 3:57:15, at "that's the basics of the static keyword"
// Guide: GUIDE.md in this folder, steps 1–9
//
// Part 19 — the static keyword
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StaticKeyword.
//    Leave the "package part19;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Friend. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Friend.java too.

// Declares the public StaticKeyword class
public class StaticKeyword {

    // Defines the main method where the program starts
    public static void main(String[] args) {

        // Prints the shared friend count before any Friend objects are created
        System.out.println(Friend.numberOfFriends);
        // Creates the first Friend, which increases the shared count to 1
        Friend friend1 = new Friend("SpongeBob");
        // Prints the shared count through the Friend class
        System.out.println(Friend.numberOfFriends);
        // Creates a second Friend and increases the same shared count
        Friend friend2 = new Friend("Patrick");
        // Prints the shared count, which is now 2
        System.out.println(Friend.numberOfFriends);
        // Creates a third Friend and increases the shared count again
        Friend friend3 = new Friend("Squidward");
        // Prints the shared count, which is now 3
        System.out.println(Friend.numberOfFriends);
        // Calls the static displayFriends method using the class name
        Friend.displayFriends();
        // Creates a fourth Friend, which changes the shared count from 3 to 4
        Friend friend4 = new Friend("Sandy");
        // Calls the static method again to show the new total
        Friend.displayFriends();
    }
}