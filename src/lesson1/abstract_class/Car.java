package lesson1.abstract_class;

public class Car extends Vehicle {

    public Car() {
        super("Car start", "Car stop", "Car direction");
    }
    @Override
    public void speed() {
        System.out.println("55");
    }
}