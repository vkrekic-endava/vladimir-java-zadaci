package Zadatak6;

/**
 * Zadatak 6
 *
 * @author Vladimir.Krekic
 */

abstract class Nekretnina {

    public String adresa;
    public Zona zona;
    public double kvadratura;
    public Vlasnik vlasnik;

    public Nekretnina(String adresa, Zona zona, double kvadratura, Vlasnik vlasnik) {
        this.adresa = adresa;
        this.zona = zona;
        this.kvadratura = kvadratura;
        this.vlasnik = vlasnik;
    }

    public abstract String getAdresa();
    public abstract void setAdresa(String adresa);
    public abstract double getKvadratura();
    public abstract void setKvadratura(double kvadratura);
    public abstract Vlasnik getVlasnik();
    public abstract void setVlasnik(Vlasnik vlasnik);

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
                getAdresa(), getZona().getNazivZone(), getKvadratura(), getVlasnik()) + vlasnik;
    }
}
