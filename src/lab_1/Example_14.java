package lab_1;
import java.util.Scanner;
public class Example_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        int prevNum = num - 1;
        int nextNum = num + 1;
        int squareSum = (num + prevNum + nextNum) * (num + prevNum + nextNum);

        System.out.println(prevNum + ", " + num + ", " + nextNum + ", " + squareSum);

        in.close();
    }
}
