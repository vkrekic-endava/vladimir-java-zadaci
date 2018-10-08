package Zadatak6;

/**
 * Zadatak 6
 *
 * @author Vladimir.Krekic
 */

class Kuca extends Nekretnina{

    private double povrsinaOkucnice;
    private double cena;
    private static final String TIP_NEKRETNINE = "Kuca";

    public Kuca(String adresa, Zona zona, double kvadratura, Vlasnik vlasnik, double povrsinaOkucnice) {
        super(adresa, zona, kvadratura, vlasnik);
        this.povrsinaOkucnice = povrsinaOkucnice;
        this.cena = setCena();
    }

    public static String getTipNekretnine() {
        return TIP_NEKRETNINE;
    }

    public double getPovrsinaOkucnice() {
        return povrsinaOkucnice;
    }

    public void setPovrsinaOkucnice(double povrsinaOkucnice) {
        this.povrsinaOkucnice = povrsinaOkucnice;
    }

    @Override
    public double getCena() {
        return this.cena;
    }

    @Override
    public double setCena() {
        this.cena = getKvadratura() * getZona().getCenaZaZonu()
                    + getPovrsinaOkucnice() * getZona().getCenaZaZonu() * 0.15;
        return this.cena;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("**************************" +
                        "%nDodatni podaci o nekternini%n" +
                        "**************************%nTip nekretnine: %s%n" +
                        "Povrsina okucnice: %.2f m2%nCena nekretnine: %.2f EUR%n",
                        getTipNekretnine(), getPovrsinaOkucnice(), this.getCena());
    }
}
