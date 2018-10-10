package Zadatak8;

import java.time.LocalDate;

/**
 * @author Vladimir Krekic
 */

enum ZrnoMlevena{
    U_ZRNU("U zrnu"),
    MLEVENA("Mlevena");

    ZrnoMlevena(String oblik) {
        this.oblik = oblik;
    }

    private  String oblik;

    public String getOblik() {
        return oblik;
    }
}

class Kafe extends KafeSokovi{

    private ZrnoMlevena oblik;

    protected Kafe(String imeProizvoda, double cenaProizvoda, LocalDate rokTrajanja, Pdv pdv, ZrnoMlevena oblik) {
        super(imeProizvoda, cenaProizvoda, rokTrajanja, pdv);
        this.oblik = oblik;
    }

    public ZrnoMlevena getOblik() {
        return oblik;
    }

    public void setOblik(ZrnoMlevena oblik) {
        this.oblik = oblik;
    }

    @Override
    public String zaStampanje() {
        return super.zaStampanje()+String.format("Oblik = %s", getOblik().getOblik());
    }
}
