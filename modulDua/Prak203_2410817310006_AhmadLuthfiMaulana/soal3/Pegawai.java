package praktikum2.soal3;

// 1. Nama class diubah dari 'Employee' agar sesuai saat dipanggil di Soal3Main (new Pegawai())
// public class Employee {
public class Pegawai {
    // Menggunakan konvensi penamaan 'camelCase' untuk variabel
    public String nama;
    public String jabatan;
    public int umur;

    // 2. Tipe data 'asal' salah. Seharusnya String untuk menampung "Kingdom of Orvel", bukan char.
    // public char asal;
    public String asal;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // 3. Method 'setJabatan' membutuhkan parameter untuk menerima nilai jabatan yang baru.
    //    Variabel 'j' juga tidak terdefinisi.
    // public void setJabatan() {
    //    this.jabatan = j;
    // }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}