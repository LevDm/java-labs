package lab_3.task_1;

public class example_5 {
    public static void main(String[] args) {

        int n = 5;

        int fibNum = fib(n, 0);
        System.out.println("Число Фибоначчи от " + n + " = " + fibNum);
    }
    public static int fib(int n, int level) {

        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }

        System.out.println("fib:" + n);

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fib(n-1, level+1) + fib(n-2, level+1);
    }

}
