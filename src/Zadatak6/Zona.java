package Zadatak6;

/**
 * Zadatak 6
 *
 * @author Vladimir.Krekic
 */

enum Zona {

    ZONA1 ("Prva zona", 3000.),
    ZONA2 ("Druga zona", 2000.),
    ZONA3 ("Treca zona", 1000),
    ZONA4 ("Cetvrta zona", 500.);

    private final String nazivZone;
    private final double cenaZaZonu;

    Zona(String nazivZone, double cenaZaZonu) {
        this.nazivZone = nazivZone;
        this.cenaZaZonu = cenaZaZonu;
    }

    public String getNazivZone() {
        return nazivZone;
    }

    public double getCenaZaZonu() {
        return cenaZaZonu;
    }
}
