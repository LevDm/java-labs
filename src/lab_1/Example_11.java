package lab_1;

import java.util.Scanner;
import java.util.Calendar;
public class Example_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = in.nextLine();

        System.out.print("Введите год рождения: ");
        int birthYear = in.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;

        System.out.println(name + ", ваш возраст: " + age);

        in.close();
    }
}
