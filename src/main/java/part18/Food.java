package part18;

// Declares the Food class used to create Food objects
public class Food {

    // Stores the name that belongs to each Food object
    String name;

    // Defines a constructor that receives a name when a Food object is created
    Food(String name) {

        // Saves the name passed into the constructor into this Food object's name field
        this.name = name;
    }
}