package lab_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int size = scanner.nextInt();
        scanner.close();

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Массив: "+ Arrays.toString(array));

        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) min = array[i];
        }

        System.out.println("Минимальное: " + min);

        System.out.print("Индекс минимального: ");
        for (int i = 0; i < size; i++) {
            if (array[i] == min) System.out.print(i + ", ");
        }
    }
}