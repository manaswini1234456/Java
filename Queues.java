class Queues {

    int capacity = 10;
    int[] arr = new int[capacity];
    int front = 0;
    int rear = 0;

    public vo enqueue(int n) {
        if (this.rear == this.capacity) {
            System.out.println("queue is full");
        } else {
            this.arr[this.rear] = n;
            rear++;
        }
    }

    public boolean isEmpty() {
        if (this.front == this.rear) {
            return true;
        } else {
            return false;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {
            this.front++;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        } else {
            for (int i = front; i < rearh; i++) {
                System.out.println(this.arr[i] + "");
            }
        }
    }

    public static void main(String[] args) {
        Queues q = new Queues(10);

        q.display();
    }
}