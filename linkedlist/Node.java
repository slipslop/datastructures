public class Node
{
    private int value;
    private Node previous;
    private Node next;

    public Node(int value)
    {
        this.value = value;
    }

    public void setPrevious(Node previous)
    {
        this.previous = previous;
    }

    public Node getPrevious()
    {
        return this.previous;
    }

    public void setNext(Node next) 
    {
        this.next = next;
    }

    public Node getNext()
    {
        return this.next;
    }

    public int getValue()
    {
        return this.value;
    }
}
