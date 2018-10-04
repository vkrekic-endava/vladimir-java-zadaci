package Zadatak5;

/**
 * Zadatak 5
 *
 * @author Vladimir.Krekic
 */

class NejednakostranicniTrougao extends Trougao{

    private double stranica2;
    private double stranica3;
    private static final String NAZIV = "Nejednakostranicni trougao";

    public NejednakostranicniTrougao() {
    }

    public NejednakostranicniTrougao(double stranica, double stranica2, double stranica3) {
        super(stranica);
        this.stranica2 = stranica2;
        this.stranica3 = stranica3;
    }

    public double getStranica2() {
        return stranica2;
    }

    public void setStranica2(double stranica2) {
        this.stranica2 = stranica2;
    }

    public double getStranica3() {
        return stranica3;
    }

    public void setStranica3(double stranica3) {
        this.stranica3 = stranica3;
    }

    //napisati kod
    public double visina(){
        double sum = getStranica()+getStranica2()+getStranica3();
        return (2/getStranica())*Math.sqrt(sum*(sum-getStranica())*(sum-getStranica2())*(sum-getStranica3()));
    }

    @Override
    public double obim() {
        return getStranica()+getStranica2()+getStranica3();
    }

    @Override
    public double povrsina() {
        return getStranica()*visina()/2;
    }

    @Override
    public String toString() {
        return String.format
                ("%s\n*****************\nObim: %.4f\nPovrsina: %.4f\n*****************\n",
                        NAZIV, obim(), povrsina());
    }
}
