package lab_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task_4 {
    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            input.add(random.nextInt(10));
        }

        System.out.println("input: " + input.toString());

        List<Integer> result = squareList(input);

        System.out.println("result: " + result.toString());
    }
    public static List<Integer> squareList(List<Integer> list) {
        return list.stream().map(x -> x * x).collect(Collectors.toList());
    }
}
