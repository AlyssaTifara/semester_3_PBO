public class KipasAnginDemo {
    public static void main(String[] args){
        KipasAngin kipas1 = new KipasAngin();
        kipas1.nomorSeri = "12345TB";
        kipas1.Merk = "Toshiba";
        kipas1.Warna = "Merah";
        kipas1.Ukuran = 80;
        kipas1.levelAngin = 2;
        kipas1.tipeKipas = "Kipas Duduk";

        KipasAngin kipas2 = new KipasAngin();
        kipas2.nomorSeri = "4567AD";
        kipas2.Merk = "Panasinoc";
        kipas2.Warna = "Putih";
        kipas2.Ukuran = 120;
        kipas2.levelAngin = 3;
        kipas2.tipeKipas = "Kipas Berdiri";

        kipas1.displayInfo();
        System.out.println("-----------------------------------");
        // kipas1.tambahLevelAngin(10);
        System.out.println("Kecepataan setalah ditambah   : " + kipas1.tambahLevelAngin(10));
        System.out.println("-----------------------------------");
        // kipas1.kurangLevelAngin( 5);
        System.out.println("Kecepataan setelah dikurangi  : " + kipas1.kurangLevelAngin(5));

        kipas2.displayInfo();
        System.out.println("-----------------------------------");
        // kipas1.tambahLevelAngin(10);
        System.out.println("Kecepataan setalah ditambah   : " + kipas2.tambahLevelAngin(10));
        System.out.println("-----------------------------------");
        // kipas1.kurangLevelAngin( 5);
        System.out.println("Kecepataan setelah dikurangi  : " + kipas2.kurangLevelAngin(5));
    }
}