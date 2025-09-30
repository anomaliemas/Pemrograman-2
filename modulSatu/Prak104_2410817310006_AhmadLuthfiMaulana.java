package modulSatu;

import java.util.Scanner;

public class Prak104_2410817310006_AhmadLuthfiMaulana {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            while (true) {
                System.out.print("Tangan Abu: ");
                String[] pilihanAbu = scanner.nextLine().split(" ");
                
                System.out.print("Tangan Bagas: ");
                String[] pilihanBagas = scanner.nextLine().split(" ");

                int skorAbu = 0;
                int skorBagas = 0;

                for (int i = 0; i < 3; i++) {
                    String tanganAbu = pilihanAbu[i];
                    String tanganBagas = pilihanBagas[i];

                    if (!tanganAbu.equals(tanganBagas)) {
                        if ((tanganAbu.equals("B") && tanganBagas.equals("G")) ||
                            (tanganAbu.equals("G") && tanganBagas.equals("K")) ||
                            (tanganAbu.equals("K") && tanganBagas.equals("B"))) {
                            skorAbu++;
                        } else {
                            skorBagas++;
                        }
                    }
                }

                if (skorAbu > skorBagas) {
                    System.out.println("Abu");
                } else if (skorBagas > skorAbu) {
                    System.out.println("Bagas");
                } else {
                    System.out.println("Seri");
                }
                
                System.out.println(); 
            }
        }
    }
}