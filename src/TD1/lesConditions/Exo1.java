package TD1.lesConditions;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer trois nombres
        System.out.println("Entrez le premier nombre : ");
        int num1 = input.nextInt();

        System.out.println("Entrez le deuxième nombre : ");
        int num2 = input.nextInt();

        System.out.println("Entrez le troisième nombre : ");
        int num3 = input.nextInt();

        // Trouver le maximum des trois nombres
        int maxNombre;

        if (num1 > num2 && num1 > num3) {
            maxNombre = num1;
        } else if (num2 > num1 && num2 > num3) {
            maxNombre = num2;
        } else {
            maxNombre = num3;
        }

        // Afficher le résultat
        System.out.println("Le maximum des trois nombres est : " + maxNombre);

        // Fermer le scanner
        input.close();
    }
}
