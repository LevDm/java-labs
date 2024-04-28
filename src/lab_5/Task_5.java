package lab_5;

import java.util.List;
import java.util.stream.Collectors;
public class Task_5 {
    public static void main(String[] args) {
        List<String> input = List.of("12", "b2", "A123", "Aa1", "A1B1");
        String substring = "A1";

        System.out.println("input: " + input.toString() + "| find: " + substring);

        List<String> result = findSubstring(input, substring);

        System.out.println("result: " + result.toString());
    }
    public static List<String> findSubstring(List<String> list, String substr) {
        return list.stream().filter(str -> str.contains(substr)).collect(Collectors.toList());
    }

}
