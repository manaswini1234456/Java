import java.util.Stack;

public class Stacks {

    int capacity = 10;
    int[] arr = new int[capacity];
    int top = -1;

    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        }
        return false;
    }

    public void push(int num) {
        if (this.top == this.capacity) {
            System.out.println("over flow");
            // return;
        } else {
            this.top++;
            this.arr[top] = num;
        }
    }

    public void pop() {
        if (this.isEmpty()) {
            System.out.println("under flow");
            return;
        } else {
            this.top--;
        }
    }

    public void peek() {
        if (this.isEmpty()) {
            System.out.println("under flow");
        } else {
            System.out.println(this.arr[this.top]);
        }
    }

    public static void main(String[] args) {
        Stacks st = new Stacks();
        st.push(10);
        st.push(20);
        st.push(30);
        // st.pop();
        st.peek();
    }
}