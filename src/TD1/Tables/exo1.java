package TD1.Tables;

import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau (N)
        System.out.println("Entrez la taille du tableau (N, entre 10 et 50) : ");
        int tailleTableau = scanner.nextInt();

        // Vérifier que N est dans la plage spécifiée
        if (tailleTableau < 10 || tailleTableau > 50) {
            System.out.println("La taille du tableau doit être entre 10 et 50.");
            return;
        }

        // Créer le tableau T de taille N
        int[] tableau = new int[tailleTableau];

        // Remplir le tableau en demandant à l'utilisateur de saisir les éléments
        for (int i = 0; i < tailleTableau; i++) {
            System.out.println("Entrez l'élément #" + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        // Calculer la valeur maximale et minimale
        int valeurMax = tableau[0];
        int valeurMin = tableau[0];

        for (int i = 1; i < tailleTableau; i++) {
            if (tableau[i] > valeurMax) {
                valeurMax = tableau[i];
            }
            if (tableau[i] < valeurMin) {
                valeurMin = tableau[i];
            }
        }

        // Afficher les résultats
        System.out.println("La valeur maximale du tableau est : " + valeurMax);
        System.out.println("La valeur minimale du tableau est : " + valeurMin);

        // Fermer le scanner
        scanner.close();
    }
}
