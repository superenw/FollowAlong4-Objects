package part18;

// Declares the Garage class
public class Garage {

    // Defines a method that requires a Car object to be passed into it
    void park(Car car) {

        // Uses the passed-in car's name to print which car was parked
        System.out.println("The " + car.name + " is parked in the garage");
    }
}