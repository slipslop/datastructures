public class Main {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.insert(10);
        a.insert(20);
        System.out.println(a.head.getValue());
        System.out.println(a.head.getPrevious());
        System.out.println(a.head.getNext().getValue());
    }
}