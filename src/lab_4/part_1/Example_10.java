package lab_4.part_1;

public class Example_10 {
  @SuppressWarnings("finally")
  public static int m() {
    try {
      System.out.println("0");
      return 15;
    } finally {
      System.out.println("1");
      return 20;
    }
  }

  public static void main(String[] args) {
    System.out.println(m());
  }
}