package lab_3;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;

public class task_6 {

    public static void counter(AbstractList<Integer> list) {
        int items = 100000;
        for (int i = 1; i <= items; i++) {
            list.add(i);
        }

        int step = 2;
        int index = 0;

        long startTime = System.nanoTime();
        while (list.size() > 1) {
            index = (index + step - 1) % list.size();
            list.remove(index);
        }
        System.out.println("Время(мс): " + (System.nanoTime() -startTime)/1000000);
    }

    public static void main(String[] args) {
        System.out.println("ArrayList");
        counter( new ArrayList<Integer>());

        System.out.println("LinkedList");
        counter( new LinkedList<Integer>());
    }

}
