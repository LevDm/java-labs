package lab_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер массива: ");

        int size = in.nextInt();
        int[] inputArr_a = new int[size];
        int[] inputArr_b = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            inputArr_a[i] = random.nextInt(10);
            inputArr_b[i] = random.nextInt(10);
        }
        in.close();

        System.out.println("Массив inputArr_a: "+Arrays.toString(inputArr_a));
        System.out.println("Массив inputArr_b: "+Arrays.toString(inputArr_b));

        int[]  resultArr = filterEquals(inputArr_a, inputArr_b);

        System.out.println("Массив resultArr: "+Arrays.toString( resultArr));
    }
    public static int[] filterEquals(int[] arr_a, int[] arr_b) {
        return Arrays.stream(arr_a).filter(x -> Arrays.stream(arr_b).anyMatch(y -> y == x)).toArray();
    }
}
