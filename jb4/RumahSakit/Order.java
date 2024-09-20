import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int idOrder;
    private int idCustomer;
    private LocalDate tanggalOrder;
    private ArrayList<Product> products; 
    private Customer customer;

    public Order() {
        this.products = new ArrayList<>(); 
    }
    public ArrayList<Product> getProducts() {
        return products;
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

    public void setCustomer(Customer customer) {
        this.customer = customer;
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