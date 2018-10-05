package Zadatak6;

/**
 * Zadatak 6
 *
 * @author Vladimir.Krekic
 */

class Vlasnik {

    private String imeVlasnika;
    private String prezimeVlasnika;
    private final String JMBG;
    private String brojLicneKarte;

    public Vlasnik(String imeVlasnika, String prezimeVlasnika, String JMBG, String brojLicneKarte) {
        this.imeVlasnika = imeVlasnika;
        this.prezimeVlasnika = prezimeVlasnika;
        this.JMBG = JMBG;
        this.brojLicneKarte = brojLicneKarte;
    }

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    public String getPrezimeVlasnika() {
        return prezimeVlasnika;
    }

    public void setPrezimeVlasnika(String prezimeVlasnika) {
        this.prezimeVlasnika = prezimeVlasnika;
    }

    public String getJMBG() {
        return JMBG;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Integer.parseInt(getJMBG().substring(4));
    }

    public int equals(Vlasnik vlasnik) {
        return this.getJMBG().compareToIgnoreCase(vlasnik.getJMBG());
    }

    @Override
    public String toString() {
        return String.format("Podaci o vlasniku nekretnine%n*********************************%n" +
                        "Ime: %s%nPrezime: %s%nJMBG: %s%nBroj licne karte: %s%n",
                getImeVlasnika(), getPrezimeVlasnika(), getJMBG(), getBrojLicneKarte());
    }
}
