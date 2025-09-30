package modulSatu;

import java.util.Scanner;

public class Prak103_2410817310006_AhmadLuthfiMaulana {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            while (true) {
                int jumlahDeret = scanner.nextInt();
                int angka = scanner.nextInt();

                int counter = 0;

                do {
                    if (angka % 2 != 0) {
                        System.out.print(angka);
                        
                        counter++;

                        if (counter < jumlahDeret) {
                            System.out.print(", ");
                        }
                    }
                    angka++;
                } while (counter < jumlahDeret);
                
                System.out.println("\n");
            }
        }
    }
}