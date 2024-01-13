package TD1.Boucles;

import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Demander à l'utilisateur le nombre de lignes
        System.out.println("Entrez le nombre de lignes du triangle : ");
        int nombreDeLignes = input.nextInt();

        // Afficher le triangle numérique
        for (int ligne = 1; ligne <= nombreDeLignes; ligne++) {
            for (int chiffre = 1; chiffre <= ligne; chiffre++) {
                System.out.print(chiffre + " ");
            }
            System.out.println();  // Nouvelle ligne après chaque ligne du triangle
        }

        // Fermer le scanner
        input.close();
    }
}
