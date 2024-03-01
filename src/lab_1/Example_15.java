package lab_1;
import java.util.Scanner;
public class Example_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);

        in.close();
    }
}
