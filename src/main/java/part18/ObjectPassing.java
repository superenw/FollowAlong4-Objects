package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13478s
//        starts at about 3:44:40 — stop at about 3:49:20, at "that's the basics of sending objects as arguments"
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 18, topic 2 — passing objects to a method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ObjectPassing.
//    Leave the "package part18;" line and the class line alone. Type everything else yourself.
//    You also make two new classes, Garage and Car. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Garage.java and Car.java too.

// Declares the public class named ObjectPassing
public class ObjectPassing {

    // Defines the main method where the program starts
    public static void main(String[] args) {

        // Creates a Garage object that can use the park method
        Garage garage = new Garage();

        // Creates a Car object named car1 with BMW as its name
        Car car1 = new Car("BMW");

        // Creates a second Car object named car2 with Tesla as its name
        Car car2 = new Car("Tesla");

        // Sends car1 into the garage's park method
        garage.park(car1);

        // Sends car2 into the same park method
        garage.park(car2);
    }
}