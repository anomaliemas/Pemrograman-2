package praktikum2.soal2;

public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    
    private String pembeli;

    public void info() {
        System.out.println("Nama Kopi: " + this.namaKopi);
        System.out.println("Ukuran: " + this.ukuran);
        System.out.println("Harga: Rp. " + this.harga);
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return this.pembeli;
    }

    public double getPajak() {
        return this.harga * 0.11;
    }
}