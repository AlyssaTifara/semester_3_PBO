import java.time.LocalDate;
import java.util.ArrayList;

class Customer {
    private int idCustomer;
    private String namaCustomer;
    private String alamat;
    private String email;
    private ArrayList<Order> orders;

    public Customer() {
        this.orders = new ArrayList<>();
    }

    public Customer(int idCustomer, String namaCustomer, String alamat, String email) {
        this.idCustomer = idCustomer;
        this.namaCustomer = namaCustomer;
        this.alamat = alamat;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    
}