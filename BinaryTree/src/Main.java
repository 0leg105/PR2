public class Main {
    public static void main(String[] args) {
        Baum b = new Baum();
        Knoten k = new Knoten(5);
        Knoten k5 = new Knoten(1);
        Knoten k2 = new Knoten(6);
        Knoten k3 = new Knoten(7);
        Knoten k4 = new Knoten(4);
        b.add(k);
        b.add(k5);
        b.add(k2);
        b.add(k3);
        b.add(k4);
        b.preOrder();
    }
}