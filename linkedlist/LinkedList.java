public class LinkedList
{
    public Node head;

    public void insert(int value)
    {
        Node node = new Node(value);

        if (head != null) {
            node.setNext(head);
            head.setPrevious(node);
        }

        this.head = node;
    }

    public Node search(int value)
    {
        Node res = this.head;

        while (res != null && res.getValue() != value) {
            res = res.getNext();
        }

        return res;
    }

    public void delete(Node node)
    {
        if (node.getPrevious() != null) {
            node.getPrevious().setNext(node.getNext());
        } else {
            this.head = node.getNext();
        }
        if (node.getNext() != null) {
            node.getNext().setPrevious(node.getPrevious());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node node = this.head;
        while (node != null) {
            sb.append(node.getValue());
            if (node.getNext() != null) {
                sb.append(" -> ");
            }
            node = node.getNext();
        }
        return sb.toString();
    }
}
