public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023893";
        m2.nama = "Tissa Alyssa";
        m2.alamat = "Bandung, Jawa Barat";
        m2.kelas = "2C";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023557";
        m3.nama = "Renaldi Galeh";
        m3.alamat = "Malang, Jawa Timur";
        m3.kelas = "2D";

        m1.displayBiodata();
        System.out.println("---------------------------------");
        m2.displayBiodata();
        System.out.println("-----------------------==--------");
        m3.displayBiodata();
    }
}