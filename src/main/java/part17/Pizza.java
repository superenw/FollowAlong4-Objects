package part17;
// Declares the Pizza class used to create Pizza objects
public class Pizza {
    // Stores the bread for each Pizza object
    String bread;
    // Stores the sauce for each Pizza object
    String sauce;
    // Stores the cheese for each Pizza object
    String cheese;
    // Stores the topping for each Pizza object
    String topping;
    // Defines a constructor for a pizza with four ingredients
    Pizza(String bread, String sauce, String cheese, String topping) {
        // Saves the bread that was passed in to this pizza's bread field
        this.bread = bread;
        // Saves the sauce that was passed in to this pizza's sauce field
        this.sauce = sauce;
        // Saves the cheese that was passed in to this pizza's cheese field
        this.cheese = cheese;
        // Saves the topping that was passed in to this pizza's topping field
        this.topping = topping;
    }
    // Defines an overloaded constructor for a pizza with bread, sauce, and cheese
    Pizza(String bread, String sauce, String cheese) {
        // Saves the bread for this pizza
        this.bread = bread;
        // Saves the sauce for this pizza
        this.sauce = sauce;
        // Saves the cheese for this pizza
        this.cheese = cheese;
    }
    // Defines an overloaded constructor for a pizza with only bread and sauce
    Pizza(String bread, String sauce) {
        // Saves the bread for this pizza
        this.bread = bread;
        // Saves the sauce for this pizza
        this.sauce = sauce;
    }
    // Defines an overloaded constructor for a pizza with only bread
    Pizza(String bread) {
        // Saves the bread for this pizza
        this.bread = bread;
    }
    // Defines an overloaded constructor that creates a pizza without any ingredients
    Pizza() {

    }
}