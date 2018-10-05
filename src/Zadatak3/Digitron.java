 package Zadatak3;

/**
 *   ZADATAK3: Napisati program koji će predstavljati jednostavan digitron.
 *   Program treba da radi tako što korisnik unese dva cela broja, zatim kod operacije
 *   koju želi da izvrši (‘s’ – sabiranje, ‘o’ – oduzimanje, ‘m’ – množenje, ‘d’ – deljenje).
 *   Kao rezultat se očekuje ispisivanje rezultata te operacije nad unetim operandima.
 *   Sve operacije smestiti u posebne metode.
 *   Vrteti se u petlji, sve dok se za kod operacije ne unese nepostojeći kod.
 *
 * @author Vladimir Krekic
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class Digitron {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean petlja = true;

        do {

            long broj1 = unosBroja("prvi");
            long broj2 = unosBroja("drugi");

            System.out.println("Izaberite operaciju%n‘s’ – sabiranje,%n" +
                    "‘o’ – oduzimanje,%n‘m’ – množenje,%n‘d’ – deljenje%n" +
                    "ostali karakteri za izlaz");
            String izbor = scanner.next();

            switch (izbor) {
                case "s":
                    System.out.printf("Rezultat sabiranja brojeva %d i %d je %d%n", broj1, broj2, sabiranje(broj1, broj2));
                    petlja = ponovo();
                    break;
                case "o":
                    System.out.printf("Rezultat oduzimanja brojeva %d i %d je %d%n", broj1, broj2, oduzimanje(broj1, broj2));
                    petlja = ponovo();
                    break;
                case "m":
                    System.out.printf("Rezultat mnozenja brojeva %d i %d je %d%n", broj1, broj2, mnozenje(broj1, broj2));
                    petlja = ponovo();
                    break;
                case "d":
                    if (broj2 == 0){
                        System.out.println("Ne mozete deliti sa nulom");
                        petlja = ponovo();
                        break;
                    }else {
                        System.out.printf("Rezultat deljenja brojeva %d i %d je %f%n", broj1, broj2, deljenje(broj1, broj2));
                        petlja = ponovo();
                        break;
                    }
                default:
                    petlja = false;
            }

        }while(petlja);

        scanner.close();
    }

    private static long sabiranje(long broj1, long broj2){
        return broj1+broj2;
    }

    private static long oduzimanje(long broj1, long broj2){
        return broj1-broj2;
    }

    private static long mnozenje(long broj1, long broj2){
        return broj1*broj2;
    }

    private static double deljenje(long br1, long br2){
            return (double) br1/br2;
    }

    /**
     * Unos i provera ispravnosti unetih parametara
     * @param redosled redosled brojeva (prvi, drugi)
     * @return vraca uneti broj u long formatu
     */
    private static long unosBroja(String redosled){
        long broj;
        do {
            System.out.println("Unesite " + redosled + " ceo broj: ");
            try {
                broj = scanner.nextLong();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Niste uneli ceo broj!%nMolim Vas pokusajte ponovo");
                scanner.nextLine();
            }
        }while(true);
        return broj;
    }

    /**
     * Pita korisnika da li zeli ponovo da racuna
     * Ako izabere "d" racuna ponovo, svi ostali izbori su Ne
     * @return vraca true ili false
     */
    private static boolean ponovo(){
        System.out.println("%nZelite li ponovo da racunate%n d za DA, ostali karakteri za izlaz");
        String izbor = scanner.next();
        return izbor.equalsIgnoreCase("d");
    }
}
