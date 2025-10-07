package praktikum2.soal3;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // 4. Error sintaks karena tidak ada titik koma (;) di akhir baris.
        // pl.nama = "Roi"
        p1.nama = "Roi";

        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        
        // 5. Variabel 'umur' belum diberi nilai. Kita inisialisasi agar sesuai output soal.
        p1.umur = 17;

        // 6. Label output disesuaikan agar sama persis dengan permintaan soal di PDF.
        // System.out.println("Nama Pegawai: " + pl.getNama());
        System.out.println("Nama: " + p1.getNama());

        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // 7. Output umur ditambahkan " tahun" agar sesuai permintaan soal.
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}