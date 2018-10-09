/**
 * ZADATAK8: Napisati program koji opisuje sledeći scenario:
 * Firma se bavi preprodajom prehrambenih proizvoda. Proizvode razlikujemo po sledećim kategorijama proizvoda:
 * •             Mlečni proizvodi
 * •             Kafe, Sokovi
 * •             Meso
 * O svim proizvodima čuvamo informacije: ime proizvoda, cena proizvoda i rok trajanja.
 * Kod mlečnih proizvoda čuvamo i poreklo mleka.
 * Kod kafe da li je u zrnu ili je samlevena.
 * O Sokovima čuvamo od čega je sok.
 * Kod mesa čuvamo od koje životinje je meso.
 * Kod cene mlečnih proizvoda i sokova PDV je 20%, dok je za meso i kafu PDV na cenu 8%
 * Firma ima polje kapital, listu proizvoda i metodu porudzbina() koja izračuna, proverava da li
 * ima dovoljno sredstava za porudzbinu na osnovu liste proizvoda. Nakon uspešne porudžbine lista ostaje prazna.
 */


import java.time.LocalDate;
import java.util.HashMap;

/**
 * @author Vladimir Krekic
 */

class Main {

    public static void main(String[] args) {

        Firma firma = new Firma("Najbolja Kompanija d.o.o.", 2000000);

        LocalDate localDate1 = LocalDate.of(2020, 1,25);
        Proizvod proizvod1 = new Sokovi("Priroda", 116.5, localDate1, Pdv.MLEKO_SOKOVI, "Jabuka");
        LocalDate localDate2 = LocalDate.of(2022, 10,5);
        Proizvod proizvod2 = new Kafe("C", 306.5, localDate2, Pdv.MESO_KAFE, ZrnoMlevena.MLEVENA);
        LocalDate localDate3 = LocalDate.of(2018, 12,15);
        Proizvod proizvod3 = new MlecniProizvodi("Kravica", 87, localDate3, Pdv.MLEKO_SOKOVI, "Imlek");
        LocalDate localDate4 = LocalDate.of(2018, 10,5);
        Proizvod proizvod4 = new Meso("Klanica Laza", 446.5, localDate4, Pdv.MESO_KAFE, "Junetina");
        LocalDate localDate5 = LocalDate.of(2020, 2,17);
        Proizvod proizvod5 = new Sokovi("Natura", 126.5, localDate5, Pdv.MLEKO_SOKOVI, "Borovnica");
        LocalDate localDate6 = LocalDate.of(2018, 10,28);
        Proizvod proizvod6 = new MlecniProizvodi("Priroda", 96.5, localDate6, Pdv.MLEKO_SOKOVI, "Premia");
        LocalDate localDate7 = LocalDate.of(2021, 6,29);
        Proizvod proizvod7 = new Meso("Big Bull", 356.5, localDate7, Pdv.MESO_KAFE, "Govedina");

        firma.lista = new HashMap<>();
        firma.lista.put(proizvod1, 55);
        firma.lista.put(proizvod2, 85);
        firma.lista.put(proizvod3, 155);
        firma.lista.put(proizvod4, 505);
        firma.lista.put(proizvod5, 68);
        firma.lista.put(proizvod6, 11);
        firma.lista.put(proizvod7, 22);

        System.out.println(firma);
        System.out.println("***********************************************************************************");
        System.out.println("Spisak proizvoda sa kolicinama");
        System.out.println("***********************************************************************************");
        firma.lista.forEach((k,v)->
                System.out.println(k + "........Kolicina: " + v));
        System.out.println("***********************************************************************************");

        System.out.printf("Pokusaj skidanja %d komada %s %s%n", 32, proizvod1.getImeProizvoda(), ((Sokovi) proizvod1).getSirovina());
        firma.porudzbina(firma.lista, proizvod1, 32);

        System.out.println("Spisak proizvoda sa kolicinama nakon porudzbine");
        System.out.println("***********************************************************************************");
        firma.lista.forEach((k,v)->
                System.out.println(k + "........Kolicina: " + v));
        System.out.println("***********************************************************************************");

        System.out.printf("Pokusaj skidanja %d komada %s %s%n", 42, proizvod1.getImeProizvoda(), ((Sokovi) proizvod1).getSirovina());
        firma.porudzbina(firma.lista, proizvod1, 42);

        System.out.println("Spisak proizvoda sa kolicinama nakon porudzbine");
        System.out.println("***********************************************************************************");
        firma.lista.forEach((k,v)->
                System.out.println(k + "........Kolicina: " + v));
        System.out.println("***********************************************************************************");

    }



}
