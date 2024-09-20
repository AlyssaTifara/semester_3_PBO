package jobsheet03;
public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; 
    }

    public void pinjaman(int pinjaman) {
        if (pinjaman > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");; 
        } else {
            this.jumlahPinjaman = pinjaman;
        }
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public void setLimitPinjaman(int newLimit) {
        this.limitPinjaman = newLimit;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void angsur(int angsur) {
        if (angsur < (0.1 * jumlahPinjaman)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman -= angsur;
        }
    }
}