package lab_3.rgr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class rgr {

    public static void main(String[] args) {

        find();

        get();
    }

    public static void find() {
        int itemsFind = 8 * 1000000;
        int startIndex = 0;
        int centerIndex = itemsFind/2;
        int endIndex = itemsFind-1;

        HashSet<Integer> hashSet = new HashSet<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < itemsFind; i++) {
            hashSet.add(i+1);
            sortedSet.add(i+1);
            arrayList.add(i+1);
        }

        //
        long start = System.currentTimeMillis();
        arrayList.add(startIndex, 111);
        System.out.println("(arrayList) Время добавления в начало: "+(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        arrayList.add(centerIndex, 111);
        System.out.println("(arrayList) Время добавления в середину: "+(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        arrayList.add(endIndex, 111);
        System.out.println("(arrayList) Время добавления в конец: "+(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        arrayList.remove(startIndex);
        System.out.println("(arrayList) Время удаления из начала: "+(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        arrayList.remove(centerIndex);
        System.out.println("(arrayList) Время удаления из центра: "+(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        arrayList.remove(endIndex);
        System.out.println("(arrayList) Время удаления из конца: "+(System.currentTimeMillis() - start));

        System.out.println("---");
        //
        start = System.currentTimeMillis();
        hashSet.add(9999999);
        System.out.println("(hashSet) Время добавления: "+(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        hashSet.remove(9999999);
        System.out.println("(hashSet) Время удаления: "+(System.currentTimeMillis() - start));

        System.out.println("---");
        //
        start = System.currentTimeMillis();
        sortedSet.add(9999999);
        System.out.println("(sortedSet) Время добавления: "+(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        sortedSet.remove(sortedSet.first());
        System.out.println("(sortedSet) Время удаления первого: "+(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        sortedSet.remove(centerIndex);
        System.out.println("*(sortedSet) Время удаления из центра: "+(System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        sortedSet.remove(sortedSet.last());
        System.out.println("(sortedSet) Время удаления последнего: "+(System.currentTimeMillis() - start));


    }

    public static void get() {
        long itemsGet = 8 * 10000000;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < itemsGet; i++) {
            arrayList.add(i);
        }

        System.out.println("===");

        long start = System.currentTimeMillis();
        arrayList.get(4000000);
        System.out.println("(arrayList) Время получения элемента: "+(System.currentTimeMillis() - start));
    }

}
