package Zadatak7;

/**
 * Zadatak 7.
 * @author Vladimir Krekic
 */

class Student {

    private String imeStudenta;
    private String prezimeStudenta;
    private Integer brojPoena;
    private int ocena;

    public Student(String imeStudenta, String prezimeStudenta, int brojPoena) {
        // dodaj za prvo veliko slovo
        //ovo mora u metodu da bih ga vracao dok god ne pogodi
        if(imeStudenta.matches("[a-zA-Z']")){
            this.imeStudenta = imeStudenta;
        }else
            this.imeStudenta = "Pogresno uneto ime";

        this.prezimeStudenta = prezimeStudenta;
        this.brojPoena = brojPoena;
        this.ocena = setOcena(brojPoena);
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public String getPrezimeStudenta() {
        return prezimeStudenta;
    }

    public void setPrezimeStudenta(String prezimeStudenta) {
        this.prezimeStudenta = prezimeStudenta;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public int getOcena() {
        return ocena;
    }

    public int setOcena(int brojPoena) {
        if(brojPoena<51)
            return 5;
        return (brojPoena-1)/10;
    }

    public String prikazStudenta() {
        return String.format("%s %s: poena %d, ocena %d%n",
                getImeStudenta(), getPrezimeStudenta(), getBrojPoena(),getOcena());
    }

}
