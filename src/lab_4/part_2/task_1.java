package lab_4.part_2;

import java.util.Scanner;

class NoPositiveNumbersException extends Exception {
  public NoPositiveNumbersException() {
    super("Положительные элементы отсутствуют");
  }
}
public class task_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Введите размер массива: ");
      int size = scanner.nextInt();
      int[] array = new int[size];

      System.out.println("Введите элементы массива:");
      for (int i = 0; i < size; i++) {
        array[i] = scanner.nextInt();
      }

      double average = average(array);
      System.out.println("Среднее значение положительных элементов массива: " + average);

    } catch (java.util.InputMismatchException e) {
      inputException(e);
    } catch (NegativeArraySizeException e) {
      System.out.println("Ошибка: введен отрицательный размер массива");
    } catch (NoPositiveNumbersException e) {
      System.out.println("Ошибка: " + e.getMessage());
    }
  }
  private static void inputException(java.util.InputMismatchException e) {
    if (e.getMessage() == null) {
      System.out.println("Ошибка: ввод не соответствует типу данных Int");
    } else if (e.getMessage().contains("out of range")) {
      System.out.println("Ошибка: введенное число за пределами допустимого диапазона");
    } else if (e.getMessage().contains("does not match pattern")) {
      System.out.println("Ошибка: введена строка вместо числа");
    } else {
      System.out.println("Ошибка: " + e.getMessage());
    }
  }
  public static double average(int[] array) throws NoPositiveNumbersException {
    int summary = 0;
    int count = 0;

    for (int num : array) {
      if (num > 0) {
        summary  += num;
        count++;
      }
    }
    if (count == 0) {
      throw new NoPositiveNumbersException();
    }
    return (double) summary  / count;
  }
}
