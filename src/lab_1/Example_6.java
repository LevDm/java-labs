package lab_1;
import java.util.Scanner;
public class Example_6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите фамилию: ");
        String lastName = in.nextLine();

        System.out.print("Введите имя: ");
        String firstName = in.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = in.nextLine();

        System.out.println("Привет, " + lastName + " " + firstName + " " + middleName);

        in.close();
    }
}
