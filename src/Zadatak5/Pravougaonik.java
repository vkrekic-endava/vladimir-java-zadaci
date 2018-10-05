package Zadatak5;

/**
 * Zadatak 5
 *
 * @author Vladimir.Krekic
 */

class Pravougaonik extends Kvadrat{

    private double drugaStranica;
    private static final String NAZIV = "Pravougaonik";

    public Pravougaonik() {
    }

    public Pravougaonik(double stranica, double drugaStranica) {
        super(stranica);
        this.drugaStranica = drugaStranica;
    }

    public double getDrugaStranica() {
        return drugaStranica;
    }

    public void setDrugaStranica(double drugaStranica) {
        this.drugaStranica = drugaStranica;
    }

    @Override
    public double obim() {
        return 2*getDrugaStranica()+2*getStranica();
    }

    @Override
    public double povrsina() {
        return getDrugaStranica()*getStranica();
    }

    @Override
    public String toString() {
        return String.format
                ("%s%n*****************%nObim: %.4f%nPovrsina: %.4f%n*****************%n",
                        NAZIV, obim(), povrsina());
    }
}
