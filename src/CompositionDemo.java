public class CompositionDemo {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Book", "This is a Book");
        Product p2 = new Product(2, "Pencil", "this is a pencil");
        Product p3 = new Product(3, "Colors", "There are some colors");
        
        Order o = new Order(1, "PD#1");
        o.addItem(1,2, p1);
        o.addItem(2, 1, p2);
        o.addItem(3, 5, p3);

        System.out.println("Order ---->");
        System.out.println(o);

        o = null;
    }
}