public class DanhSach {
    private Node first;
    private Node last;
    public DanhSach() {
        first = last = null;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public void insertAtFront(int insertItem) {
        if (isEmpty())
            first = last = new Node(insertItem);
        else
            first = new Node(insertItem, first);
    }
    public void insertAtBack(int insertItem) {
        if (isEmpty())
            first = last = new Node(insertItem);
        else
            last = last.next = new Node(insertItem);
    }
    public int removeFromFront() {
        int removeItem = -1;
        if (!isEmpty()) {
            removeItem = first.data;
            if (first == last)
                first = last = null;
            else
                first = first.next;
        }
        return removeItem;
    }
    public int removeFromBack() {
        int removeItem =
                -1;
        if ( ! isEmpty() ) {
            removeItem = last.data;
            if ( first == last )
                first = last = null
                        ;
            else {
                Node current = first;
                while ( current.next != last )
                    current = current.next;
                last = current;
                last.next =null
                ;
            }
        }
        return removeItem;
    }
    public void print() {
        Node tmp = first;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println("\n");
    }
    public void insertA(int insertvalue) // add van la day tang dan
    {
        if (isEmpty()) {
            first = last = new Node(insertvalue);
        } else {
            if (insertvalue < first.data) {
                first = new Node(insertvalue, first);
            } else {
                Node current = first;
                while (current.next != null && current.next.data <= insertvalue) {
                    current = current.next;
                }
                if (current == last) {
                    last = last.next = new Node(insertvalue);
                }else{
                    current.next = new Node(insertvalue, current.next);
                }
            }
        }
    }
}