package TD1.Tables;

import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un entier N
        System.out.println("Entrez un entier N : ");
        int N = scanner.nextInt();

        // Afficher la représentation binaire de N
        String representationBinaire = convertirEnBinaire(N);
        System.out.println("La représentation binaire de " + N + " est : " + representationBinaire);

        // Fermer le scanner
        scanner.close();
    }

    // Méthode pour convertir un entier en sa représentation binaire
    private static String convertirEnBinaire(int nombre) {
        return Integer.toBinaryString(nombre);
    }
}
