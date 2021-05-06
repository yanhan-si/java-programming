package lesson1.polymorphism;

public class Car extends Vehicle {

    public Car() {
        // Notice we are passing our arguments into our superclass (Vehicle) constructor
        super("Car start", "Car stop", "Car speed", "Car direction");
    }

}