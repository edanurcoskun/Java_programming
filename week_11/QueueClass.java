package week_11;
//java homework#6

public class QueueClass {

    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 0; i < 20; i++) {
            queue.enqueue(i + 1);
        }

        System.out.println("The elements of the queue is...");

        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}

class Queue {

    private int[] values;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        values = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int v) {
        if (size >= values.length) {
            int[] temp = new int[values.length * 3];
            System.arraycopy(values, 0, temp, 0, values.length);
            values = temp;
        }

        values[size++] = v;
    }

    public int dequeue() {
        int returnValue = values[0];
        for (int i = 0; i < size - 1; i++) {
            values[i] = values[i + 1];
        }
        size--;
        return returnValue;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
