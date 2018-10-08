package Zadatak5;

/**
 * Zadatak 5
 *
 * @author Vladimir.Krekic
 */

class Pravougaonik extends Kvadrat{

    private double stranicaB;
    private static final String NAZIV = "Pravougaonik";

    public Pravougaonik() {
    }

    public Pravougaonik(double stranicaA, double stranicaB) {
        super(stranicaA);
        this.stranicaB = stranicaB;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    @Override
    public double obim() {
        return 2* getStranicaB()+2*getStranica();
    }

    @Override
    public double povrsina() {
        return getStranicaB()*getStranica();
    }

    @Override
    public String toString() {
        return String.format
                ("%s%n*****************%nObim: %.4f%nPovrsina: %.4f%n*****************%n",
                        NAZIV, obim(), povrsina());
    }
}
