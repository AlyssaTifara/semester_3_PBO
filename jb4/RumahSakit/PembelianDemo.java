import java.time.LocalDate;

public class PembelianDemo {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setIdProduct(1);
        product1.setNamaProduct("Laptop");
        product1.setHarga(1000000);
        product1.setStock(10);

        Product product2 = new Product();
        product2.setIdProduct(2);
        product2.setNamaProduct("Smartphone");
        product2.setHarga(500000);
        product2.setStock(20);

        Customer customer1 = new Customer();
        customer1.setIdCustomer(1);
        customer1.setNamaCustomer("Tissaaa");
        customer1.setAlamat("Jalan Raya");
        customer1.setEmail("tissaa.lol@example.com");

        Customer customer2 = new Customer();
        customer2.setIdCustomer(2);
        customer2.setNamaCustomer("Alyssa Tifara");
        customer2.setAlamat("Jalan Raya");
        customer2.setEmail("alyssa.tifara@example.com");

        Order order1 = new Order();
        order1.setIdOrder(1234);
        order1.setIdCustomer(customer1.getIdCustomer());
        order1.setTanggalOrder(LocalDate.of(2021, 8, 11));
        order1.setCustomer(customer1);

        Order order2 = new Order();
        order2.setIdOrder(24567);
        order2.setIdCustomer(customer2.getIdCustomer());
        order2.setTanggalOrder(LocalDate.of(2023, 2, 8));
        order2.setCustomer(customer2); 

        order1.tambahProduct(product1);
        order1.tambahProduct(product2);

        order2.tambahProduct(product1);
        order2.tambahProduct(product2);

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
        
        // for (Order o : customer1.getOrders()) {
        //     System.out.println("==============================");
        //     System.out.println("Order ID: " + o.getIdOrder());
        //     System.out.println("Customer ID: " + o.getIdCustomer());
        //     System.out.println("Tanggal Order: " + o.getTanggalOrder());
        //     System.out.println("Total Harga: " + o.getTotalHarga());
        //     System.out.println("Products:");
        //     for (Product p : o.getProducts()) {
        //         System.out.println(p.getInfo());
        //     }
        // }
    }
}