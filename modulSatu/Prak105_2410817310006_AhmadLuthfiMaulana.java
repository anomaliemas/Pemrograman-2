package modulSatu;

import java.util.Scanner;

public class Prak105_2410817310006_AhmadLuthfiMaulana {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                
                double volume = PI * jariJari * jariJari * tinggi;
                
                System.out.printf(
                    "Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3",
                    jariJari, tinggi, volume
                );
                
                System.out.println("\n");
            }
        }
    }
}