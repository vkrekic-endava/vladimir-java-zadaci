package Zadatak8;

import java.time.LocalDate;

/**
 * @author Vladimir Krekic
 */

enum Pdv{

    MLEKO_SOKOVI ("20%", .2),
    MESO_KAFE ("8%", .08);

    Pdv(String pdvNaziv, double pdvIznos) {
        this.pdvNaziv = pdvNaziv;
        this.pdvIznos = pdvIznos;
    }

    private String pdvNaziv;
    private double pdvIznos;

    public String getPdvNaziv() {
        return pdvNaziv;
    }

    public double getPdvIznos() {
        return pdvIznos;
    }
}

class Proizvod {

    private String imeProizvoda;
    private double cenaProizvoda;
    private LocalDate rokTrajanja;
    private Pdv pdv;

    protected Proizvod(String imeProizvoda, double cenaProizvoda, LocalDate rokTrajanja, Pdv pdv) {
        this.imeProizvoda = imeProizvoda;
        this.cenaProizvoda = cenaProizvoda;
        this.rokTrajanja = rokTrajanja;
        this.pdv = pdv;
    }

    public String getImeProizvoda() {
        return imeProizvoda;
    }

    public void setImeProizvoda(String imeProizvoda) {
        this.imeProizvoda = imeProizvoda;
    }

    public double getCenaProizvoda() {
        return cenaProizvoda;
    }

    public void setCenaProizvoda(double cenaProizvoda) {
        this.cenaProizvoda = cenaProizvoda;
    }

    public LocalDate getRokTrajanja() {
        return rokTrajanja;
    }

    public void setRokTrajanja(LocalDate rokTrajanja) {
        this.rokTrajanja = rokTrajanja;
    }

    public Pdv getPdv() {
        return pdv;
    }

    public void setPdv(Pdv pdv) {
        this.pdv = pdv;
    }

    @Override
    public String toString() {
        return String.format("Naziv = %s, cena = %.2f din Rok trajanja = %s PDV = %s ",
                getImeProizvoda(), getCenaProizvoda(), getRokTrajanja().toString(), getPdv().getPdvNaziv());
    }
}
