package Zadatak8;

import java.time.LocalDate;

/**
 * @author Vladimir Krekic
 */

class KafeSokovi extends Proizvod{
    protected KafeSokovi(String imeProizvoda, double cenaProizvoda, LocalDate rokTrajanja, Pdv pdv) {
        super(imeProizvoda, cenaProizvoda, rokTrajanja, pdv);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
