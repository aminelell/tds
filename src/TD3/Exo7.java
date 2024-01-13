package TD3;


public abstract class Employe {
    protected String nom;
    protected String prenom;

    public Employe() {
        this.nom = "";
        this.prenom = "";
    }

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double gains();

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}

public class Patron extends Employe {
    private double salaire;

    public Patron() {
        super();
        this.salaire = 0;
    }

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    @Override
    public double gains() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}

public class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission() {
        super();
        this.salaire = 0;
        this.commission = 0;
        this.quantite = 0;
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
    }

    @Override
    public double gains() {
        return salaire + commission * quantite;
    }

    @Override
    public String toString() {
        return "TravailleurCommission{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                ", commission=" + commission +
                ", quantite=" + quantite +
                '}';
    }
}

public class TravailleurHoraire extends Employe {
    private double retribution;
    private int heures;

    public TravailleurHoraire() {
        super();
        this.retribution = 0;
        this.heures = 0;
    }

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
    }

    @Override
    public double gains() {
        return retribution * heures;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", retribution=" + retribution +
                ", heures=" + heures +
                '}';
    }
}
public class Exo7 {
    public static void main(String[] args) {
        Patron patron = new Patron("Smith", "John", 5000);
        TravailleurCommission travailleurCommission = new TravailleurCommission("Doe", "Jane", 2000, 50);
        TravailleurHoraire travailleurHoraire = new TravailleurHoraire("Brown", "Bob", 20);

        System.out.println(patron);
        System.out.println("Gains: " + patron.gains());

        System.out.println(travailleurCommission);
        System.out.println("Gains: " + travailleurCommission.gains());

        System.out.println(travailleurHoraire);
        System.out.println("Gains: " + travailleurHoraire.gains());
    }
}
