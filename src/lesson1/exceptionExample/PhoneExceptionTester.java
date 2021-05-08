package lesson1.exceptionExample;

/**
 * You can create and throw your own exceptions by extending the Exception classes
 * There are two types of exceptions in Java: Checked and unchecked.
 * Checked exceptions will get caught at compile time and will not allow the code
 * to build until they are either in a catch block or thrown. Unchecked (or runtime)
 * exceptions are not checked by the compiler.
 */


public class PhoneExceptionTester {
    public static void main(String[] args) {
        String[] numbers = new String[] { "123-4567", null, "234-4567", "345-5678" };

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(new Phone("iPhone", numbers[i]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getLocalizedMessage());
            }

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(new Phone("iPhone", numbers[i]));

        }
    }

}
