package TD3;


public class Exo1 {
    public static void main(String[] args) {
        // Utilisation de la classe Point
        point point = new point(3, 5);
        System.out.println("Coordonnées du point : (" + point.getX() + ", " + point.getY() + ")");
        point.deplace(2, 3);
        System.out.println("Coordonnées du point après déplacement : (" + point.getX() + ", " + point.getY() + ")");

        // Utilisation de la classe dérivée PointA
        PointA pointA = new PointA(1, 2);
        pointA.affiche();
        pointA.deplace(3, 4);
        pointA.affiche();
    }
}
class point {
    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int x, y;
}

class PointA extends point {
    public PointA(int x, int y) {
        super(x, y);
    }

    public void affiche() {
        System.out.println("Coordonnées du point : (" + getX() + ", " + getY() + ")");
    }
}
