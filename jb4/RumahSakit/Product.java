class Product {
    private int idProduct;
    private String namaProduct;
    private int harga;
    private int stock;

    public Product() {}

    public Product(int idProduct, String namaProduct, int harga, int stock) {
        this.idProduct = idProduct;
        this.namaProduct = namaProduct;
        this.harga = harga;
        this.stock = stock;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNamaProduct() {
        return namaProduct;
    }

    public void setNamaProduct(String namaProduct) {
        this.namaProduct = namaProduct;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getInfo() {
        String info = " ";
        info += "\n-----------------------";
        info += "\n ID Product  : " + idProduct;
        info += "\n Nama Barang : " + namaProduct;
        info += "\n Harga       : " + harga;
        info += "\n Stock       : " + stock;
        info += "\n-----------------------";
        // info += "\n";
        return info;
    }
}