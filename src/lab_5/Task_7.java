package lab_5;

import java.util.List;
import java.util.stream.Collectors;

public class Task_7 {
    public static void main(String[] args) {

        List<String> input = List.of("1111", "22", "33333");

        int minLength = 4;

        System.out.println("input: " + input.toString());

        List<String> result = filterByLength(input, minLength);

        System.out.println("result: " +  result.toString());
    }
    public static List<String> filterByLength(List<String> list, int minLength) {
        return list.stream().filter(str -> str.length() > minLength).collect(Collectors.toList());
    }

}
