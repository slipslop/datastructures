public class Main {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.insert(10);
        a.insert(20);
        a.insert(5);
        a.insert(22);

        Node n = a.search(10);
        System.out.println(n.getNext());
    }
}
