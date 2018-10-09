package Zadatak8;

import java.time.LocalDate;

/**
 * @author Vladimir Krekic
 */

class Meso extends Proizvod{

    private String vrsta;

    protected Meso(String imeProizvoda, double cenaProizvoda, LocalDate rokTrajanja, Pdv pdv, String vrsta) {
        super(imeProizvoda, cenaProizvoda, rokTrajanja, pdv);
        this.vrsta = vrsta;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Vrsta = %s", getVrsta());
    }
}
