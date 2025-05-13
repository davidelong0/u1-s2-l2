package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParoleDistinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quante parole vuoi inserire? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci la parola #" + (i + 1) + ": ");
            String parola = scanner.nextLine();


            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }


        System.out.println("\nParole duplicate:");
        if (paroleDuplicate.isEmpty()) {
            System.out.println("Nessuna parola duplicata.");
        } else {
            for (String parola : paroleDuplicate) {
                System.out.println(parola);
            }
        }


        System.out.println("\nNumero di parole distinte: " + paroleDistinte.size());


        System.out.println("Parole distinte:");
        for (String parola : paroleDistinte) {
            System.out.println(parola);
        }

        scanner.close();
    }
}


