public class DemoPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang persegi1 = new PersegiPanjang();
        persegi1.lebar = 3;
        persegi1.panjang = 7;

        persegi1.displayInfo();
        System.out.println("-------------------");
        System.out.println("Luas       : " + persegi1.getLuas());
        System.out.println("-------------------");
        System.out.println("Keliling   : " + persegi1.getKeliling());
    }
}