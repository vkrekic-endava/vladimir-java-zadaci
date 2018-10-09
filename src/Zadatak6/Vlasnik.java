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
        if(imeVlasnika.matches("[a-zA-Z]+")){
            this.imeVlasnika = imeVlasnika;
        }else
            this.imeVlasnika = "Neispravno ime vlasnika";
        if(prezimeVlasnika.matches("[a-zA-Z']+")){
            this.prezimeVlasnika = prezimeVlasnika;
        }else
            this.prezimeVlasnika = "Neispravno prezime vlasnika";
        if(jmbg.matches("[0-9]+") && jmbg.length()==13){
            this.jmbg = jmbg;
        }else
            this.jmbg = "Neispravan maticni broj";
        if(brojLicneKarte.matches("[0-9]+") && brojLicneKarte.length()==9){
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
