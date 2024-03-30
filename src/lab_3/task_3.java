package lab_3;

import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        inputArray(array, 0);

        System.out.println("Массив:");
        outputArray(array, 0);

        scanner.close();
    }
    public static void inputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print((index + 1) + "Элемент: ");

            Scanner scanner = new Scanner(System.in);
            array[index] = scanner.nextInt();

            inputArray(array, index + 1);
        }
    }
    public static void outputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.println(array[index]);
            outputArray(array, index + 1);
        }
    }
}
