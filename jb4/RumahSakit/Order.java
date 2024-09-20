import java.time.LocalDate;
import java.util.ArrayList;

class Order {
    private int idOrder;
    private int idCustomer;
    private LocalDate tanggalOrder;
    private Customer customer;
    private ArrayList<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public Order(int idOrder, int idCustomer, LocalDate tanggalOrder, Customer customer) {
        this.idOrder = idOrder;
        this.idCustomer = idCustomer;
        this.tanggalOrder = tanggalOrder;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public LocalDate getTanggalOrder() {
        return tanggalOrder;
    }

    public void setTanggalOrder(LocalDate tanggalOrder) {
        this.tanggalOrder = tanggalOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void tambahProduct(Product product) {
        this.products.add(product);
    }

    public int hitungTotalHarga() {
        int totalHarga = 0;
        for (Product product : products) {
            totalHarga += product.getHarga();
        }
        return totalHarga;
    }

    public int getTotalHarga() {
        return hitungTotalHarga(); 
    }

    public String getInfo(){
        String info = "";
        info += "Tanggal Pembelian     : " + tanggalOrder + "\n";
        info += "Nama Customer         : " + customer.getNamaCustomer() + "\n"; 
        info += "ID Order              : " + idOrder + "\n";
        info += "List Barang Pembelian : ";
        for (Product product : products) {
            info += "  " + product.getInfo();
        }
        info += "\nTotal Harga : " + getTotalHarga() + "\n";
        return info;
    }
}