package Zadatak7;

import java.io.*;
import java.util.*;

/**
 * Zadatak 7.
 * @author Vladimir Krekic
 */

class ObradaZahteva {
    private static ObradaZahteva ourInstance = new ObradaZahteva();
    private Scanner scanner = new Scanner(System.in);

    public static ObradaZahteva getInstance() {
        return ourInstance;
    }

    private ObradaZahteva() {
    }

    /**
     * Metod za unos spiska studenata sa osvojenim poenima.
     * Sortira unetu listu
     * Poziva metod za cuvanje liste u ocene.txt
     */
    public void formirajSpisak() {
        scanner = new Scanner(System.in);
        List<Student> spisak = new ArrayList<>();

        while (true) {

            String ime = unesiIme("ime");

            String prezime = unesiIme("prezime");

            int brojPoena = unesiBrojPoena();

            Student student = new Student(ime, prezime, brojPoena);
            spisak.add(student);

            System.out.println("Zelite li da sacuvate spisak ili da nastavite sa unosom studenata%n" +
                    "('d/D' za cuvanje spiska, ostali tasteri za nastavak unosa studenata)");
            String izbor = scanner.next();
            if (izbor.equalsIgnoreCase("d")) {
                sortirajSpisak(spisak);
                sacuvaj(spisak);
                break;
            }
        }
        scanner.close();
    }

    /**
     * Cuva sortiranu listu u txt fajlu ocene.txt     *
     * @param list Lista studenata
     */
    private void sacuvaj(List<Student> list) {
        try (FileWriter fileWriter = new FileWriter("ocene.txt")) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student: list){
                bufferedWriter.write(student.prikazStudenta());
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            System.out.println("Lista sacuvana u fajlu \\vladimir-java-zadaci\\ocene.txt");
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    /**
     * Unosi ime ili prezime i proverava da se sastoji samo od slova
     * @param poruka "ime" ili "prezima"
     * @return String za ime ili prezime
     */
    private String unesiIme (String poruka){
        String ime;
        do{
            try{
                System.out.printf("Upisite %s studenta:%n", poruka);
                ime = scanner.nextLine();
                if(ime.matches("[a-zA-Z'\\s]+")) {
                    scanner.reset();
                    break;
                }
                throw new InputMismatchException();
            }catch (InputMismatchException e){
                System.out.printf("Pogresno uneto %s studenta. Molimo Vas pokusajte ponovo.%n", poruka);
                scanner.reset();
            }
        }while (true);
//        if(ime.contains(" ")) {
            ime = ime.replaceAll("^[a-z\\s]", ime.substring(ime.indexOf(" ")+1, ime.indexOf(" ") + 2).toUpperCase());
            System.out.println(ime);
        System.out.println(ime.substring(ime.indexOf(" ")+1, ime.indexOf(" ") + 2).toUpperCase());
//        }
        ime = ime.replaceAll("^[a-z]", ime.substring(0,1).toUpperCase());
        return ime;
    }

    /**
     * Unosi broj poena i proverava da li je string 0-100
     * @return int
     */
    private int unesiBrojPoena (){
        int brojPoena;
        do{
            try{
                System.out.println("Upisite broj poena (ceo broj 0-100):");
                brojPoena = scanner.nextInt();
                if(brojPoena>=0 && brojPoena<=100)
                    break;
                throw new InputMismatchException();
            }catch (InputMismatchException e){
                System.out.println("Pogresno unet broj poena. (Samo celi brojevi 0-100)");
                scanner.nextLine();
            }
        }while (true);
        return brojPoena;
    }

    /**
     * Sortira spisak: poeni od vise ka nizem, onda prirodnim redosledom prezime pa ime
     * @param list spisak studenata
     */
    private void sortirajSpisak (List<Student> list){
        list.sort(Comparator.comparing(Student::getBrojPoena)
                .reversed()
                .thenComparing(Student::getPrezimeStudenta)
                .thenComparing(Student::getImeStudenta));

    }
}