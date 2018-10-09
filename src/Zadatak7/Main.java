package Zadatak7;

/**
 * ZADATAK7: Napisati program koji omogućava unos imena i prezimena studenata i broj poena osvojenih
 * na testu preko standardnog ulaza (sve dok se ne unese odredjeni znak/komanda za prekid unosa podataka npr. “stampaj”).
 * Broj poena sme da bude od 0 do 100.
 * Kao rezultat programa, očekuje se izlazni fajl “ocene.txt” u kojem će se nalaziti lista svih studenata, sortirana
 * po poenima, od najviše ka najmanje, i gde će se osim imena studenta i broja poena nalaziti i ocena koju je dobio na ispitu.
 * Ocena 10 ako je imao više od 90 poena, 9 ako je imao između 81 i 90... Sve do 5 ako je imao manje od 51 poen.
 *
 * @author Vladimir.Krekic
 */

class Main {

    public static void main(String[] args) {

        IOmetode io = IOmetode.getInstance();
        io.formirajSpisak();
    }
}
