package TD1.Tables;

import java.util.Scanner;

public class exo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille des matrices carrées (nombre de lignes/colonnes)
        System.out.println("Entrez la taille des matrices carrées (nombre de lignes/colonnes) : ");
        int taille = scanner.nextInt();

        // Saisir la première matrice
        System.out.println("Saisissez la première matrice : ");
        double[][] matrice1 = saisirMatrice(taille);

        // Saisir la deuxième matrice
        System.out.println("Saisissez la deuxième matrice : ");
        double[][] matrice2 = saisirMatrice(taille);

        // Calculer la somme des matrices
        double[][] sommeMatrices = additionnerMatrices(matrice1, matrice2);

        // Afficher le résultat
        System.out.println("La somme des matrices est : ");
        afficherMatrice(sommeMatrices);

        // Fermer le scanner
        scanner.close();
    }

    // Méthode pour saisir une matrice de taille donnée
    private static double[][] saisirMatrice(int taille) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrice = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.println("Entrez l'élément de la ligne " + (i + 1) + " et colonne " + (j + 1) + " : ");
                matrice[i][j] = scanner.nextDouble();
            }
        }

        return matrice;
    }

    // Méthode pour additionner deux matrices
    private static double[][] additionnerMatrices(double[][] matrice1, double[][] matrice2) {
        int taille = matrice1.length;
        double[][] sommeMatrices = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                sommeMatrices[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        return sommeMatrices;
    }

    // Méthode pour afficher une matrice
    private static void afficherMatrice(double[][] matrice) {
        int lignes = matrice.length;
        int colonnes = matrice[0].length;

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
