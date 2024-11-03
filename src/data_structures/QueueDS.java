package data_structures;

public class QueueDS {
    static class Queue {
        private final int size;
        private final int[] arr;
        private int rear = -1;
        private int queueSize;

        Queue(int size) {
            this.size = size;
            this.arr = new int[size];
            this.queueSize = 0;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void enqueue(int data) {
            if (rear == size-1) {
                System.out.println("Queue is full!");
                return;
            }
            queueSize++;
            rear++;
            arr[rear] = data;
        }

        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            queueSize--;
            rear--;

            System.out.println("Dequeued: " + front);
        }

        public void peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }

            System.out.println("Front: " + arr[0]);
        }

        public int getSize() {
            return queueSize;
        }

        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }

            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " <- ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Size: " + q.getSize());
        q.peek();
        q.printQueue();
        q.dequeue();
        System.out.println("Size: " + q.getSize());
        q.peek();
        q.printQueue();
    }
}
