package TD2;

public class Exo1 {
    public static void main(String[] args) {
        Point1 p=new Point1("A", 5);
        System.out.println(p.affiche());
        p.translate(5);
        System.out.println(p.affiche());
    }
}
class Point1 {
    String nom;
    double x;
    public Point1(String nom, double x){
        this.nom=nom;
        this.x=x;
    }
    public String affiche(){
        return "nom= "+nom+" x= "+x;
    }
    public void translate(double valeur){
        this.x+=valeur;
    }
}