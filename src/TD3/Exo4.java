package TD3;
public class Exo4 {
    public static void main(String[] args) {
        Batiment batiment = new Batiment("123 rue de la Paix");
        Maison maison = new Maison("456 avenue des Champs", 5);
        Immeuble immeuble = new Immeuble("789 boulevard Saint-Michel", 20);

        System.out.println(batiment);
        System.out.println(maison);
        System.out.println(immeuble);
    }
}
 class Batiment {
    private String adresse;

    public Batiment() {
        this.adresse = "";
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "adresse='" + adresse + '\'' +
                '}';
    }
}

public class Maison extends Batiment {
    private int nbChambres;

    public Maison() {
        super();
        this.nbChambres = 0;
    }

    public Maison(String adresse, int nbChambres) {
        super(adresse);
        this.nbChambres = nbChambres;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "adresse='" + getAdresse() + '\'' +
                ", nbChambres=" + nbChambres +
                '}';
    }
}

public class Immeuble extends Batiment {
    private int nbAppart;

    public Immeuble() {
        super();
        this.nbAppart = 0;
    }

    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble{" +
                "adresse='" + getAdresse() + '\'' +
                ", nbAppart=" + nbAppart +
                '}';
    }
}


