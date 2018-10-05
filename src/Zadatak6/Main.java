package Zadatak6;

/**
 * ZADATAK6: Kreirati projekat Nekretnina na sledeći način:
 * •	Apstraktna klasa Nekretnina koja od atributa ima
 * •	adresu, zonu, kvadraturu i podatke o vlasniku/instancu klase Vlasnik.
 * •	Vlasnik ima puno ime i prezime, JMBG i broj lične karte.
 * •	Izvedene klase, Stan i Kuca imaju toString() metod gde se ispisuju sve informacije
 * o nekretnini uključujući Vlasnika i cenu
 * •	Cena se računa po principu kvadratura X zona (I zona 3000, II zona 2000, III zona 1000, IV zona 500 €)
 * •	Kuća ima dodatno polje površinaOkućnice.
 * •	U cenu kuće ulazi i cena okućnice koja se računa po principu (površinaOkućnice X zona X 15%)
 * •	Stan ima dva dodatna polja , površinaPodruma i površinaTerase.
 * •	U cenu Stana ulazi i cena podruma i terase ((povrsinaPodruma+povrsinaTerase) X Zona X 33%)
 * Napraviti Main klasu i u njoj kreirati instance klase Nekretnina i napraviti objekte izvedenih
 * klasa sa proizvoljnim argumentima.
 *
 * @author Vladimir.Krekic
 */

class Main {

    public static void main(String[] args) {

        Vlasnik prvi = new Vlasnik("Pera", "Peric", "0101970710589", "0056897");
        Vlasnik drugi = new Vlasnik("Mara", "Maric", "0202958746589", "000225");

        Nekretnina stan = new Stan("Prva ulica 1", Zona.ZONA1, 89, prvi, 9, 8);
        Nekretnina kuca = new Kuca("Drugi bulevar 44", Zona.ZONA3, 157, drugi, 150);

        System.out.println(stan);
        System.out.println(kuca);
    }
}
