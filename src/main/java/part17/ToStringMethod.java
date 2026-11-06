package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        starts at about 3:32:20 — stop at about 3:38:30, at "that's how the toString method works"
// Guide: GUIDE.md in this folder, steps 8–12
//
// Part 17, topic 2 — the toString method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ToStringMethod.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Car. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Car.java too.

// Declares the public class named ToStringMethod
public class ToStringMethod {
    // Defines the main method where the program begins
    public static void main(String[] args) {
        // Creates a new Car object and stores it in a variable named car
        Car car = new Car();
        // Prints the make stored inside the car object
        System.out.println(car.make);
        // Prints the model stored inside the car object
        System.out.println(car.model);
        // Prints the color stored inside the car object
        System.out.println(car.color);
        // Prints the year stored inside the car object
        System.out.println(car.year);
        // Calls the car object's toString method directly and prints what it returns
        System.out.println(car.toString());
        // Prints the car object, which automatically calls its toString method
        System.out.println(car);
    }
}