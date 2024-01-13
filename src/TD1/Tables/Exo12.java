package TD1.Tables;

import java.util.Arrays;
import java.util.Scanner;

public class Exo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.println("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Saisir les éléments du tableau
        System.out.println("Saisissez les éléments du tableau (séparés par un espace) : ");
        String input = scanner.nextLine();
        char[] tableau = input.toCharArray();

        // Afficher le tableau initial
        System.out.println("Tableau initial : " + Arrays.toString(tableau));

        // Effectuer le décalage vers la gauche
        decalerGauche(tableau);

        // Afficher le tableau modifié
        System.out.println("Tableau modifié : " + Arrays.toString(tableau));

        // Fermer le scanner
        scanner.close();
    }

    // Méthode pour effectuer le décalage vers la gauche
    private static void decalerGauche(char[] tableau) {
        if (tableau.length > 1) {
            char premierElement = tableau[0];

            for (int i = 1; i < tableau.length; i++) {
                tableau[i - 1] = tableau[i];
            }

            tableau[tableau.length - 1] = premierElement;
        }
    }
}
