public class Main {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.insert(10);
        a.insert(20);
        a.insert(20);
        a.insert(21);
        a.insert(22);
        a.insert(23);
        a.insert(5);

        Node n = a.search(20);
        a.delete(n);
        System.out.println(a.toString());
    }
}
