package TD1.Boucles;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer deux entiers positifs non nuls
        System.out.println("Entrez le premier entier positif non nul (a) : ");
        int entierA = input.nextInt();

        System.out.println("Entrez le deuxième entier positif non nul (b) : ");
        int entierB = input.nextInt();

        // Calculer le PGCD en utilisant l'algorithme d'Euclide
        int pgcd = calculerPGCD(entierA, entierB);

        // Afficher le résultat
        System.out.println("Le PGCD de " + entierA + " et " + entierB + " est : " + pgcd);

        // Fermer le scanner
        input.close();
    }

    // Méthode pour calculer le PGCD en utilisant l'algorithme d'Euclide
    private static int calculerPGCD(int a, int b) {
        // Appliquer l'algorithme d'Euclide
        while (b != 0) {
            int reste = a % b;
            a = b;
            b = reste;
        }

        // Le PGCD est le dernier a non nul
        return a;
    }
}
