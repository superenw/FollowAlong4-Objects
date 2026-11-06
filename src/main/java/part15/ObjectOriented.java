package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s
//        starts at about 2:59:30 — stop at about 3:09:48, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 15, video 2 — objects (object-oriented programming)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called ObjectOriented.
//    Leave the "package part15;" line and the "public class ObjectOriented" line alone.
//    He also makes a second class called Car. YOU make that file too:
//
// SECTION B — COMMENTS: put a // comment ABOVE every line of code.

// Declares a public class named ObjectOriented
public class ObjectOriented {

    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Creates a new Car object and stores its reference in myCar
        Car myCar = new Car();
        // Prints the model field belonging to the myCar object
        System.out.println(myCar.model);
    }
}