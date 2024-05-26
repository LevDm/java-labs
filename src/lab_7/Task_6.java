package lab_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Task_6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Файл: ");
            String fileName = scanner.nextLine();
            System.out.print("Поиск: ");
            String textToSearch = scanner.nextLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains(textToSearch)) {
                        System.out.println(line);
                    }
                }
            } catch (IOException e) {
                System.err.println("Ошибка чтения: " + e.getMessage());
            }
        }
    }
}