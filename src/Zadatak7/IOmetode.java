package Zadatak7;

import java.io.*;
import java.util.*;

/**
 * Zadatak 7.
 * @author Vladimir Krekic
 */

class IOmetode {
    private static IOmetode ourInstance = new IOmetode();
    private static Scanner scanner = new Scanner(System.in);

    public static IOmetode getInstance() {
        return ourInstance;
    }

    private IOmetode() {
    }

    /**
     * Metod za unos spiska studenata sa osvojenim poenima.
     * Sortira unetu listu
     * Poziva metod za cuvanje liste u ocene.txt
     */
    public void formirajSpisak() {
        scanner = new Scanner(System.in);
        ArrayList<Student> spisak = new ArrayList<>();

        while (true) {

            String ime = unesiIme("ime");

            String prezime = unesiIme("prezime");

            int brojPoena = unesiBrojPoena();

            Student student = new Student(ime, prezime, brojPoena);
            spisak.add(student);

            System.out.println("Zelite li da sacuvate uneto ('d/D' za DA, ostali tasteri za nastavak unosa)");
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
    private void sacuvaj(ArrayList<Student> list) {
        try (FileWriter fileWriter = new FileWriter("ocene.txt")) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student: list){
                bufferedWriter.write(student.toString());
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
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
                ime = scanner.next("[a-zA-Z]+");
                break;
            }catch (InputMismatchException e){
                System.out.printf("Pogresno uneto %s studenta. Molimo Vas pokusajte ponovo.%n", poruka);
                scanner.nextLine();
            }
        }while (true);
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
            }catch (InputMismatchException e){
            }
            System.out.println("Pogresno unet broj poena. Samo celi brojevi 0-100)");
            scanner.nextLine();
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