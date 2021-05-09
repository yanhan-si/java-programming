package lesson1.genericsExample;

import java.util.ArrayList;

public class GenericsExercise {
    public static void main(String[] args) {
        ArrayList<Object> variables = new ArrayList<Object>();
        Double doubleNumber = 1.5;
        String name = "Sally";
        int intNumber = 1;
        char letter = 'a';

        variables.add(doubleNumber);
        variables.add(name);
        variables.add(intNumber);
        variables.add(letter);

        for (Object variable : variables) {
            GenericsExercise.displayClassName(variable);
        }

    }
    static <T> void displayClassName(T variable) {
        System.out.println(variable.getClass().getName());
    }
}
