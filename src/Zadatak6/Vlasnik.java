package Zadatak6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Zadatak 6
 *
 * @author Vladimir.Krekic
 */

class Vlasnik {

    private String imeVlasnika;
    private String prezimeVlasnika;
    private final String jmbg;
    private String brojLicneKarte;

    public Vlasnik(String imeVlasnika, String prezimeVlasnika, String jmbg, String brojLicneKarte) {
        if(checkIme(imeVlasnika)){
            this.imeVlasnika = imeVlasnika;
        }else
            this.imeVlasnika = "Neispravno ime vlasnika";
        if(checkIme(prezimeVlasnika)){
            this.prezimeVlasnika = prezimeVlasnika;
        }else
            this.prezimeVlasnika = "Neispravno prezime vlasnika";
        if(checkJmbgLK(jmbg, 13)){
            this.jmbg = jmbg;
        }else
            this.jmbg = "Neispravan maticni broj";
        if(checkJmbgLK(brojLicneKarte, 9)){
            this.brojLicneKarte = brojLicneKarte;
        }else
            this.brojLicneKarte = "Neispravan broj licne karte";
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

    public String getJmbg() {
        return jmbg;
    }

    /**
     * Proverava ispravnost ubetog JMBG i broja licne karte
     * @param ime String koji sadrzi samo slova
     * @return boolean
     */
    private boolean checkIme(String ime){
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(ime);
        return matcher.matches();
    }

    /**
     * Proverava ispravnost ubetog JMBG i broja licne karte
     * @param broj String koji predstavlja JMBG ili broj licne karte i sastoji se od cifara
     * @param duzina 13 za JMBG odnosno 9 za broj licne karte
     * @return boolean
     */
    private boolean checkJmbgLK(String broj, int duzina){
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(broj);
        return matcher.matches() && broj.length() == duzina;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    @Override
    public String toString() {
        return String.format("Podaci o vlasniku nekretnine%n*********************************%n" +
                        "Ime: %s%nPrezime: %s%nJMBG: %s%nBroj licne karte: %s%n",
                getImeVlasnika(), getPrezimeVlasnika(), getJmbg(), getBrojLicneKarte());
    }
}
