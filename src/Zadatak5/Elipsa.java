package Zadatak5;

/**
 * Zadatak 5
 *
 * @author Vladimir.Krekic
 */

class Elipsa extends Krug{

    private double poluprecnikB;
    private static final String NAZIV = "Elipsa";

    public Elipsa() {
    }

    public Elipsa(double poluprecnikA, double poluprecnikB) {
        super(poluprecnikA);
        this.poluprecnikB = poluprecnikB;
    }

    public double getPoluprecnikB() {
        return poluprecnikB;
    }

    public void setPoluprecnikB(double poluprecnikB) {
        this.poluprecnikB = poluprecnikB;
    }

    @Override
    public double obim() {
        return getPoluprecnik()*Math.PI*(9-Math.sqrt(35))/2;
    }

    @Override
    public double povrsina() {
        return getPoluprecnik()* getPoluprecnikB()*Math.PI;
    }

    @Override
    public String toString() {
        return String.format
                ("%s%n*****************%nObim: %.4f%nPovrsina: %.4f%n*****************%n",
                        NAZIV, obim(), povrsina());
    }
}
