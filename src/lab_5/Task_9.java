package lab_5;

import java.util.List;
import java.util.stream.Collectors;

public class Task_9 {
    public static void main(String[] args) {

        List<String> input = List.of("1a2b", "ab", "@b", "ab!");
        System.out.println("input: " + input.toString());

        List<String> result = filterStrings(input);

        System.out.println("result: " +  result.toString());
    }
    public static List<String> filterStrings(List<String> inputList) {
        return inputList.stream()
                .filter(str -> str.replaceAll("\\s+", "").chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }
}
