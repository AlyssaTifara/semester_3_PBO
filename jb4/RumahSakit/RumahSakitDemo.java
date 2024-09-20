import java.time.LocalDate;

public class RumahSakitDemo{
    public static void main (String[] args) {
        Pegawai Ani = new Pegawai("1234", "dr. Ani");
        Pegawai Bagus = new Pegawai("4567", "dr. Bagus");

        Pegawai Desi = new Pegawai("1234", "Ns. Ani");
        Pegawai Eka = new Pegawai("4567", "Ns. Eka");

        Pasien pasien1 = new Pasien("343298", "Puspa Widya");
        pasien1.tambahkonsultasi(LocalDate.of(2021, 8, 11), Ani, Desi);
        pasien1.tambahkonsultasi(LocalDate.of(2021, 9, 11), Bagus, Eka);

        System.out.println(pasien1.getInfo());

        Pasien pasien2 = new Pasien("997744", "Yenny Anggeraeni");
        System.out.println(pasien2.getInfo());
    }
}