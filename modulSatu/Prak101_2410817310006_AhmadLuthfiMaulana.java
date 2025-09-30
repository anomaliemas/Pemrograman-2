package modulSatu;

import java.util.Scanner;

public class Prak101_2410817310006_AhmadLuthfiMaulana {

    public static void main(String[] args) {
        String namaLengkap, tempatLahir;
        int tanggalLahir, bulanLahir, tahunLahir, tinggiBadan;
        double beratBadan;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        namaLengkap = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        tempatLahir = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        tanggalLahir = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        bulanLahir = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        tahunLahir = scanner.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        tinggiBadan = scanner.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        beratBadan = scanner.nextDouble();

        String namaBulan;
        switch (bulanLahir) {
            case 1: namaBulan = "Januari"; break;
            case 2: namaBulan = "Februari"; break;
            case 3: namaBulan = "Maret"; break;
            case 4: namaBulan = "April"; break;
            case 5: namaBulan = "Mei"; break;
            case 6: namaBulan = "Juni"; break;
            case 7: namaBulan = "Juli"; break;
            case 8: namaBulan = "Agustus"; break;
            case 9: namaBulan = "September"; break;
            case 10: namaBulan = "Oktober"; break;
            case 11: namaBulan = "November"; break;
            case 12: namaBulan = "Desember"; break;
            default: namaBulan = "[Bulan tidak valid]"; break;
        }

        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + namaBulan + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
        
        scanner.close();
    }
}