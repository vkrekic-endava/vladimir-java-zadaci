package Zadatak6;

/**
 * Zadatak 6
 *
 * @author Vladimir.Krekic
 */

abstract class Nekretnina {

    private String adresa;
    private Zona zona;
    private double kvadratura;
    private Vlasnik vlasnik;

    protected Nekretnina(String adresa, Zona zona, double kvadratura, Vlasnik vlasnik) {
        this.adresa = adresa;
        this.zona = zona;
        this.kvadratura = kvadratura;
        this.vlasnik = vlasnik;
    }

    public abstract double setCena();
    public abstract double getCena();

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return String.format("Podaci o nekretnini%n*******************************%n" +
                        "Adresa: %s%nZona: %s%nKvadratura: %.2f m2%n*******************************%n",
                getAdresa(), getZona().getNazivZone(), getKvadratura())+vlasnik;
    }
}
