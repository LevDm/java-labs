package lab_3.task_1;

public class example_1 {
    public static void m(int x) {
        System.out.println("x=" + x);
        int nextX = 2 * x + 1;
        if (nextX < 20) {
            m(nextX);
        }
    }
    public static void main(String[] args) {
        m(1);
    }

}
