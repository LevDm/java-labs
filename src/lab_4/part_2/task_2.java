package lab_4.part_2;


import java.util.Random;
import java.util.Scanner;

class ZeroMatrixDimensionException extends Exception {
  public ZeroMatrixDimensionException(String message) {
    super(message);
  }
}

public class task_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int row = getInput("Введите количество строк матрицы: ", "Размерность строк матрицы должна быть больше 0", scanner);
      int col = getInput("Введите количество столбцов матрицы: ", "Размерность колонок матрицы должна быть больше 0", scanner);

      int[][] matrix = new int[row][col];

      System.out.println("Матрица:");

      Random random = new Random();

      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          matrix[i][j] = random.nextInt(5);
          System.out.print(matrix[i][j] + "\t");
        }
        System.out.println();
      }

      int columnToPrint = getInput("Введите индекс столбца: ", "Нет столбца с таким индексом", scanner);

      if (columnToPrint >= 0 && columnToPrint < col) {
        System.out.println("Столбец с индексом " + columnToPrint + ":");
        for (int i = 0; i < row; i++) {
          System.out.println(matrix[i][columnToPrint]);
        }
      }
    } catch (java.util.InputMismatchException e) {
      System.out.println("Ошибка: Введено некорректное значение. Ожидается целое число.");
    } catch (ZeroMatrixDimensionException e) {
      System.out.println("Ошибка: " + e.getMessage());
    }
  }
  private static int getInput(String message, String errorMessage, Scanner scanner) throws ZeroMatrixDimensionException {
    System.out.print(message);
    int input = scanner.nextInt();
    if (input <= 0) {
      throw new ZeroMatrixDimensionException(errorMessage);
    }
    return input;
  }
}