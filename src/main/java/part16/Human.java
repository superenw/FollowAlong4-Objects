package part16;
// Declares the Human class that will be used as a blueprint for Human objects
public class Human {
    // Stores the name that belongs to each Human object
    String name;
    // Stores the age that belongs to each Human object
    int age;
    // Stores the weight that belongs to each Human object
    double weight;
    // Defines a constructor that receives a name, age, and weight when a Human is created
    Human(String name, int age, double weight) {
        // Saves the name parameter into this Human object's name attribute
        this.name = name;
        // Saves the age parameter into this Human object's age attribute
        this.age = age;
        // Saves the weight parameter into this Human object's weight attribute
        this.weight = weight;
    }
    // Defines an eat method that can be called on a Human object
    void eat() {
        // Prints the name of this Human followed by an eating message
        System.out.println(this.name + " is eating");
    }
    // Defines a drink method that can be called on a Human object
    void drink() {
        // Prints the name of this Human followed by a drinking message
        System.out.println(this.name + " is drinking *burp*");
    }
}