package lab_7;

import java.io.File;
import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Путь к файлу:");
        String filePath = scanner.nextLine();
        File file = new File(filePath);

        printFileSize(file);

        scanner.close();
    }

    private static void printFileSize(File file) {
        if (file.exists()) {
            long fileSizeInBytes = file.length();
            System.out.println(file.getPath() + " " + fileSizeInBytes + " байт(а).");
        } else {
            System.out.println("Файл не найден: " + file.getPath());
        }
    }
}