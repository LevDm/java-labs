package lab_5;

import java.util.List;
import java.util.stream.Collectors;

public class Task_3 {
    public static void main(String[] args) {

        List<String> inputList = List.of("Aa", "cc", "Bb", "dd", "eE");

        System.out.println("strList: " + inputList.toString());

        List<String> resList = filterCap(inputList);

        System.out.println("resList: " +  resList.toString());
    }
    public static List<String> filterCap(List<String> list) {
        return list.stream().filter(s -> Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
    }
}
