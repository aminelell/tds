package TD1.Boucles;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un entier N
        System.out.println("Entrez un entier N : ");
        int entierN = input.nextInt();

        // Calculer et afficher la somme des entiers impairs inférieurs à N
        int resultatSomme = calculerSommeImpairs(entierN);
        System.out.println("La somme des entiers impairs inférieurs à " + entierN + " est : " + resultatSomme);

        // Fermer le scanner
        input.close();
    }

    // Méthode pour calculer la somme des entiers impairs inférieurs à N
    private static int calculerSommeImpairs(int n) {
        int somme = 0;

        // Utiliser une boucle pour itérer à travers les entiers inférieurs à N
        for (int impair = 1; impair < n; impair += 2) {
            somme += impair;
        }

        return somme;
    }
}
