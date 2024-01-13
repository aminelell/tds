package TD1.lesConditions;

import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer les coefficients a, b et c
        System.out.println("Entrez la valeur de a : ");
        double coefficientA = input.nextDouble();

        System.out.println("Entrez la valeur de b : ");
        double coefficientB = input.nextDouble();

        System.out.println("Entrez la valeur de c : ");
        double coefficientC = input.nextDouble();

        // Calculer le discriminant
        double discriminant = coefficientB * coefficientB - 4 * coefficientA * coefficientC;

        // Vérifier le discriminant pour déterminer le nombre de solutions
        if (discriminant > 0) {
            double racine1 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
            double racine2 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);
            System.out.println("Les solutions de l'équation sont : " + racine1 + " et " + racine2);
        } else if (discriminant == 0) {
            double racine = -coefficientB / (2 * coefficientA);
            System.out.println("L'équation a une solution double : " + racine);
        } else {
            System.out.println("L'équation n'a pas de solution réelle.");
        }

        // Fermer le scanner
        input.close();
    }
}
