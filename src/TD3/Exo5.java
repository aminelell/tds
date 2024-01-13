package TD3;

public class Exo5 {
    public static void main(String[] args) {
        Vehicule vehicule = new Vehicule(4);
        Moto moto = new Moto(2);
        Avion avion = new Avion(100, 2);
        Triporteur triporteur = new Triporteur(3);

        System.out.println(vehicule);
        System.out.println(moto);
        System.out.println(avion);
        System.out.println(triporteur);
    }
}

public class Vehicule {
    private int nbPassager;

    public Vehicule(int n) {
        this.nbPassager = n;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "nbPassager=" + nbPassager +
                '}';
    }
}

public class Moto extends Vehicule {
    private int nbRoues = 2;

    public Moto(int n) {
        super(n);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "nbPassager=" + super.toString() +
                ", nbRoues=" + nbRoues +
                '}';
    }
}

public class Avion extends Vehicule {
    private int nbMoteur;

    public Avion(int nbP) {
        super(nbP);
        this.nbMoteur = 1; // Default value
    }

    public Avion(int nbP, int nbM) {
        super(nbP);
        this.nbMoteur = nbM;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "nbPassager=" + super.toString() +
                ", nbMoteur=" + nbMoteur +
                '}';
    }
}

public class Triporteur extends Moto {
    public Triporteur(int n) {
        super(n);
    }

    @Override
    public String toString() {
        return "Triporteur{" +
                "nbPassager=" + super.toString() +
                '}';
    }
}