package Zadatak8;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vladimir Krekic
 */

class Firma {

    private String nazivFirme;
    private double kapital;
    private Map<Proizvod, Integer> spisak = new HashMap<>();

    public Firma(String nazivFirme, double kapital) {
        this.nazivFirme = nazivFirme;
        this.kapital = kapital;
    }

    public String getNazivFirme() {
        return nazivFirme;
    }

    public void setNazivFirme(String nazivFirme) {
        this.nazivFirme = nazivFirme;
    }

    public double getKapital() {
        return kapital;
    }

    public void setKapital(double kapital) {
        this.kapital = kapital;
    }

    public Map<Proizvod, Integer> getSpisak() {
        return spisak;
    }

    public void setLista(Map<Proizvod, Integer> spisak) {
        this.spisak = spisak;
    }

    @Override
    public String toString() {
        return String.format("Naziv kompanije: %s Upisani kapital: %.2f dinara",
                getNazivFirme(), getKapital());
    }

    /**
     * izračuna, proverava da li ima dovoljno sredstava za porudzbinu na osnovu liste proizvoda.
     * Nakon uspešne porudžbine spisak ostaje prazna.
     */
    public Map<Proizvod, Integer> porudzbina(Map<Proizvod, Integer> spisak, Proizvod proizvod, int kolicina){
        if(spisak.containsKey(proizvod) && spisak.get(proizvod)>=kolicina){
            spisak.replace(proizvod, spisak.get(proizvod), spisak.get(proizvod)-kolicina);
            System.out.printf("Uspesna porudzbina. Vrednost porudzbine %.2f%n", proizvod.getCenaProizvoda()*kolicina);
        }else
            System.out.println("Neuspesna porudzbina. Nema dovoljno proizvoda na lageru.");
        return spisak;
    }
}
