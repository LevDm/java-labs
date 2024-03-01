package lab_1;
import java.util.Scanner;
import java.util.Calendar;
public class Example_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите год рождения: ");
        int birthYear = in.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;

        System.out.println("Ваш возраст: " + age);

        in.close();
    }
}
