package lab_5;

import java.util.List;
import java.util.stream.Collectors;

public class Task_6 {
    public static void main(String[] args) {

        List<Integer> input = List.of(1,2,3,4,5,6,7,8,9);

        int divisor = 3;

        System.out.println("input: " + input.toString());

        List<Integer> result = filterDivisor(input, divisor);

        System.out.println("result: " +  result.toString());
    }
    public static List<Integer> filterDivisor(List<Integer> list, int divisor) {
        return list.stream().filter(num -> num % divisor == 0).collect(Collectors.toList());
    }
}
