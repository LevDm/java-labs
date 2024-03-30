package lab_3.task_7;

public class task_7 {
    public static void show (Node node) {
        Node ref = node;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println();
    }
    public static void head () {
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);
        Node node4 = new Node(4, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        show(node0);
    }

    public static void tail () {
        Node head = null;
        for (int i = 4; i >= 0; i--) {
            head = new Node(i, head);
        }

        show(head);
    }

    public static void main(String[] args) {
        System.out.println("C головы");
        head();
        System.out.println("C хвоста");
        tail();
    }

}
