package data_structures;

public class StackDS {
    public static Node head;
    private int size;

    StackDS() {
        this.size = 0;
    }

    public static boolean isEmpty() {
        return head == null;
    }

    public class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println("Popped: " + head.data);

        head = head.next;
        size--;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println(head.data);
    }

    public int getSize() {
        return size;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println("---------TOP--------");

        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

        System.out.println("--------BOTTOM------");
    }

    public static void main(String[] args) {
        StackDS stack = new StackDS();
        stack.push(1);
        stack.peek();
        stack.push(3);
        stack.push(5);
        stack.peek();
        stack.printStack();
        System.out.println(stack.getSize());
        stack.pop();
        stack.printStack();
        System.out.println(stack.getSize());
        stack.pop();
        stack.pop();
        stack.printStack();
        System.out.println(stack.getSize());
        stack.pop();
    }
}
