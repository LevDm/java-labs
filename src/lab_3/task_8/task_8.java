package lab_3.task_8;

public class task_8 {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e"};

        //
        LinList<String> listHead = new LinList<>();
        listHead.createHead(array);
        System.out.println("с головы: " + listHead.toStr());

        //
        LinList<String> listTail = new LinList<>();
        listTail.createTail(array);
        System.out.println("с хвоста: " + listTail.toStr());

        //
        listTail.addFirst("1");
        listTail.addLast("2");
        listTail.insert(3, "3");
        System.out.println("Добавление 1 в начало и 2 в конец списка и по индексу 3 значение 3: " + listTail.toStr());

        //
        listTail.removeFirst();
        listTail.removeLast();
        listTail.remove(4);
        System.out.println("Удаление клайних элементов и по индексу 4: " + listTail.toStr());

        //
        LinList<String> listHeadRec = new LinList<>();
        listHeadRec.createHeadRec(array);
        System.out.println("Рекурсивное заполнение и вывод головы: " + listHeadRec.toStringRec());

        //
        LinList<String> listTailRec = new LinList<>();
        listTailRec.createTailRec(array);
        System.out.println("Рекурсивное заполнение и вывод хвоста: " + listTailRec.toStringRec());
    }
}
