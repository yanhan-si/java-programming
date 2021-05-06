package lesson1.polymorphism;

public class Boat extends Vehicle {

    public Boat() {
        // Notice we are passing our arguments into our superclass (Vehicle) constructor
        super("Boat start", "Boat stop", "Boat speed", "Boat direction");
    }
}
