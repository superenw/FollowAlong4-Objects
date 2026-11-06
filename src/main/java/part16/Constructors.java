package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        starts at about 3:10:07 — stop at about 3:19:32, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 16, video 1 — constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called Constructors.
//    Leave the "package part16;" line and the "public class Constructors" line alone.
//    He also has a second class called Human. YOU make that file too.
//
// SECTION B — COMMENTS: put a // comment ABOVE every line of code,
//    in THIS file AND in Human.java, saying in YOUR OWN WORDS what that line does.
// Declares the public Constructors class
public class Constructors {
    // Defines the main method where the program starts
    public static void main(String[] args) {
        // Creates a Human object named human1 and passes in its name, age, and weight
        Human human1 = new Human("Rick", 65, 70);
        // Creates a second Human object with different information
        Human human2 = new Human("Morty", 16, 50);
        // Prints the name stored inside human1
        System.out.println(human1.name);
        // Prints the name stored inside human2
        System.out.println(human2.name);
        // Calls human1's eat method
        human1.eat();
        // Calls human2's drink method
        human2.drink();
    }
}