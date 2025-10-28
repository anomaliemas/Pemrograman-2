package Soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String inputNama = scanner.nextLine();
        System.out.print("Ras: ");
        String inputRas = scanner.nextLine();
        System.out.print("Warna Bulu: "); 
        String inputWarna = scanner.nextLine();

        if (pilihan == 1) {
            Kucing kucing = new Kucing(inputRas, inputNama, inputWarna);
            
            kucing.displayDetailKucing();

        } else if (pilihan == 2) {
            System.out.print("Kemampuan: ");
            String inputKemampuanStr = scanner.nextLine();
            
            String[] arrKemampuan = inputKemampuanStr.split(",\\s*");

            Anjing anjing = new Anjing(inputNama, inputRas, inputWarna, arrKemampuan);
            
            anjing.displayDetailAnjing();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}