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

    public double getCena() {
        return this.cena;
    }

    public double setCena() {
        this.cena = getKvadratura() * getZona().getCenaZaZonu()
                    + getPovrsinaOkucnice() * getZona().getCenaZaZonu() * 0.15;
        return this.cena;
    }

    @Override
    public String getAdresa() {
        return adresa;
    }

    @Override
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public double getKvadratura() {
        return kvadratura;
    }

    @Override
    public void setKvadratura(double kvadratura) {
        this.kvadratura = kvadratura;
    }

    @Override
    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    @Override
    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
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
