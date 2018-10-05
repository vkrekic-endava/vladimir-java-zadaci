package Zadatak4;

/**
 *   ZADATAK4: Za uneti niz celih brojeva duzine n>=5 (koja se takođe unosi),
 *   sortirati niz, ispitati da li sadrži broj x i ispisati prvih 5 članova niza
 *   na standardni izlaz.
 *
 * @author Vladimir Krekic
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class Niz {

    private static Scanner scanner = new Scanner(System.in);
    private static final String ZA_DUZINU_NIZA = "Unesite duzinu niza (ceo broj veci od 4): ";
    private static final String ZA_POGADJANJE = "Unesite broj za pretragu (ceo broj): ";
    private static final String NIJE_CEO_BROJ = "Niste uneli ceo broj!\nMolim Vas pokusajte ponovo.";
    private static final String NIJE_VECI_OD_4 = "Niste uneli ceo broj veci od 4!\nMolim Vas pokusajte ponovo.";

    public static void main(String[] args) {

        int duzinaNiza = unosBroja(ZA_DUZINU_NIZA);

        int[] niz = unosElemenataNiza(duzinaNiza);

        int trazeniBroj = unosBroja(ZA_POGADJANJE);

        Arrays.sort(niz);

        System.out.println(poruka(pronadji(niz, trazeniBroj), trazeniBroj));

        System.out.println("Stampanje prvih pet clanova sortiranog niza");
        stampanje(niz);

        scanner.close();
    }

    /**
     * Unosi duzinu niza ili broj za retragu, zavisno od stringa
     * @param poruka = String konstanta koja govori da li unosimo duzinu niza (uslov >= 5) ili broj za pretragu
     * @return broj koji smo uneli ako ispunjava uslov
     */

    private static int unosBroja(String poruka){
        String porukaGreske = odredjivanjePorukeGreske(poruka);
        int brojKojiSeUnosi;
        do {
            System.out.println(poruka);
            try {
                brojKojiSeUnosi = scanner.nextInt();
                if(poruka.equals(ZA_DUZINU_NIZA) && (brojKojiSeUnosi < 5)){
                    System.out.println(porukaGreske);
                }else
                    break;
            }catch (InputMismatchException e){
                System.out.println(NIJE_CEO_BROJ);
                scanner.nextLine();
            }
        }while (true);
        return brojKojiSeUnosi;
    }

    /**
     * Generise poruku o gresci za metod unosBroja(String poruka)
     * @param poruka = String konstanta koja govori da li unosimo duzinu niza (uslov >= 5) ili broj za pretragu
     * @return String koji se odnosi na greske kod unosa broja
     */
    private static String odredjivanjePorukeGreske (String poruka){
        String porukaGreske;
        if(poruka.equals(ZA_DUZINU_NIZA)) {
            porukaGreske = NIJE_VECI_OD_4;
        }else
            porukaGreske = NIJE_CEO_BROJ;
        return porukaGreske;
    }

    /**
     * Unosi elemente niza i ponavlja samo za one elemente koji ne budu ispravno uneti
     * @param duzinaNiza = duzina niza koji se generise
     * @return int[] niz
     */
    private static int[] unosElemenataNiza(int duzinaNiza){
        int[] niz = new int[duzinaNiza];
        for(int brojac=0; brojac<duzinaNiza; ){
            System.out.printf("Unesite %d. clan niza (samo cele brojeve): %n", (brojac+1));
            try {
                niz[brojac] = scanner.nextInt();
                brojac++;
            }catch (InputMismatchException e){
                System.out.println(NIJE_CEO_BROJ);
                scanner.nextLine();
            }
        }
        return niz;
    }

    /**
     * Stampa niz
     * @param niz = niz integera koji se stampa
     */
    private static void stampanje(int[] niz){
        for(int brojac=0; brojac<5; brojac++){
            System.out.printf("%d. clan niza je %d%n",(brojac+1), niz[brojac]);
        }
    }

    /**
     * Pretrazuje niz za zadati broj
     * @param niz = niz integera koji se pretrazuje
     * @param trazeniBroj = broj koji se uporedjuje sa elementima niza
     * @return true ili false
     */
    private static boolean pronadji(int[] niz, int trazeniBroj) {
        for (int elementNiza : niz) {
            if (elementNiza == trazeniBroj)
                return true;
        }
        return false;
    }

    /**
     * Generise String poruke koja se ispisuje u zavisnosti od rezultata metoda pronadji(int[] niz, int trazeniBroj)
     * @param rezultatPretrage = boolean rezultat metoda pronadji(int[] niz, int trazeniBroj)
     * @param trazeniBroj = broj koji je korisnik uneo kao parametar za pretragu
     * @return String poruke koja se ispisuje
     */
    private static String poruka (boolean rezultatPretrage, int trazeniBroj){
        StringBuilder poruka = new StringBuilder("Broj ");
        poruka = (rezultatPretrage)?
                poruka.append(trazeniBroj).append(" je clan niza")
                : poruka.append(trazeniBroj).append(" nije clan niza");
        return poruka.toString();
    }
}