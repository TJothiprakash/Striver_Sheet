package nov_06.linked_list;

public class DoublyNode extends Nodes {
    int data;
    Nodes next;
    Nodes prev;

    public DoublyNode() {
        super();
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    public DoublyNode(int data, Nodes next, Nodes prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public DoublyNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
