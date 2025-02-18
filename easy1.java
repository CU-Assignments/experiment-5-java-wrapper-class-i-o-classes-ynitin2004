import java.util.*;

public class easy1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        String strNum = "100";
        Integer parsedNum = Integer.parseInt(strNum);
        System.out.println("Parsed Integer: " + parsedNum);
    }
}