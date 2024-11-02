package data_structures;

public class LList {

    static Node head = null;
    public static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == null) {
            System.out.println(head.data + " -> NULL");
            return;
        }

        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node currentNode = head;
        Node lastNode = currentNode.next;

        while (lastNode.next != null) {
            currentNode = lastNode;
            lastNode = currentNode.next;
        }

        currentNode.next = null;
    }

    public static void main(String[] args) {
        LList list = new LList();
        list.printList();
        list.addFirst("I");
        list.printList();
        list.addLast("Am");
        list.addLast("Brijesh");
        list.printList();
        list.addFirst("Hello");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.addLast("PRO");
        list.printList();
        list.deleteLast();
        list.printList();
    }
}
