package part17;
// Declares the Car class used to create Car objects
public class Car {
    // Gives every Car object the make "Ford"
    String make = "Ford";
    // Gives every Car object the model "Mustang"
    String model = "Mustang";
    // Gives every Car object the color "red"
    String color = "red";
    // Gives every Car object the year 2021
    int year = 2021;
    // Overrides the built-in toString method so a Car has its own text description
    public String toString() {
        // Returns all four car fields as one String with each value on a new line
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}