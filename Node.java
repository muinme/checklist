
public class Node {
    int data;
    Node next;
    Node(int value) {
        this(value, null);
    }
    Node(int value, Node node) {
        data = value;
        next = node;
    }
    int getData() { return data; }
    Node getNext() { return next; }
}
