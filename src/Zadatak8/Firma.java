package Zadatak8;

import java.util.Map;

/**
 * @author Vladimir Krekic
 */



class Firma {

    private String nazivFirme;
    private double kapital;
    public Map<Proizvod, Integer> lista;

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

    public Map<Proizvod, Integer> getLista() {
        return lista;
    }

    public static void setLista(Map<Proizvod, Integer> lista) {
        lista = lista;
    }

    @Override
    public String toString() {
        return String.format("Naziv kompanije: %s Upisani kapital: %.2f dinara",
                getNazivFirme(), getKapital());
    }

    /**
     * izračuna, proverava da li ima dovoljno sredstava za porudzbinu na osnovu liste proizvoda.
     * Nakon uspešne porudžbine lista ostaje prazna.
     */
    public Map<Proizvod, Integer> porudzbina(Map<Proizvod, Integer> lista, Proizvod proizvod, int kolicina){
        if(lista.containsKey(proizvod) && lista.get(proizvod)>=kolicina){
            lista.replace(proizvod, lista.get(proizvod), lista.get(proizvod)-kolicina);
        }else
            System.out.println("Nema dovoljno proizvoda na lageru.");
        return lista;
    }
}
