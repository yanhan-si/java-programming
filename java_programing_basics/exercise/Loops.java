public class LoopExercise {

    public static void main(String[] args) {

        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Add for Loop Here
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Add while Loop Here
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }


        // Add Do while Loop Here
        int j = 0;
        do {
            System.out.println(numbers[j]);
            j++;
        } while ( j < numbers.length);

    }

}