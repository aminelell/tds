package TD2;

public class Exo5 {
    public static void main(String[] args) {
        Rectangle R= new Rectangle(20,10);
        System.out.println(R.toString());
    }
}
class Rectangle {
    private double langueur;
    private double largeur;

    public Rectangle() {

    }

    public Rectangle(double langueur, double largeur) {
        this.langueur = langueur;
        this.largeur = largeur;
    }

    public Rectangle(Rectangle R) {
        this.langueur = R.getLangueur();
        this.largeur = R.getLargeur();
    }


    public double getLangueur() {
        return langueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLangueur(double langueur) {
        if (langueur > 0)
            this.langueur = langueur;
        else this.langueur = 0;
    }

    public void setLargeur(double largeur) {
        if (largeur > 0)
            this.largeur = largeur;
        else this.largeur = 0;
    }

    public double perimetre() {
        return 2 * (largeur + langueur);
    }

    public double aire() {
        return largeur * langueur;
    }

    public boolean isCarre() {
        return largeur == langueur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "langueur=" + langueur +
                ", largeur=" + largeur +
                ", perimetre=" + perimetre() +
                ", aire=" + aire() +
                ", is carre=" + (isCarre() ? "Yes" : "No") +
                '}';
    }
}
