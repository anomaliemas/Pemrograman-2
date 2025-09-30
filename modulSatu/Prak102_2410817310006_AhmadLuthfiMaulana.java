package modulSatu;

import java.util.Scanner;

public class Prak102_2410817310006_AhmadLuthfiMaulana {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            while (true) {
                int angka = scanner.nextInt();

                int i = 0;
                while (i < 11) {
                    if (angka % 5 == 0) {
                        int hasil = (angka / 5) - 1;
                        System.out.print(hasil);
                    } else {
                        System.out.print(angka);
                    }

                    if (i < 10) {
                        System.out.print(",");
                    }

                    angka++;
                    i++;
                }
                System.out.println("\n");
            }
        } 
    }
}