package TD3;

public class Exo2 {public static void main(String[] args) {
    PointNom pointNom = new PointNom(5, 10, 'A');
    pointNom.affCoordNom();

    pointNom.setPointNom(15, 20, 'B');
    pointNom.affCoordNom();

    pointNom.setNom('C');
    pointNom.affCoordNom();
}

}
public class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}

public class PointNom extends Point {
    private char nom;

    public PointNom(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void setPointNom(int x, int y, char nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void affCoordNom() {
        System.out.println("Coordonnees : " + x + " " + y + ", Nom : " + nom);
    }
}


