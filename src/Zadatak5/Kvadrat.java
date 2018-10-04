package Zadatak5;

/**
 * Zadatak 5
 *
 * @author Vladimir.Krekic
 */

class Kvadrat extends GeometrijskaSlika{

    private double stranica;
    private static final String NAZIV = "Kvadrat";

    public Kvadrat() {
    }

    public Kvadrat(double stranica) {
        this.stranica = stranica;
    }

    public double getStranica() {
        return stranica;
    }

    public void setStranica(double stranica) {
        this.stranica = stranica;
    }

    public double obim(){
        return 4*getStranica();
    }

    public double povrsina(){
        return getStranica()*getStranica();
    }

    @Override
    public String toString() {
        return String.format
                ("%s\n*****************\nObim: %.4f\nPovrsina: %.4f\n*****************\n",
                        NAZIV, obim(), povrsina());
    }
}
