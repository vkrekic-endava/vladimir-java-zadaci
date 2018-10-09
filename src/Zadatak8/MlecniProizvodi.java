package Zadatak8;

import java.time.LocalDate;

/**
 * @author Vladimir Krekic
 */

class MlecniProizvodi extends Proizvod{

    private String porekloProizvoda;

    protected MlecniProizvodi(String imeProizvoda, double cenaProizvoda, LocalDate rokTrajanja, Pdv pdv, String porekloProizvoda) {
        super(imeProizvoda, cenaProizvoda, rokTrajanja, pdv);
        this.porekloProizvoda = porekloProizvoda;
    }

    public String getPorekloProizvoda() {
        return porekloProizvoda;
    }

    public void setPorekloProizvoda(String porekloProizvoda) {
        this.porekloProizvoda = porekloProizvoda;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Poreklo proizvoda = %s", getPorekloProizvoda());
    }
}
