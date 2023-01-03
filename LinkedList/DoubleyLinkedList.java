public class DoubleyLinkedList {
    private Node head;
    private Node tail;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;

    }

    public void insertAtIndex(int value, int index) {
        Node node = new Node(value);

        if (head == null || index == 0) {
            insertFirst(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if (node.next != null) {
            node.next.prev = node;
        }

    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        node.next = null;
        node = temp;

    }

    public void deleteFirst() {
        Node temp = head.next;
        head = temp;
        if (head == null) {
            tail = null;
        }
    }

    public void deleteLast() {
        Node temp = head;
        if (head == null) {
            System.out.print("List is empty");
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DoubleyLinkedList list = new DoubleyLinkedList();
        list.insertFirst(23);
        list.insertFirst(30);
        list.insertLast(25);
        list.insertFirst(52);
        list.insertLast(60);
        list.insertAtIndex(20, 3);
        list.deleteFirst();

        list.deleteLast();

        list.deleteAtIndex(2);
        list.display();

    }
}
