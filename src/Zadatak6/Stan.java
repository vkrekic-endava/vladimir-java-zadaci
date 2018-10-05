package Zadatak6;

/**
 * Zadatak 6
 *
 * @author Vladimir.Krekic
 */

class Stan extends Nekretnina{

    private double povrsinaPodruma;
    private double povrsinaTerase;
    private double cena;
    private static final String TIP_NEKRETNINE = "Stan";

    public Stan(String adresa, Zona zona, double kvadratura, Vlasnik vlasnik, double povrsinaPodruma, double povrsinaTerase) {
        super(adresa, zona, kvadratura, vlasnik);
        this.povrsinaPodruma = povrsinaPodruma;
        this.povrsinaTerase = povrsinaTerase;
        this.cena = setCena();
    }

    public static String getTipNekretnine() {
        return TIP_NEKRETNINE;
    }

    public double getPovrsinaPodruma() {
        return povrsinaPodruma;
    }

    public void setPovrsinaPodruma(double povrsinaPodruma) {
        this.povrsinaPodruma = povrsinaPodruma;
    }

    public double getPovrsinaTerase() {
        return povrsinaTerase;
    }

    public void setPovrsinaTerase(double povrsinaTerase) {
        this.povrsinaTerase = povrsinaTerase;
    }

    public double getCena() {
        return this.cena;
    }

    public double setCena() {
        this.cena = getKvadratura() * getZona().getCenaZaZonu()
                + ((getPovrsinaPodruma() + getPovrsinaTerase()) * getZona().getCenaZaZonu() * 0.33);
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
        return super.toString() + String.format("**************************%n" +
                        "Dodatni podaci o nekternini%n**************************%n" +
                        "Tip nekretnine: %s%nPovrsina terase: %.2f m2%n" +
                        "Povrsina podruna: %.2f m2%nCena nekretnine: %.2f EUR%n",
                        getTipNekretnine(), getPovrsinaTerase(), getPovrsinaPodruma(), getCena());
    }


}
