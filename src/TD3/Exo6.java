package TD3;

public class Exo6 {
    public static void main(String[] args) {
        Disque disque = new Disque(0, 5, "MonDisque");
        Rectangle rectangle = new Rectangle(10, 5, "MonRectangle");

        System.out.println(disque);
        System.out.println("Perimeter: " + disque.getPerimeter());
        System.out.println("Aire: " + disque.getAire());

        System.out.println(rectangle);
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Aire: " + rectangle.getAire());
    }

}
public abstract class Figure {
    protected String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double getPerimeter();

    public abstract double getAire();

    @Override
    public String toString() {
        return "Figure{" +
                "nom='" + nom + '\'' +
                '}';
    }
}

public class Disque extends Figure {
    private double centre;
    private double rayon;

    public Disque() {
        super("Disque");
        this.centre = 0;
        this.rayon = 0;
    }

    public Disque(double centre, double rayon) {
        super("Disque");
        this.centre = centre;
        this.rayon = rayon;
    }

    public Disque(double centre, double rayon, String nom) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getAire() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public String toString() {
        return "Disque{" +
                "nom='" + nom + '\'' +
                ", centre=" + centre +
                ", rayon=" + rayon +
                '}';
    }
}

public class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle() {
        super("Rectangle");
        this.longueur = 0;
        this.largeur = 0;
    }

    public Rectangle(double longueur, double largeur) {
        super("Rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "nom='" + nom + '\'' +
                ", longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}

