package lab_7;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Файл: ");
        String fileName = scanner.nextLine();
        System.out.print("Tекст для записи: ");
        String text = scanner.nextLine();
        scanner.close();
        int writtenCharactersCount = writeToFile(fileName, text);
        System.out.println("Количество символов записано: " + writtenCharactersCount);
    }
    private static int writeToFile(String fileName, String text) {
        int writtenCharactersCount = 0;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
            writtenCharactersCount = text.length();
        } catch (IOException e) {
            System.err.println("Ошибка при записи: " + e.getMessage());
        }
        return writtenCharactersCount;
    }
}