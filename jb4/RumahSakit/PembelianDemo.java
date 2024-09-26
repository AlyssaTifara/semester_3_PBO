import java.time.LocalDate;
import java.util.ArrayList;

public class PembelianDemo {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 6_000_000, 10);
        Product product2 = new Product(2, "Smartphone", 1_500_000, 20);
        Product product3 = new Product(3, "Tablet", 5_000_000, 15);
        Product product4 = new Product(4, "Nitendo", 1_500_000, 15);

        Customer customer1 = new Customer(1, "Tissaaa", "Jalan Raya", "tissaa.lol@example.com");
        Customer customer2 = new Customer(2, "Alyssa Tifara", "Jalan Raya", "alyssa.tifara@example.com");

        Order order1 = new Order(1234, customer1.getIdCustomer(), LocalDate.of(2021, 8, 11), customer1);
        Order order2 = new Order(24567, customer2.getIdCustomer(), LocalDate.of(2023, 2, 8), customer2);

        order1.tambahProduct(product1);
        order1.tambahProduct(product2);

        order2.tambahProduct(product4);
        order2.tambahProduct(product3);

        customer1.addOrder(order1);
        customer2.addOrder(order2);

        System.out.println("==============================");
        System.out.println("        Customer Orders:      ");
        System.out.println("==============================");
        for (Order o : customer1.getOrders()) {
            System.out.println(o.getInfo());
        }

        System.out.println("==============================");
        System.out.println("        Customer Orders:      ");
        System.out.println("==============================");
        for (Order o : customer2.getOrders()) {
            System.out.println(o.getInfo());
        }
    }
}