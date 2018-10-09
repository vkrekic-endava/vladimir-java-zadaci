package Zadatak5;

/**
 * Zadatak 5
 *
 * @author Vladimir.Krekic
 */

class NejednakostranicniTrougao extends Trougao{

    private double stranicaB;
    private double stranicaC;
    private static final String NAZIV = "Nejednakostranicni trougao";
    private static boolean ispravanUnos;

    public NejednakostranicniTrougao() {
    }

    public NejednakostranicniTrougao(double stranicaA, double stranicaB, double stranicaC) {
        super(stranicaA);
        if(uslov(stranicaA, stranicaB, stranicaC)){
            this.stranicaB = stranicaB;
            this.stranicaC = stranicaC;
        }else{
            System.out.println("Neispravni parametri. Zbir duzina bilo koje dve stranice mora biti veci od duzine trece stranice.");
            ispravanUnos = false;
        }


    }

    /**
     * Uslov za nejednakostranicni trougao:
     * Zbir duzina bilo koje dve stranice je veci od duzine trece stranice
     * @param stranicaA double
     * @param stranicaB double
     * @param stranicaC double
     * @return boolean true/false
     */
    private boolean uslov(double stranicaA, double stranicaB, double stranicaC){
        return (stranicaA+stranicaB>stranicaC) && (stranicaA+stranicaC>stranicaB) && (stranicaB+stranicaC>stranicaA);
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
    }

    @Override
    public double obim() {
        if(ispravanUnos)
            return getStranica()+ getStranicaB()+ getStranicaC();
        ispravanUnos = true;
        return Math.sqrt(-1);
    }

    /**
     * Povrsina trougla se racuna po Heronovoj formuli:
     * P = sqrt(s*(s-a)*(s-b)*(s-c)) gde je s=(a+b+c)/2
     * @return double vrednost za povrsinu ili -1 za pogresno unete parametre u konstruktoru
     */
    @Override
    public double povrsina() {
        if(ispravanUnos){
            double poluObim = obim()/2;
            return Math.sqrt(poluObim*(poluObim-getStranica())
                    *(poluObim-getStranicaB())*(poluObim-getStranicaC()));
        }
        return Math.sqrt(-1);
    }

    @Override
    public String toString() {
        return String.format
                ("%s%n*****************%nObim: %.4f%nPovrsina: %.4f%n*****************%n",
                        NAZIV, obim(), povrsina());
    }
}
