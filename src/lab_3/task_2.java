package lab_3;

import java.util.Scanner;

public class task_2 {
    public static String decToBin(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return decToBin(n / 2) + n % 2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");

        int number = scanner.nextInt();

        String bin = decToBin(number);

        System.out.println("Число в двоичной системе: "+bin );

        scanner.close();
    }

}
