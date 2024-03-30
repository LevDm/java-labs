package lab_3.task_8;

public class LinList<T> {
    private Node<T> head;

    public void addLast(T value) {
        if (this.head == null) {
            this.head = new Node<>(value, null);
            return;
        }
        Node<T> lastNode = this.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = new Node<>(value, null);
    }

    public void createHead(T[] values) {
        for (T value : values) {
            addLast(value);
        }
    }

    public void createTail(T[] values) {
        Node<T> newHead = null;
        for (int i = values.length - 1; i >= 0; i--) {
            newHead = new Node<>(values[i], newHead);
        }
        this.head = newHead;
    }

    public String toStr() {
        StringBuilder output = new StringBuilder();
        Node<T> ref = this.head;
        while (ref != null) {
            output.append(" ").append(ref.value);
            ref = ref.next;
        }
        return output.toString();
    }

    public void addFirst(T value) {
        this.head = new Node<>(value, this.head);
    }

    public void insert(int index, T value) {
        if (index < 0) {
            throw new IllegalArgumentException("Invalid index");
        }
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node<T> nodeAtIndex = getNodeAtIndex(index - 1);
        Node<T> insertedNode = new Node<>(value, nodeAtIndex.next);
        nodeAtIndex.next = insertedNode;
    }

    private Node<T> getNodeAtIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IllegalArgumentException("Invalid index");
        }
        Node<T> currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public T removeFirst() {
        if (this.head == null) {
            throw new IllegalStateException("List is empty");
        }
        Node<T> previousHead = this.head;
        this.head = previousHead.next;
        return previousHead.value;
    }

    public T removeLast() {
        if (this.head == null) {
            throw new IllegalStateException("List is empty");
        }
        if (this.head.next == null) {
            T value = this.head.value;
            this.head = null;
            return value;
        }
        Node<T> lastNode = this.head;
        Node<T> secondToLastNode = null;
        while (lastNode.next != null) {
            secondToLastNode = lastNode;
            lastNode = lastNode.next;
        }
        secondToLastNode.next = null;
        return lastNode.value;
    }

    public T remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IllegalArgumentException("Invalid index");
        }
        if (index == 0) {
            return removeFirst();
        }
        Node<T> nodeAtIndex = getNodeAtIndex(index - 1);
        Node<T> removedNode = nodeAtIndex.next;
        nodeAtIndex.next = removedNode.next;
        return removedNode.value;
    }

    private int size() {
        int count = 0;
        Node<T> current = this.head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void createHeadRec(T[] values) {
        createHeadRec(values, values.length - 1);
    }

    private void createHeadRec(T[] values, int index) {
        if (index < 0) {
            return;
        }
        createHeadRec(values, index - 1);
        addLast(values[index]);
    }

    public void createTailRec(T[] values) {
        if (values.length == 0) {
            return;
        }
        this.head = createTailRecursive(values, 0);
    }

    private Node<T> createTailRecursive(T[] values, int index) {
        if (index == values.length - 1) {
            return new Node<>(values[index], null);
        }
        Node<T> nextNode = createTailRecursive(values, index + 1);
        return new Node<>(values[index], nextNode);
    }

    public String toStringRec() {
        return toStringRecursive(this.head);
    }

    private String toStringRecursive(Node<T> node) {
        if (node == null) {
            return "";
        }
        if (node.next == null) {
            return " " + node.value;
        }
        return " " + node.value + toStringRecursive(node.next);
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}
