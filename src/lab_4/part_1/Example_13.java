package lab_4.part_1;

public class Example_13 {
  public static void main(String[] args) {
    try {
      int l = args.length;
      System.out.println("размер массива= " + l);
      args[l + 1] = "10";
    } catch (ArithmeticException e) {
      System.out.println("Деление на ноль");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Индекс не существует");
    }
  }
}
