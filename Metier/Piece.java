package Metier;

public class Piece{

    private int id;
    private boolean OrientHaut;
    private boolean OrientBas;
    private boolean OrientGauche;
    private boolean OrientDroite;
    private Objet objet = null;

    public Piece(int id, boolean OrientHaut, boolean OrientBas, boolean OrientGauche, boolean OrientDroite) {

        this.id = id;
        this.OrientHaut   = OrientHaut;
        this.OrientBas    = OrientBas;
        this.OrientGauche = OrientGauche;
        this.OrientDroite = OrientDroite;
    }

    public int getId() {

        return id;
    }

    public boolean getOrientHaut() {

        return OrientHaut;
    }

    public boolean getOrientBas() {

        return OrientBas;
    }

    public boolean getOrientGauche() {

        return OrientGauche;
    }

    public boolean getOrientDroite() {

        return OrientDroite;
    }

    public Objet getObjet() {

        return objet;
    }

    public void tournerDroite(){

        boolean temp = OrientHaut;

        OrientHaut   = OrientGauche;
        OrientGauche = OrientBas;
        OrientBas    = OrientDroite;
        OrientDroite = temp;
    }

    public void tournerGauche(){

        boolean temp = OrientHaut;

        OrientHaut   = OrientDroite;
        OrientDroite = OrientBas;
        OrientBas    = OrientGauche;
        OrientGauche = temp;
    }


}