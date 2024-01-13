package TD3;

public class Exo3 {
    public static void main(String[] args) {
        // Utilisation de la classe Centre
        Centre centre = new Centre(3, 5, 'A');
        centre.affiche();

        // Utilisation de la classe Cercle
        Cercle cercle = new Cercle(7, 9, 'B', 5.0);
        cercle.afficheCercle();
    }
}
class Point1 {
    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    private int x, y;

    protected int getX(int x, int y) {
        return this.x;
    }
}
// Classe Centre dérivée de Point
class Centre extends Point1 {
    private char nom;

    // Constructeur
    public Centre(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    // Méthode pour afficher le nom
    public void affNom() {
        System.out.println("Nom : " + nom);
    }

    // Redéfinition de la méthode affiche pour afficher les coordonnées et le nom
    @Override
    public void affiche() {
        super.affiche();
        affNom();
    }
}

// Classe Cercle héritant de Centre
class Cercle extends Centre {
    private double rayon;

    // Constructeur
    public Cercle(int x, int y, char nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    // Méthode pour afficher les informations du cercle
    public void afficheCercle() {
        System.out.println("Coordonnées du centre du cercle : ");
        super.affiche();  // Utilisation de la méthode affiche redéfinie dans la classe Centre
        System.out.println("Rayon du cercle : " + rayon);
    }
}