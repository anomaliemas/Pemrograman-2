package praktikum1.soal1;

public class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlahBeli;

    public Buah(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }
    
    public double hitungHargaSebelumDiskon() {
        return (this.jumlahBeli / this.berat) * this.harga;
    }

    public double hitungTotalDiskon() {
        int kelipatan = (int) Math.floor(this.jumlahBeli / 4);
        double diskonPerKelipatan = 0.02 * (this.harga * 4); 
        return kelipatan * diskonPerKelipatan;
    }

    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungTotalDiskon();
    }

    public void tampilkanInfo() {
        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.printf("Jumlah Beli: %.1fkg\n", jumlahBeli);
        System.out.printf("Harga Sebelum Diskon:Rp%.2f%n", hitungHargaSebelumDiskon());
        System.out.printf("Total Diskon: Rp%.2f%n", hitungTotalDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", hitungHargaSetelahDiskon());
        System.out.println(); 
    }
}