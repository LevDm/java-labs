package lab_3;

import java.util.HashMap;

public class task_5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        for (int i = 1; i < 10; i++) {
            String item = "";
            for (int j = 0; j < i; j++) {
                item += i;
            }
            hm.put(i, item);
        }

        int multip = 1;

        for (int key:hm.keySet()) {
            if (key > 5)  System.out.print(hm.get(key)+", ");
            if (hm.get(key).length() > 5) multip *= key;
        }

        System.out.println("\nПеремноженные ключи строк длинее 5 символов: "+multip);
    }

}
