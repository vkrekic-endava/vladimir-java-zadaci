package Zadatak5;

/**
 * Zadatak 5
 *
 * @author Vladimir.Krekic
 */

abstract class GeometrijskaSlika {

    private double obim;
    private double povrsina;
    private static final String NAZIV = "Geometrijska slika";

    public GeometrijskaSlika() {
    }

    public GeometrijskaSlika(double obim) {
        this.obim = obim;
        this.povrsina = 1;
    }

    public GeometrijskaSlika(double obim, double povrsina) {
        this.obim = obim;
        this.povrsina = povrsina;
    }

    public abstract double obim();
    public abstract double povrsina();

    public double getObim() {
        return obim;
    }

    public double getPovrsina() {
        return povrsina;
    }

    @Override
    public String toString() {
        return String.format
                ("%s\n*****************\nObim: %.4f\nPovrsina: %.4f\n*****************\n",
                        NAZIV, getObim(), getPovrsina());
    }
}
