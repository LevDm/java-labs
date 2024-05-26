package lab_7.Task_1_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
public class Example_5 {
    public static void main(String[] args) {
        String inputFileName = "src/lab_7/Task_1_2/input.txt";
        String outputFileName = "src/lab_7/Task_1_2/output.txt";
        try (InputStream inputStream = new FileInputStream(inputFileName)) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            OutputStream outputStream = new FileOutputStream(outputFileName);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
