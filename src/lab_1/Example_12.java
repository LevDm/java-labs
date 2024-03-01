package lab_1;
import java.util.Scanner;
import java.util.Calendar;

public class Example_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = in.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int birthYear = currentYear - age;

        System.out.println("Год вашего рождения: " + birthYear);

        in.close();
    }
}
