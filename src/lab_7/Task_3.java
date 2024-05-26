package lab_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя файла: ");
        String fileName = scanner.nextLine();
        scanner.close();
        File file = new File(fileName);
        if (!file.exists() || !file.isFile()) {
            System.out.println("Файл не найден");
            return;
        }
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }
        reader.close();
        System.out.println("Cтрок в файле: " + lineCount);
    }
}