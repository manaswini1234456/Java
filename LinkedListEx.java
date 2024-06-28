
/**
 * LinkedListEx
 */

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListEx {
    Node head = null;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void inserAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void deleteAtStart() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            head = head.next;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void display() {
        Node temp = head;
        while ((temp != null)) {
            System.out.println(temp.data + "");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node search(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void inserAt(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == -1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int count = 1;
        Node temp = head;
        while (count < pos - 1) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAt(int data, int pos) {
        if (head.next == null) {
            head = null;
            return;
        }
        int count = 1;
        Node temp = head;
        while (count < pos - 1) {
            count++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        LinkedListEx list = new LinkedListEx();
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.insertAtStart(40);
        list.insertAtStart(50);
        list.inserAtEnd(1);
        list.inserAtEnd(2);
        list.inserAtEnd(3);
        list.deleteAtStart();
        list.deleteAtEnd();
        list.inserAt(89, 6);
        list.inserAt(81, 7);
        list.deleteAt(89, 6);

        list.display();
    }
}
