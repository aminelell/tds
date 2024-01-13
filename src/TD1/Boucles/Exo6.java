package TD1.Boucles;

public class Exo6 {
    public static void main(String[] args) {

        System.out.println("Combinaisons d'entiers donnant un total de 15 :");

        // Utilisation de trois boucles pour générer toutes les combinaisons possibles
        for (int nombre1 = 1; nombre1 <= 9; nombre1++) {
            for (int nombre2 = 1; nombre2 <= 9; nombre2++) {
                for (int nombre3 = 1; nombre3 <= 9; nombre3++) {
                    if (nombre1 + nombre2 + nombre3 == 15) {
                        System.out.println(nombre1 + " + " + nombre2 + " + " + nombre3 + " = 15");
                    }
                }
            }
        }
    }
}
