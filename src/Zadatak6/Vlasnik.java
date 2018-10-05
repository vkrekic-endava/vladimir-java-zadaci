package Zadatak6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Zadatak 6
 *
 * @author Vladimir.Krekic
 */

class Vlasnik {

    private static final Pattern pattern = Pattern.compile("[0-9]");
    private String imeVlasnika;
    private String prezimeVlasnika;
    private final String JMBG;
    private String brojLicneKarte;

    public Vlasnik(String imeVlasnika, String prezimeVlasnika, String JMBG, String brojLicneKarte) {
        this.imeVlasnika = imeVlasnika;
        this.prezimeVlasnika = prezimeVlasnika;
        if(checkJMBG(JMBG)){
            this.JMBG = JMBG;
        }else this.JMBG = "Pogresan maticni broj";
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

    private boolean checkJMBG(String JMBG){
        Matcher matcher = pattern.matcher(JMBG);
        if(matcher.matches() && JMBG.length()==13)
            return true;
        return false;
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
