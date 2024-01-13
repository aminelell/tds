package TD1.Boucles;

import java.util.Scanner;

//partie1
class Maximum20Nombres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maximum = Integer.MIN_VALUE;

        // Demander successivement 20 nombres à l'utilisateur
        for (int i = 1; i <= 20; i++) {
            System.out.println("Entrez le nombre #" + i + " : ");
            int nombre = input.nextInt();

            // Mettre à jour le maximum si nécessaire
            if (nombre > maximum) {
                maximum = nombre;
            }
        }

        // Afficher le maximum des 20 nombres
        System.out.println("Le maximum des 20 nombres est : " + maximum);

        // Fermer le scanner
        input.close();
    }
}
//partie2
class MaximumAvecPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maximum = Integer.MIN_VALUE;
        int positionMaximum = 0;

        // Demander successivement 20 nombres à l'utilisateur
        for (int i = 1; i <= 20; i++) {
            System.out.println("Entrez le nombre #" + i + " : ");
            int nombre = input.nextInt();

            // Mettre à jour le maximum et la position si nécessaire
            if (nombre > maximum) {
                maximum = nombre;
                positionMaximum = i;
            }
        }

        // Afficher le maximum et sa position parmi les 20 nombres
        System.out.println("Le maximum des 20 nombres est : " + maximum);
        System.out.println("Il a été saisi à la position : " + positionMaximum);

        // Fermer le scanner
        input.close();
    }
}

//partie3
class MaximumSuiteTermineeParZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maximum = Integer.MIN_VALUE;
        int nombre;

        // Demander successivement des nombres à l'utilisateur jusqu'à ce que 0 soit saisi
        do {
            System.out.println("Entrez un nombre (saisissez 0 pour terminer) : ");
            nombre = input.nextInt();

            // Mettre à jour le maximum si nécessaire
            if (nombre != 0 && nombre > maximum) {
                maximum = nombre;
            }
        } while (nombre != 0);

        // Afficher le maximum de la suite
        System.out.println("Le maximum de la suite est : " + maximum);

        // Fermer le scanner
        input.close();
    }
}


public class Exo3 {
    public static void main(String[] args){
    }
}
