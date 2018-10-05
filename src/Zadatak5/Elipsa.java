package Zadatak5;

/**
 * Zadatak 5
 *
 * @author Vladimir.Krekic
 */

class Elipsa extends Krug{

    private double poluprecnik2;
    private static final String NAZIV = "Elipsa";

    public Elipsa() {
    }

    public Elipsa(double poluprecnik, double poluprecnik2) {
        super(poluprecnik);
        this.poluprecnik2 = poluprecnik2;
    }

    public double getPoluprecnik2() {
        return poluprecnik2;
    }

    public void setPoluprecnik2(double poluprecnik2) {
        this.poluprecnik2 = poluprecnik2;
    }

    @Override
    public double obim() {
        return getPoluprecnik()*Math.PI*(9-Math.sqrt(35))/2;
    }

    @Override
    public double povrsina() {
        return getPoluprecnik()*getPoluprecnik2()*Math.PI;
    }

    @Override
    public String toString() {
        return String.format
                ("%s%n*****************%nObim: %.4f%nPovrsina: %.4f%n*****************%n",
                        NAZIV, obim(), povrsina());
    }
}
