package TD1.Tables;

import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau (nombre d'étudiants)
        System.out.println("Entrez le nombre d'étudiants : ");
        int nombreEtudiants = scanner.nextInt();

        // Créer le tableau des moyennes
        double[] moyennes = new double[nombreEtudiants];

        // Demander à l'utilisateur de saisir les moyennes
        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.println("Entrez la moyenne de l'étudiant #" + (i + 1) + " : ");
            moyennes[i] = scanner.nextDouble();
        }

        // Demander à l'utilisateur de saisir le seuil
        System.out.println("Entrez le seuil de moyenne : ");
        double seuil = scanner.nextDouble();

        // Compter le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil
        int nombreEtudiantsSupSeuil = compterMoyennesSupSeuil(moyennes, seuil);

        // Afficher le résultat
        System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil est : "
                + nombreEtudiantsSupSeuil);

        // Fermer le scanner
        scanner.close();
    }

    // Méthode pour compter le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil
    private static int compterMoyennesSupSeuil(double[] moyennes, double seuil) {
        int count = 0;
        for (double moyenne : moyennes) {
            if (moyenne >= seuil) {
                count++;
            }
        }
        return count;
    }
}
