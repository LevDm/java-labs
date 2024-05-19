package lab_6.Task_6;

import java.util.Random;

public class Task_6 {
    public static int sum(int[] array, int countThreads) throws InterruptedException {

        CustomThread[] threads = new CustomThread[countThreads];
        int partSize = array.length / countThreads;
        int start_i = 0;

        for (int i = 0; i < countThreads; i++) {
            int end_i = (i == countThreads - 1) ? array.length : start_i + partSize;
            threads[i] = new CustomThread(array, start_i, end_i);
            threads[i].start();
            start_i = end_i;
        }

        int sum = 0;

        for (CustomThread thread : threads) {
            thread.join();
            sum += thread.getSum();
        }

        return sum;
    }
    static int[] getArray(){
        int size = 60000000;
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000);
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = getArray();

        int countThreads = Runtime.getRuntime().availableProcessors();

        try {
            long startTime = System.currentTimeMillis();
            int sum = sum(array, countThreads);
            long time = System.currentTimeMillis() - startTime;
            System.out.println(String.format("Сумма: %s | Время: %s | Потоков: %s", sum, time, countThreads));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
