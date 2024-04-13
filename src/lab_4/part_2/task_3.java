package lab_4.part_2;


import java.util.Scanner;
public class task_3 {
  public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
          System.out.print("Введите размер массива: ");
          int size = scanner.nextInt();
          byte[] array = new byte[size];

          System.out.println("Введите элементы массива: ");
          for (int i = 0; i < size; i++) {
              array[i] = scanner.nextByte();
          }
          byte sum = 0;
          for (byte num : array) {
              sum = addByteWithOverflowCheck(sum, num);
          }
          System.out.println("Сумма элементов массива: " + sum);

      } catch (Exception e) {
          handleException(e);
      }
  }
  public static byte addByteWithOverflowCheck(byte a, byte b) {
    int result = (int) a + (int) b;
    if (result < Byte.MIN_VALUE || result > Byte.MAX_VALUE) {
      throw new ArithmeticException("переполнение при сложении");
    }
    return (byte) result;
  }
  public static void handleException(Exception e) {
    if (e instanceof java.util.InputMismatchException) {
      if (e.getMessage() == null) {
        System.out.println("Ошибка: введена строка вместо числа или число не соответствует типу данных");
      } else if (e.getMessage().contains("out of range")) {
        System.out.println("Ошибка: введенное число выходит за пределы допустимого диапазона");
      } else if (e.getMessage().contains("does not match pattern")) {
        System.out.println("Ошибка: введена строка вместо числа");
      } else {
        System.out.println("Ошибка: " + e.getMessage());
      }
    } else if (e instanceof java.lang.ArithmeticException) {
      System.out.println("Ошибка: произошло переполнение при вычислении суммы");
    } else if (e instanceof NegativeArraySizeException) {
      System.out.println("Ошибка: введен отрицательный размер массива");
    } else {
      System.out.println("необработанная ошибка: " + e.getMessage());
    }
  }
}