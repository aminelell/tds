package TD1.lesConditions;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer deux nombres entiers
        System.out.println("Entrez le premier nombre entier (a) : ");
        int nombreA = scanner.nextInt();

        System.out.println("Entrez le deuxième nombre entier (b) : ");
        int nombreB = scanner.nextInt();

        // Demander à l'utilisateur de faire un choix
        System.out.println("Choisissez une option :");
        System.out.println("1. Vérifier si la somme a + b est paire.");
        System.out.println("2. Vérifier si le produit ab est pair.");
        System.out.println("3. Connaître le signe de la somme a + b.");
        System.out.println("4. Connaître le signe du produit ab.");
        int choix = scanner.nextInt();

        // Exécuter l'option choisie par l'utilisateur
        switch (choix) {
            case 1:
                verifierSommePaire(nombreA, nombreB);
                break;
            case 2:
                verifierProduitPair(nombreA, nombreB);
                break;
            case 3:
                connaitreSigneSomme(nombreA, nombreB);
                break;
            case 4:
                connaitreSigneProduit(nombreA, nombreB);
                break;
            default:
                System.out.println("Choix invalide. Veuillez choisir une option de 1 à 4.");
        }

        // Fermer le scanner
        scanner.close();
    }

    // Méthode pour vérifier si la somme a + b est paire
    private static void verifierSommePaire(int a, int b) {
        int somme = a + b;
        if (somme % 2 == 0) {
            System.out.println("La somme a + b est paire.");
        } else {
            System.out.println("La somme a + b n'est pas paire.");
        }
    }

    // Méthode pour vérifier si le produit ab est pair
    private static void verifierProduitPair(int a, int b) {
        int produit = a * b;
        if (produit % 2 == 0) {
            System.out.println("Le produit ab est pair.");
        } else {
            System.out.println("Le produit ab n'est pas pair.");
        }
    }

    // Méthode pour connaître le signe de la somme a + b
    private static void connaitreSigneSomme(int a, int b) {
        int somme = a + b;
        if (somme > 0) {
            System.out.println("La somme a + b est positive.");
        } else if (somme < 0) {
            System.out.println("La somme a + b est négative.");
        } else {
            System.out.println("La somme a + b est nulle.");
        }
    }

    // Méthode pour connaître le signe du produit ab
    private static void connaitreSigneProduit(int a, int b) {
        int produit = a * b;
        if (produit > 0) {
            System.out.println("Le produit ab est positif.");
        } else if (produit < 0) {
            System.out.println("Le produit ab est négatif.");
        } else {
            System.out.println("Le produit ab est nul.");
        }
    }
}
