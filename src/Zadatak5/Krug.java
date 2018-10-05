package Zadatak5;

/**
 * Zadatak 5
 *
 * @author Vladimir.Krekic
 */

class Krug extends GeometrijskaSlika{

    private double poluprecnik;
    private static final String NAZIV = "Krug";

    public Krug(){
    }

    public Krug(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double obim(){
        return getPoluprecnik()*2*Math.PI;
    }

    public double povrsina(){
        return Math.pow(getPoluprecnik(), 2)*Math.PI;
    }

    @Override
    public String toString() {
        return String.format
                ("%s%n*****************%nObim: %.4f%nPovrsina: %.4f%n*****************%n",
                        NAZIV, obim(), povrsina());
    }
}
