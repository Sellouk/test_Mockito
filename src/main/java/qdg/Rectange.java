package qdg;

public class Rectange implements Iforme {
    private double largeur;
    private double hauter;


    public Rectange(double w , double h){
        this.hauter=h;
        this.largeur=w;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getHauter() {
        return hauter;
    }

    @Override
    public double aire() {
        return this.getHauter()*this.getLargeur();
    }
}
