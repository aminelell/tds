package TD1.Boucles;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un entier naturel
        System.out.println("Entrez un entier naturel N : ");
        int entierN = input.nextInt();

        // Vérifier si l'entier est positif
        if (entierN < 0) {
            System.out.println("Le factoriel n'est défini que pour les entiers naturels positifs.");
        } else {
            // Calculer le factoriel
            long resultatFactoriel = calculerFactoriel(entierN);

            // Afficher le résultat
            System.out.println("Le factoriel de " + entierN + " est : " + resultatFactoriel);
        }

        // Fermer le scanner
        input.close();
    }

    // Méthode pour calculer le factoriel d'un entier
    private static long calculerFactoriel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Utiliser une boucle pour calculer le factoriel
            long resultat = 1;
            for (int i = 2; i <= n; i++) {
                resultat *= i;
            }
            return resultat;
        }
    }
}
