public class KipasAngin{
    String nomorSeri;
    String Merk;
    String Warna;
    int Ukuran;
    public int levelAngin;
    String tipeKipas;

    public void displayInfo(){
        System.out.println("Nomor Seri      : " + nomorSeri);
        System.out.println("Merk            : " + Merk);
        System.out.println("Warna           : " + Warna);
        System.out.println("Ukuran          : " + Ukuran);
        System.out.println("Levek Angin     : " + levelAngin);
        System.out.println("Tipe Kipas      : " + tipeKipas);
    }

    public int tambahLevelAngin(int increment){
        levelAngin += increment;
        return levelAngin;
    }

    public int kurangLevelAngin( int decrement){
        levelAngin -= decrement;
        return levelAngin;
    }
}