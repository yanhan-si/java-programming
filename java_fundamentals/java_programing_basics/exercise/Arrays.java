public class ArraysExercise{

    public static void main(String[] args){
        // Add your code here
        // int[] numbers = {1, 2, 3, 4};

        // create an array with new
        int[] numbers;
        numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        // Up Next: Loops!

        String[] words = {"Ignition sequence start!", "Liftoff!"};
        /*System.out.println(words[0]);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        */

        for (int i = 0 ; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(words[1]);
    }

}