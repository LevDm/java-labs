package lab_5;


import java.util.List;

import java.util.stream.Collectors;

public class Task_8 {
    public static void main(String[] args) {

        List<Integer> input = List.of(1,2,3,4,5,6,7,8,9);

        int minInt = 5;

        System.out.println("input: " + input.toString());

        List<Integer> result = filterGreat(input, minInt);

        System.out.println("result: " +  result.toString());
    }
    public static List<Integer> filterGreat(List<Integer> list, int threshold){
        return list.stream().filter(num -> num > threshold).collect(Collectors.toList());
    }
}
