package lab_3.task_1;

public class example_2 {
    public static void m(int x) {
        int nextX = 2 * x + 1;
        if (nextX < 20) {
            m(nextX);
        }
        System.out.println("x=" + x);
    }
    public static void main(String[] args) {
        m(1);
    }

}
