package lab_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер массива: ");

        int size = in.nextInt();
        int[] inputArr = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            inputArr[i] = random.nextInt();
        }
        in.close();

        System.out.println("inputArr: " + Arrays.toString(inputArr));

        int[] resultArr = filterNumbers(inputArr);

        System.out.println("resultArr: " + Arrays.toString(resultArr));
    }
    public static int[] filterNumbers(int[] arr) {
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}
