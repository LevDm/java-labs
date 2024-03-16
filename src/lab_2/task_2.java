package lab_2;

import java.util.Arrays;
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Строк: ");
        int rows = scanner.nextInt();

        System.out.print("Колонок: ");
        int cols = scanner.nextInt();

        scanner.close();

        int[][] array = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 == 0){
                    array[i][j] = value;
                }
                else {
                    array[i][cols-1-j] = value;
                }
                value++;
            }
        }

        System.out.println("Массив:" );
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
