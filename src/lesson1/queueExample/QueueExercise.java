package lesson1.queueExample;

import java.util.*;

public class QueueExercise {
    public static void main(String[] args) {

        Queue<String> queuedCustomers = new LinkedList<>();

        queuedCustomers.add("1234"); // customer 1234 takes a number
        queuedCustomers.add("3412"); // customer 3412 takes a number
        queuedCustomers.add("0123"); // customer 0123 takes a number
        queuedCustomers.add("4321"); // customer 4321 takes a number

        while (!queuedCustomers.isEmpty()) {
            System.out.println("Customer " + queuedCustomers.poll() + " is getting helped");
        }

    }
}
