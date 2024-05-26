package lab_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя входного файла: ");
        String fileName = scanner.nextLine();
        File sourceFile = new File(fileName);
        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("Файл не существует");
            scanner.close();
            return;
        }
        System.out.println("Имя выходного файла: ");
        String destinationFileName = scanner.nextLine();
        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName))
        ) {
            writer.write("");
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }
            System.out.println("Данные скопированы в файл: " + destinationFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при копировании: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}