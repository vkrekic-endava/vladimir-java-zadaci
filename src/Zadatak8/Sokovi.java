import java.time.LocalDate;

/**
 * @author Vladimir Krekic
 */

class Sokovi extends KafeSokovi{

    private String sirovina;

    protected Sokovi(String imeProizvoda, double cenaProizvoda, LocalDate rokTrajanja, Pdv pdv, String sirovina) {
        super(imeProizvoda, cenaProizvoda, rokTrajanja, pdv);
        this.sirovina = sirovina;
    }

    public String getSirovina() {
        return sirovina;
    }

    public void setSirovina(String sirovina) {
        this.sirovina = sirovina;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Sirovina = %s", getSirovina());
    }
}
