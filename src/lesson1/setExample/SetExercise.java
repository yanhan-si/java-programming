package lesson1.setExample;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SetExercise {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<String>();

        // We have a list of numbers and some are duplicates
        numbers.add("123-222-3333");
        numbers.add("223-222-3333");
        numbers.add("123-332-3333");
        numbers.add("123-222-4433");
        numbers.add("123-222-1133");
        numbers.add("123-222-3333");
        numbers.add("123-222-3333");
        numbers.add("123-232-4533");
        numbers.add("123-562-3333");
        numbers.add("123-000-3333");
        numbers.add("555-222-3333");
        numbers.add("444-222-3333");

        // Add them to a Set to get a unique list
        Set<String> uniqueNumbers = new HashSet<String>(numbers);

        for (String number : uniqueNumbers) {
           // System.out.println(number);
        }

        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int j=0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }

        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.getTime());

        String  emailRegex = "^(.+)@(.+).(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher("jeff@umich.edu");
        System.out.println(matcher.matches());
    }
}
