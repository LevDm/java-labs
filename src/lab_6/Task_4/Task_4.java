package lab_6.Task_4;

public class Task_4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new CustomThread(i+1);
            thread.start();
        }
    }
}
