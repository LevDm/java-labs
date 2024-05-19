package lab_6.Task_5;

import java.util.Random;

public class Task_5 {
    public static int max(int[] array, int countThreads) throws InterruptedException {
        CustomThread[] threads = new CustomThread[countThreads];
        int partSize = array.length / countThreads;
        int start_i = 0;

        for (int i = 0; i < countThreads; i++) {
            int end_i = (i == countThreads - 1) ? array.length : start_i + partSize;
            threads[i] = new CustomThread(array, start_i, end_i);
            threads[i].start();
            start_i = end_i;
        }

        int max = Integer.MIN_VALUE;

        for (CustomThread thread : threads) {
            thread.join();
            max = Math.max(max, thread.getMax());
        }

        return max;
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
            int max = max(array, countThreads);
            long time = System.currentTimeMillis() - startTime;
            System.out.println(String.format("Наибольший элемент: %s | Время: %s | Потоков: %s", max, time, countThreads));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
