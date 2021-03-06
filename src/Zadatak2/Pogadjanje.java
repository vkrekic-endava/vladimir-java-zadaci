package Zadatak2;

/**
 *   Napisati program za pogađanje slučajno generisanog broja u opsegu od 1 do 50.
 *   Program treba da radi na sledeći način: Korisnik preko standardnog ulaza unosi jedan ceo broj.
 *   Broj koji treba pogoditi generisati “random” u opsegu od 1 do 50.
 *   Vrteti se u petlji dok ne pogodimo broj, ili budemo barem blizu (ako je razlika između brojeva 5 ili manja).
 *   Taj deo sa proverom pogotka izdvojiti u zasebnu metodu, kojoj se kao argument prosleđuje broj koji tipujemo,
 *   a povratna vrednost metode je 0 – ako smo pogodili, 1 – ako smo bili blizu, 2 – ako smo promašili.
 *   U zavisnosti od rezultata pogađanja ispisati i odgovarajuću poruku.
 *   Nakon odigrane partije proveriti da li korisnik zeli da prekine ili da nastavi igru.
 *
 * @author Vladimir Krekic
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Pogadjanje {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random randomNumber = new Random();

        do {
            int pogodi = randomNumber.nextInt(50) + 1;

            boolean pogodak = false;

            while (!pogodak) {

                int broj = unos();

                int rezultat = provera(pogodi, broj);

                if (rezultat == 0) {
                    System.out.println("Pogodili ste");
                    pogodak = true;
                } else if (rezultat == 1) {
                    System.out.println("Blizu ste");
                    pogodak = true;
                } else System.out.println("Niste pogodili. Pokusajte ponovo.");
            }

        }while(ponovo());

        scanner.close();

    }

    /**
     * Unos broja i provera ispravnosti
     * @return ceo broj ako je izmedju 1 i 50
     */
    private static int unos(){
        boolean ispravno = true;
        int broj = 0;
        while (ispravno){
            System.out.println("Upisi broj izmedju 1 i 50: ");
            try {
                broj = scanner.nextInt();
                if(broj > 50 || broj < 1){
                    System.out.println("Niste uneli broj izmedju 1 i 50.\nPokusajte ponovo.");
                    continue;
                }
            }catch (InputMismatchException e){
                System.out.println("Niste uneli broj.\nPokusajte ponovo.");
                scanner.nextLine();
                continue;
            }
            ispravno = false;
        }
        return broj;
    }

    /**
     * Provera preciznosti pogadjanja
     * @return 0 ako je tacan pogodak, 1 ako je razlika manja ili jednaka 5 i 2 ako nije ispunjen ni jedan od gornjih uslova
     * @param rndNumber = slucajno generisan ceo broj izmedju 1 i 50
     * @param broj = ceo broj izmedju 1 i 50 koga unosi korisnik radi poredjenja
     */
    private static int provera(int rndNumber, int broj){
        if(rndNumber==broj)
            return 0;
        if(Math.abs(rndNumber-broj)<=5)
            return 1;
        return 2;
    }

    /**
     * Pita korisnika da li zeli da ponovo igra
     * @return true za "d" i false za sve ostale karaktere
     */
    private static boolean ponovo(){
        System.out.println("Zelite li da igrate ponovo (d/n)");
        String izbor = scanner.next();
        return izbor.equalsIgnoreCase("d");
    }
}
