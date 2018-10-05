package Zadatak5;

/**
 * Zadatak 5
 *
 * @author Vladimir.Krekic
 */

class Trougao extends GeometrijskaSlika {

    private double stranica;
    private static final String NAZIV = "Trougao - jednakostranicni trougao";

    public Trougao() {
    }

    public Trougao(double stranica) {
        this.stranica = stranica;
    }

    public double getStranica() {
        return stranica;
    }

    public void setStranica(double stranica) {
        this.stranica = stranica;
    }

    public double obim(){
        return getStranica()*3;
    }

    public double povrsina(){
        return getStranica()*Math.sqrt(3)/4;
    }

    @Override
    public String toString() {
        return String.format
                ("%s%n*****************%nObim: %.4f%nPovrsina: %.4f%n*****************%n",
                        NAZIV, obim(), povrsina());
    }
}
